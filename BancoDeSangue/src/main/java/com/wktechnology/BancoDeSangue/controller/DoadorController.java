package com.wktechnology.BancoDeSangue.controller;

import com.wktechnology.BancoDeSangue.doador.DadosCadastroDoador;
import com.wktechnology.BancoDeSangue.doador.Doador;
import com.wktechnology.BancoDeSangue.doador.DoadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doadores")
public class DoadorController {
    @Autowired
    DoadorRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroDoador dados){
        //repository.save(new Doador(dados));
        System.out.println("Registros \n \n" +  dados);
    }
}
