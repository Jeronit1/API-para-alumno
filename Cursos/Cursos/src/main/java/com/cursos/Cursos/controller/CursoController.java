/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.Cursos.controller;

import com.cursos.Cursos.DTO.temaDTO;
import com.cursos.Cursos.model.Curso;
import com.cursos.Cursos.model.Tema;
import com.cursos.Cursos.service.CursoServiceIMP;
import com.cursos.Cursos.service.ICursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    @Autowired
    private CursoServiceIMP cursoService;
    
    @PostMapping("/curso/crear")
    public ResponseEntity<Curso> crearCurso(@RequestBody Curso curso) {
        Curso nuevoCurso = cursoService.createCurso(curso);
        return new ResponseEntity<>(nuevoCurso, HttpStatus.CREATED);
    }
    
    @GetMapping("/curso/traer/{id}")
    public Curso getCurso(@PathVariable Long id){
        return cursoService.getCurso(id);
    }
     
    @GetMapping("/curso/traer") 
    public List<Curso> getCursos(){
        return cursoService.getCursos();
    }
 
    @PostMapping("/{cursoId}/temas")
    public ResponseEntity<?> agregarTemaACurso(@PathVariable Long cursoId, @RequestBody Tema tema) {
        cursoService.agregarTema(cursoId, tema);
        return ResponseEntity.ok().build();
    }
    
}  