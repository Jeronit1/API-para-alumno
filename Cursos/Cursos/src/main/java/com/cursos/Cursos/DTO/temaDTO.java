/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.Cursos.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class temaDTO {
    private Long id_tema;
    private String nombre;
    private String nombre_carrera;

    public temaDTO(Long id_tema, String nombre, String nombre_carrera) {
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.nombre_carrera = nombre_carrera;
    }

    public temaDTO() {
    }
}
