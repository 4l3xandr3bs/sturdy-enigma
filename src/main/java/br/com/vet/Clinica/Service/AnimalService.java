package br.com.vet.Clinica.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.vet.Clinica.Entity.Animal;
import br.com.vet.Clinica.Repository.AnimalRepository;

@Service
public class AnimalService {
    
    @Autowired
    private AnimalRepository animalRepository;

    public Animal save(Animal animal) {
        return animalRepository.save(animal);
    }

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public Animal findById(Integer id) {
        return animalRepository.findById(id).orElse(null);
    }

    public void deleteById(Integer id) {
        animalRepository.deleteById(id);
    }

    public Animal update(Integer id, Animal animalAtualizado) {
        Animal animal = findById(id);
        if (animal != null) {
            animal.setNomeAnimal(animalAtualizado.getNomeAnimal());
            animal.setIdadeAnimal(animalAtualizado.getIdadeAnimal());
            animal.setRacaAnimal(animalAtualizado.getRacaAnimal());
            animal.setTutor(animalAtualizado.getTutor());
            return animalRepository.save(animal);
        }
        return null;
    }
}
