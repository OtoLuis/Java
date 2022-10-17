
package br.edu.fatecfranca.projeto3.ex00;

import java.util.Date;

public final class Cursa {
    private int codigo;
    private Date data;
    private Aluno aluno; // agregação - criamos um objeto-parte dentro do objeto-todo
    private Disciplina disciplina;
    
    public Cursa() {
        aluno.getNome();
        aluno.getRa();
        disciplina.getId();
        disciplina.getSigla();
    }

    public Cursa(int codigo, Date data, Aluno aluno, Disciplina disciplina) {
        this.setCodigo(codigo);
        this.setData(data);
        this.setAluno(aluno);
        this.setDisciplina(disciplina);
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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Cursa{" + "codigo=" + codigo + ", data=" + data + ",\n aluno="
                + aluno.toString() + ",\n disciplina=" + disciplina + '}';
    }
    
    
}
