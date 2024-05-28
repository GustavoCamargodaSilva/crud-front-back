package com.gustavo.projetocrud;

import com.gustavo.projetocrud.entities.Cliente;
import com.gustavo.projetocrud.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class ProjetocrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetocrudApplication.class, args);
	}

}
