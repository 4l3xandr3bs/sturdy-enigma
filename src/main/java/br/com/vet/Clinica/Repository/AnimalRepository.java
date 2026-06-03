package br.com.vet.Clinica.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.vet.Clinica.Entity.Animal;
public  interface  AnimalRepository  extends JpaRepository<Animal, Integer>{
    
}
