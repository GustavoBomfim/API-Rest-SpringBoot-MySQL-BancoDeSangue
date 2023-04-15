package com.wktechnology.BancoDeSangue.model.service;

import com.wktechnology.BancoDeSangue.model.Doador;
import com.wktechnology.BancoDeSangue.model.dto.DoadorDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DoadorService {

    DoadorDTO dao;



    private final DoadorRepository doadorRepository;

    public DoadorService(DoadorRepository doadorRepository) {
        this.doadorRepository = doadorRepository;
    }

    public Map<String, Integer> agruparDoadoresPorEstado(){
        List<Doador> doadores = doadorRepository.findAll();
        return dao.agruparDoadoresPorEstado2(doadores);
    }
}
