package br.com.vet.Clinica.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.vet.Clinica.Entity.Tutor;
public  interface  TutorRepository  extends JpaRepository<Tutor, Integer>{
    
}