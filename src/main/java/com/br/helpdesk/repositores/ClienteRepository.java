package com.br.helpdesk.repositores;
import org.springframework.data.jpa.repository.JpaRepository;

import com.br.helpdesk.domain.Cliente;

public interface  ClienteRepository extends JpaRepository<Cliente, Integer>{

}
