package com.example.alunos.controller;

import com.example.alunos.persistence.model.Aluno;
import com.example.alunos.persistence.repository.AlunoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class AlunoController {


    private final AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping("/mostrarAluno")
    private List<Aluno> aluno(){
        return alunoRepository.findAll();
    }



}
