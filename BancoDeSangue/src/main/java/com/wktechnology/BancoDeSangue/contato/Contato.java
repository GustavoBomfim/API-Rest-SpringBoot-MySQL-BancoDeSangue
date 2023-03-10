package com.wktechnology.BancoDeSangue.contato;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Contato {
    //@Column(name = "telefone_fixo")
    private String telefone_fixo;
    private String celular;
    @Email
    private String email;

    public Contato(DadosCadastroContato dados){
        this.telefone_fixo = dados.telefone_fixo();
        this.celular = dados.celular();
        this.email = dados.email();

    }
}
