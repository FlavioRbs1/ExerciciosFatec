package com.Flavio.Clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Flavio.Clientes.model.Cliente;


public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

	
}
