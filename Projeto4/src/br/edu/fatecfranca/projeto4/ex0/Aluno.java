/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto4.ex0;

public final class Aluno {
    private int ra;
    private String nome;
    
    public Aluno(){
    }
    
    public Aluno(int ra, String nome) {
        this.setRa(ra);
        this.setNome(nome);
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
