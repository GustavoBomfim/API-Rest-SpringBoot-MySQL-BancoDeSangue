package com.wktechnology.BancoDeSangue.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String endereco;
    private String cep;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;


    public Endereco(DadosCadastroEndereco dados) {
        this.endereco = dados.endereco();
        this.cep = dados.cep();
        this.numero = dados.numero();
        this.bairro = dados.bairro();
        this.cidade = dados.cidade();
        this.estado = dados.estado();
    }


}
