
package br.edu.fatecfranca.projeto5.exe01;


public class Cidade {
   
    public void contratar(IProfessor p){
        p.ensina();
        p.trabalha();
    }
    
    public void contratar(IEmpregado e){
        e.trabalha();
    }
    
    public void cobraDe(IContribuinte c){
        c.pagarIr();
    }
    
    public void registra(ICidadao c) {
        c.obterRg();
    }
    
    public void alimenta(Animal a){
        a.come();
    }
}
