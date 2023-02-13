package com.wktechnology.BancoDeSangue.doador;

import com.wktechnology.BancoDeSangue.contato.Contato;
import com.wktechnology.BancoDeSangue.contato.DadosCadastroContato;
import com.wktechnology.BancoDeSangue.endereco.DadosCadastroEndereco;
import com.wktechnology.BancoDeSangue.endereco.Endereco;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.Email;

import java.sql.Date;

public record DadosCadastroDoador(
        String nome,
        String cpf,
        String rg,
        Date dataNasc,
        String sexo,
        String mae,
        String pai,
        DadosCadastroEndereco endereco,
        DadosCadastroContato contato,
        Double altura,
        int peso,
        TipoSanguineo tipoSanguineo) {
}
