/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto2.ex0;

/**
 *
 * @author 1090482111029
 */
public final class Produto {
    private String nome;
    private int qtde;
    private double preco;
    
    // método construtor vazio - deve ter o mesmo nome da classe
    public Produto(){
        
    }
    // método construtor para inicializar as variáveis
    // deve ter o mesmo nome da classe
    public Produto(String nome, int qtde, double preco){
        // this representa o objeto que chamou o método
        this.setNome(nome);
        this.setQtde(qtde);
        this.setPreco(preco);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQtde(int qtde){
        if (qtde >= 0){
            this.qtde = qtde;
        } else{
            System.out.println("Quantidade não pode ser negativa");
        }
    }
    public void setPreco(double preco){
        if (preco >= 0){
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativa");
        }
}
    public String getNome(){
        return this.nome;
    }
    public int getQtde(){
        return this.qtde;
    }
    public double getPreco(){
        return this.preco;
    }
    // comprar um produto em x unidades
    public void comprar(int x){
        this.qtde += x;
    }
    // vender um produto em x unidades
    public void vender(int x){
        if (x <= this.qtde){
            this.qtde = this.qtde - x;
        }
    }
    // subir o preço de um produto em x unidades
    public void subir(double x){
        this.preco += x;
    }
    // desce o preço de um produto em x unidades
    public void descer(double x){
        if (x <= this.preco){
            this.preco -= x;
        }
    }
    public void mostrar(){
        System.out.println("Dados \nNome: " + this.nome +
               " Qtde " + this.qtde + " Preço " + this.preco);
    }

}
