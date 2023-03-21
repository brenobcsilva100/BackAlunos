package com.example.alunos.controller;

import com.example.alunos.persistence.model.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    @GetMapping("/mostrarAluno")
    private Aluno aluno(){
        return new Aluno(1L,"Breno","Silva");
    }



}
