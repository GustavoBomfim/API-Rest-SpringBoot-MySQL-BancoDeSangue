package com.wktechnology.BancoDeSangue.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;



@Entity (name = "Doador")
@Table(name = "doadores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doador {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    //@Column(name = "data_nasc")
    @JsonProperty(value = "data_nasc")
    private String dataNasc;
    private String sexo;
    private String mae;
    private String pai;
    private Double altura;
    private int peso;
    private String endereco;
    private String cep;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    @JsonProperty(value = "telefone_fixo")
    private String telefoneFixo;
    private String celular;
    // @Email
    private String email;
    @JsonProperty(value = "tipo_sanguineo")
    private String tipoSanguineo;

}
