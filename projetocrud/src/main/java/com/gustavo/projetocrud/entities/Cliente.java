package com.gustavo.projetocrud.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cpf;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(updatable = false)
    private LocalDate dataCadastro;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @PrePersist
    public void prePersist(){
        this.dataCadastro = LocalDate.now();
    }
}
