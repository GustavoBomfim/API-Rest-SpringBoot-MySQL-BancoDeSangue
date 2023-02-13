package com.wktechnology.BancoDeSangue.doador;

import com.wktechnology.BancoDeSangue.contato.Contato;
import com.wktechnology.BancoDeSangue.endereco.Endereco;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Entity (name = "Doador")
@Table(name = "doadores")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doador {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    @Column(name = "data_nasc")
    private Date dataNasc;
    private String sexo;
    private String mae;
    private String pai;
    @Embedded
    private Endereco endereco;
    @Embedded
    private Contato contato;
    private Double altura;
    private int peso;
    // escolher o nome da tabela como tipo_sanguineo
    @Embedded
    private TipoSanguineo tipoSanguineo;

    public Doador(DadosCadastroDoador dados) {
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.rg = dados.rg();
        this.dataNasc = dados.dataNasc();
        this.sexo = dados.sexo();
        this.mae = dados.mae();
        this.pai = dados.pai();
        this.endereco = new Endereco(dados.endereco());
        this.contato = new Contato(dados.contato());
        this.altura = dados.altura();
        this.peso = dados.peso();
        this.tipoSanguineo = dados.tipoSanguineo();


    }
}
