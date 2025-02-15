package com.br.helpdesk.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.helpdesk.domain.Chamado;

public interface  ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
