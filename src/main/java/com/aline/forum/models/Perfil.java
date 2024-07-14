package com.aline.forum.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "perfis")
@Data
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome")
    private String nome;

}
