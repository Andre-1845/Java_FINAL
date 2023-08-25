package br.com.baumgratz.ctrl_efetivos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.baumgratz.ctrl_efetivos.model.Pessoal;

@Repository
public interface PessoalRepository extends JpaRepository<Pessoal, Long>{

}
