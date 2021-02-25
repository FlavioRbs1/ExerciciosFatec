package com.Flavio.Clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Flavio.Clientes.model.Cliente;
import com.Flavio.Clientes.repository.ClienteRepository;

@SpringBootApplication
public class ClientesApplication {

	public CommandLineRunner run(@Autowired ClienteRepository repository) {
		return args -> {
			Cliente cliente = Cliente.builder().cpf("00000000000").Nome("Fulano").build();
			repository.save(cliente);
			
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
