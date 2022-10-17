
package br.edu.fatecfranca.projeto5.exe01;


public class TestaPessoaCidade {

    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa Carlos = new Pessoa();
        
        Cidade franca = new Cidade();
        
        franca.contratar(Carlos); //contrata um professor
        
        // conversão
        franca.contratar((IEmpregado)Carlos); //contrata um empregado
        
        franca.cobraDe(Carlos);
        
        franca.registra(Carlos);
        
        franca.alimenta(Carlos);
        
    }
    
}
