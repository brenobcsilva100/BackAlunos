package com.example.alunos.persistence.repository;

import com.example.alunos.persistence.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
