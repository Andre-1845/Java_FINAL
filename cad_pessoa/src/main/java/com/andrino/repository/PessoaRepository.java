package com.andrino.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrino.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
