package br.edu.fatecfranca.projeto3.ex00;

import java.util.Date;


public class Projeto3 {

    public static void main(String[] args) {
        Aluno objAluno = new Aluno(123456, "Fulano");
        Disciplina objDisciplina = new Disciplina("poo", 1);
        Cursa obj = new Cursa(100, new Date(), objAluno, objDisciplina);
        System.out.println(obj.toString());
    }
}
