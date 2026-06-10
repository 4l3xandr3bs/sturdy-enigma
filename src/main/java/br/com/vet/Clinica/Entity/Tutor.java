package br.com.vet.Clinica.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tutor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTutor;
    
    @Column(nullable = false, length = 100)
    private String nomeTutor;
    
    @Column(nullable = false, length = 150)
    private String enderecoTutor;
    
    @Column(nullable = false)
    private Integer telefoneTutor;
}
