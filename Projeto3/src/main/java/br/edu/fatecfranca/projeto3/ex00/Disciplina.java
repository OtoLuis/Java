package br.edu.fatecfranca.projeto3.ex00;
public final class Disciplina {
    private int id;
    private String sigla;
    
    public Disciplina () {
    
}
    public Disciplina (String sigla, int id) {
        this.setSigla(sigla);
        this.setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "id=" + id + ", sigla=" + sigla + '}';
    }
    
}
