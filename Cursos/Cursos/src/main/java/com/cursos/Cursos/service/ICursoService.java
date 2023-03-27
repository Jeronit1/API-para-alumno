/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cursos.Cursos.service;

import com.cursos.Cursos.DTO.temaDTO;
import com.cursos.Cursos.model.Curso;
import com.cursos.Cursos.model.Tema;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ICursoService {
  
    public Curso createCurso(Curso cur);
    
    public List<Curso> getCursos();
  
    public void agregarTema(Long cursoId, Tema tema);
}
