package com.wktechnology.BancoDeSangue.doador;

import java.io.Serializable;

public enum TipoSanguineo  {
    A_POSITIVO("A+"),
    A_NEGATIVO("A-"),
    B_POSITIVO("B+"),
    B_NEGATIVO("B-"),
    AB_POSITIVO("AB+"),
    AB_NEGATIVO("AB-"),
    O_POSITIVO("O+"),
    O_NEGATIVO("O-");

    private String tipoSanguineoSimbolo;

    private TipoSanguineo(String tipoSanguineoSimbolo){
        this.tipoSanguineoSimbolo = tipoSanguineoSimbolo;
    }
    public String getTipoSanguineoSimbolo(){
        return getTipoSanguineoSimbolo();
    }

}
