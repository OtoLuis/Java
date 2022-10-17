/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto5.exe01;

/**
 *
 * @author 1090482111029
 */
public class Pessoa extends Animal implements ICidadao, IContribuinte, IEmpregado, IProfessor {

    @Override
    public void vota() {
        System.out.println("Pessoa votando ...");
    }

    @Override
    public void obterRg() {
        System.out.println("Pessoa tirando RG ...");
    }

    @Override
    public void pagarIr() {
        System.out.println("Pessoa pagando IR ...");
    }

    @Override
    public void obterCpf() {
        System.out.println("Pessoa tirando CPF ...");
    }

    @Override
    public void trabalha() {
        System.out.println("Pessoa trabalhando ...");
    }

    @Override
    public void ensina() {
        System.out.println("Pessoa ensinando ...");
    }

    @Override
    public void come(){
        System.out.println("Pessoa está comendo ...");
    }
    
    @Override
    public void respira(){
        System.out.println("Pessoa está respirando");
    }
    
    
}
