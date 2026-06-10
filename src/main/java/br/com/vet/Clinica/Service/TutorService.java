package br.com.vet.Clinica.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.vet.Clinica.Entity.Tutor;
import br.com.vet.Clinica.Repository.TutorRepository;

@Service
public class TutorService {
    
    @Autowired
    private TutorRepository tutorRepository;

    public Tutor save(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    public List<Tutor> findAll() {
        return tutorRepository.findAll();
    }

    public Tutor findById(Integer id) {
        return tutorRepository.findById(id).orElse(null);
    }

    public void deleteById(Integer id) {
        tutorRepository.deleteById(id);
    }

    public Tutor update(Integer id, Tutor tutorAtualizado) {
        Tutor tutor = findById(id);
        if (tutor != null) {
            tutor.setNomeTutor(tutorAtualizado.getNomeTutor());
            tutor.setEnderecoTutor(tutorAtualizado.getEnderecoTutor());
            tutor.setTelefoneTutor(tutorAtualizado.getTelefoneTutor());
            return tutorRepository.save(tutor);
        }
        return null;
    }
}
