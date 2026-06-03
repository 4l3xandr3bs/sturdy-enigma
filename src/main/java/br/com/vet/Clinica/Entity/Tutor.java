package br.com.vet.Clinica.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     
    private Integer idTutor;
    @Column(nullable = false, length = 40)
    private String nomeTutor;
     @Column(nullable = false, length = 40)
    private String enderecoTutor;
    @Column(nullable = false, length = 40)
    private Integer telefoneTutor;
   
 
}
