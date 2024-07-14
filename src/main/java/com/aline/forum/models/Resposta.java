package com.aline.forum.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "resposta")
@Data
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "mensagem")
    private String mensagem;

    @Column(name = "dataCriacao")
    private LocalDateTime dataCriacao = LocalDateTime.now();

    @Column(name = "solucao")
    private Boolean solucao = false;

    @ManyToOne
    private Topico topico;

    @ManyToOne
    private Usuario autor;



}
