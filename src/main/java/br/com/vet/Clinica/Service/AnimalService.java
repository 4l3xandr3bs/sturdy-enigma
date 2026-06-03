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

    
    public Animal save(Animal animal ){
        return animalRepository.save(animal);
  
    }

    public List<Animal> findAll(){
      return animalRepository.findAll();
    }
     public void deleteById(Integer id){
        animalRepository.deleteById(id);
      }
      public Animal findById(Integer id){
          return animalRepository.findById(id).orElse(null);
      };
}