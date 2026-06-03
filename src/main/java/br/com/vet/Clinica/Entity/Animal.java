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
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     
    private Integer idCliente;
    @Column(nullable = false, length = 40)
    private String nomeCliente;
     @Column(nullable = false, length = 40)
    private String enderecoCliente;
    @Column(nullable = false, length = 40)
    private String telefoneCliente;
    private Integer idadeCliente;
    @Column(nullable = false, length  = 9)
    private Integer cpfCliente;
}
