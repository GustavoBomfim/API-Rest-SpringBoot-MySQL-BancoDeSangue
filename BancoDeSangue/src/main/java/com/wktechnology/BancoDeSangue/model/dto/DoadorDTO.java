package com.wktechnology.BancoDeSangue.model.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.wktechnology.BancoDeSangue.model.Doador;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoadorDTO {

    private String nome;
    private String cpf;
    private String rg;
    @JsonProperty(value = "data_nasc")
    private String dataNasc;
    private String sexo;
    private String mae;
    private String pai;
    private Double altura;
    private int peso;
    @JsonProperty(value = "tipo_sanguineo")
    private String tipoSanguineo;
    private String endereco;
    private String cep;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    @JsonProperty(value = "telefone_fixo")
    private String telefoneFixo;
    private String celular;
    private String email;

    public Doador toEntity() {
        Doador entity = new Doador();
        entity.setNome(nome);
        entity.setCpf(cpf);
        entity.setRg(rg);
        entity.setDataNasc(dataNasc);
        entity.setSexo(sexo);
        entity.setMae(mae);
        entity.setPai(pai);
        entity.setAltura(altura);
        entity.setPeso(peso);
        entity.setTipoSanguineo(tipoSanguineo);
        entity.setEndereco(endereco);
        entity.setCep(cep);
        entity.setNumero(numero);
        entity.setBairro(bairro);
        entity.setCidade(cidade);
        entity.setEstado(estado);
        entity.setTelefoneFixo(telefoneFixo);
        entity.setCelular(celular);
        entity.setEmail(email);

        return entity;
    }

    public DoadorDTO toDTO(Doador entity){
        DoadorDTO dto = new DoadorDTO();

        if(entity != null){
            dto.setNome(entity.getNome());
            dto.setCpf(entity.getCpf());
            dto.setCpf(entity.getCpf());
            dto.setRg(entity.getRg());
            dto.setDataNasc(entity.getDataNasc());
            dto.setSexo(entity.getSexo());
            dto.setMae(entity.getMae());
            dto.setPai(entity.getPai());
            dto.setAltura(entity.getAltura());
            dto.setPeso(entity.getPeso());
            dto.setTipoSanguineo(entity.getTipoSanguineo());
            dto.setEndereco(entity.getEndereco());
            dto.setCep(entity.getCep());
            dto.setNumero(entity.getNumero());
            dto.setBairro(entity.getBairro());
            dto.setCidade(entity.getCidade());
            dto.setEstado(entity.getEstado());
            dto.setTelefoneFixo(entity.getTelefoneFixo());
            dto.setCelular(entity.getCelular());
            dto.setEmail(entity.getEmail());
        }
        return dto;
    }

    public Map<String, Integer> agruparDoadoresPorEstado2(List<Doador> doadores) {

        boolean moradorDoEstado = estado.equals(estado);

        Map<String, Integer> quantidadeDeMoradorPorEstado = new HashMap<>();

        for (Doador doador : doadores) {
            if (doador.getEstado().equals(estado)) {
                quantidadeDeMoradorPorEstado.put(estado, 1);
            }
        }
        return quantidadeDeMoradorPorEstado;
    }
}
