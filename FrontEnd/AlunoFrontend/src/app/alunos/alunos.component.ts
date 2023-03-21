import {Component, OnInit} from '@angular/core';
import {AlunoService} from "../aluno.service";
import {Aluno} from "../Aluno";

@Component({
  selector: 'app-alunos',
  templateUrl: './alunos.component.html',
  styleUrls: ['./alunos.component.css']
})
export class AlunosComponent implements OnInit{

  aluno: Aluno[] = [];
  constructor(private alunoService: AlunoService) {}

  ngOnInit(): void {
    this.alunoService.getAluno().subscribe((data: Aluno[])=>{
      console.log(data);
      this.aluno = data;
    });
  }

}
