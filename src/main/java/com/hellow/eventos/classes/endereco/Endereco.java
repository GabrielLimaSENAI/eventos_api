package com.hellow.eventos.classes.endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="endereço")
@Table(name="endereço")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

            private Integer id;
            private String Logradouro;
            private String nome;
            private String número;
            private String cep;
            private String bairro;
            private String cidade;
            private String estado;
            private String país;
            private String complemento;

            @ManyToOne
            private Tipo tipo;




}
