package com.wktechnology.BancoDeSangue.doador;

import com.wktechnology.BancoDeSangue.contato.Contato;
import com.wktechnology.BancoDeSangue.endereco.Endereco;

public class Doador {
    private String nome;
    private String cpf;
    private String rg;
    // escolher o nome da tabela como data_nasc
    private String dataNasc;
    private String sexo;
    private String mae;
    private String pai;
    private String email;
    private String cep;
    private Endereco endereco;
    private Contato contato;
    private Double altura;
    private int peso;
    // escolher o nome da tabela como tipo_sanguineo
    private TipoSanguineo tipoSanguineo;
}
