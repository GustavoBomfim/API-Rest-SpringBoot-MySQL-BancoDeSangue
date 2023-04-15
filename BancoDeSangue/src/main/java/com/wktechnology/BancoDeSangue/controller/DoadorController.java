package com.wktechnology.BancoDeSangue.controller;

import com.wktechnology.BancoDeSangue.model.dto.DoadorDTO;
import com.wktechnology.BancoDeSangue.model.Doador;
import com.wktechnology.BancoDeSangue.model.service.DoadorRepository;
import com.wktechnology.BancoDeSangue.model.service.DoadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/doadores")
public class DoadorController {
    @Autowired
    DoadorRepository repository;

    @Autowired
    DoadorService service;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DoadorDTO dto){
        Doador doador = dto.toEntity();
        repository.save(doador);
    }

    @GetMapping
    public List<Doador> doadores(){
        return repository.findAll();
    }
    @PostMapping(value = "/salvarLista")
    @Transactional
    public void salvarLista(@RequestBody List<DoadorDTO> dtoList){

        for(DoadorDTO doador : dtoList){
            Doador entity = doador.toEntity();
            repository.save(entity);
        }
    }

    // ainda nao funciona
    @GetMapping(value = "/quantidadeDeDoadoresPorEstadoBrasileiro")
    public Map<String, Integer> quantidadeDeDoadoresPorEstadoBrasileiro(){
         return service.agruparDoadoresPorEstado();
    }


}
