package com.wktechnology.BancoDeSangue.model.service;

import com.wktechnology.BancoDeSangue.model.Doador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoadorRepository extends JpaRepository<Doador, Long> {

}
