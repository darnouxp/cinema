package com.cinema.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "categorie", schema = "cinema", catalog = "")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_cat", nullable = false)
    private long codeCat;

    @Basic
    @Column(name = "libelle_cat", nullable = false, length = 100)
    private String libelleCat;

    @Basic
    @Column(name = "image", nullable = false, length = 100)
    private String image;
}
