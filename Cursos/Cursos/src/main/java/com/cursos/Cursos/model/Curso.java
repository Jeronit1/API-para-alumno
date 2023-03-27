/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.Cursos.model;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;
    private String nombre;
    private String tipo_curso;
    private Date fecha; 
    @OneToMany(mappedBy = "curso", fetch = FetchType.LAZY, orphanRemoval = false)
    private List<Tema> temas;

    public Curso() {
    }

    public Curso(Long id_curso, String nombre, String tipo_curso, Date fecha, List<Tema> temas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.tipo_curso = tipo_curso;
        this.fecha = fecha;
        this.temas = temas;
    }

 
 
  


    
    
}
