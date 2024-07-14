package com.aline.forum.models;

import com.aline.forum.enums.StatusTopicoEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "topico")
@Data
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "titulo")
    private String titulo;
    @Column(name = "mensagem")
    private String mensagem;
    @Column(name = "dataCriacao")
    private LocalDateTime dataCriacao = LocalDateTime.now();
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusTopicoEnum status = StatusTopicoEnum.NAO_RESPONDIDO;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @OneToMany(mappedBy = "topico")
    private List<Resposta> respostas = new ArrayList<>();


}
