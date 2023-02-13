package com.wktechnology.BancoDeSangue.contato;

import jakarta.persistence.Column;

public record DadosCadastroContato(

        String telefoneFixo,
        String celular,
        String email

) {
}
