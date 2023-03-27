/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.Cursos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tema {

    @Override
    public String toString() {
        return "Tema{" + "id_tema=" + id_tema + ", nombre=" + nombre + ", descripcion=" + descripcion + ", curso=" + curso + '}';
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tema;
    private String nombre;
    private String descripcion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="curso.id_curso")
    private Curso curso;
     
    public Tema() {
    }

    public Tema(Long id_tema, String nombre, String descripcion, Curso curso) {
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.curso = curso;
    }


    
}
