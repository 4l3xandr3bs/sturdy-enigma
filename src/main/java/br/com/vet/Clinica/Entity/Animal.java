package br.com.vet.Clinica.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "animal")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAnimal;
    
    @Column(nullable = false, length = 40)
    private String nomeAnimal;
    
    @Column(nullable = false)
    private Integer idadeAnimal;
    
    @Column(nullable = false, length = 40)
    private String racaAnimal;
    
    @ManyToOne
    @JoinColumn(name = "idTutor_fk", nullable = false)
    private Tutor tutor;
}
