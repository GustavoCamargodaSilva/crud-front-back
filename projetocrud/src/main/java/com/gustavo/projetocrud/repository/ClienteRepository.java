package com.gustavo.projetocrud.repository;

import com.gustavo.projetocrud.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Integer> {

}
