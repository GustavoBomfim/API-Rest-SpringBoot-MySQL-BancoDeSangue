package com.wktechnology.BancoDeSangue.contato;

import jakarta.persistence.Column;

public record DadosCadastroContato(

        String telefone_fixo,
        String celular,
        String email

) {
}
