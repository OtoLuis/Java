
package br.edu.fatecfranca.projeto4.ex0;

import java.util.Date;

public class Cursa {
    private int codigo;
    private Date data;
    private Aluno aluno; // agregação - criamos um objeto-parte dentro de objeto-todo
    private String Disciplina;
    
    public Cursa(){
    }

    public Cursa(int codigo, Date data, Aluno aluno, String Disciplina) {
        this.codigo = codigo;
        this.data = data;
        this.aluno = aluno;
        this.Disciplina = Disciplina;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String Disciplina) {
        this.Disciplina = Disciplina;
    }
    
}
