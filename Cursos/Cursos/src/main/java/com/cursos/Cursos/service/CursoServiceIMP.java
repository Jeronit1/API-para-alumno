/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.Cursos.service;

import com.cursos.Cursos.DTO.temaDTO;
import com.cursos.Cursos.model.Curso;
import com.cursos.Cursos.model.Tema;
import com.cursos.Cursos.repository.CursoRepository;
import com.cursos.Cursos.repository.TemaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CursoServiceIMP implements ICursoService {
    
    @Autowired
    CursoRepository Crepository;
    @Autowired
    TemaRepository Trepository;
    
    @Override
    public Curso createCurso(Curso curso) {
        return Crepository.save(curso);
    }
    @Override
    public List<Curso> getCursos(){
        return Crepository.findAll();
    }
    @Override
    public void agregarTema(Long cursoId, Tema tema){
        Curso curso = Crepository.findById(cursoId).orElse(null);
        if(curso!=null){
        tema.setCurso(curso);
        curso.getTemas().add(tema);
        Crepository.save(curso);
        Trepository.save(tema);
        }
    }
    public Curso getCurso(Long id){
        return Crepository.findById(id).orElse(null);
    }
    
}
