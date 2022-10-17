package br.edu.fatecfranca.lista1.exe0;


public class Teste {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Carro objCarro = new Carro("GM", "Onix", 0, false);
        
        
        objCarro.ligar();
        objCarro.acelerar(80);
        System.out.println(objCarro.toString());
    }
    
}
