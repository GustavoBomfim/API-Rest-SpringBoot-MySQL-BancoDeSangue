package com.wktechnology.BancoDeSangue.endereco;

public record DadosCadastroEndereco(
        String endereco,
        String cep,
        int numero,
        String bairro,
        String cidade,
        String estado) {
}
