/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.Cursos.service;

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
public class TemaService implements ITemaService {

    @Autowired
    private TemaRepository temaRepository;

    @Autowired
    private CursoRepository cursoRepository;



    
    
}
