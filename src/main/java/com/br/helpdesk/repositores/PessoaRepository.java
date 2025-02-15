package com.br.helpdesk.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.helpdesk.domain.Pessoa;

public interface  PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
