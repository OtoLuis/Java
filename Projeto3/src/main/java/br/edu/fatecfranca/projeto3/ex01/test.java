package br.edu.fatecfranca.projeto3.ex01;

import java.util.Date;

public class test {

    
    public static void main(String[] args) {
        Passageiro objPassageiro = new Passageiro(1, "Fulano", "Franca");
        Voo objVoo = new Voo(10, "São Paulo", "Recife");
        Reserva objReserva = new Reserva(20, new Date(), objPassageiro, objVoo);
        System.out.println(objReserva.toString());
        
        Voo obj2Voo = new Voo(11, "São Paulo", "Lisboa");
        Reserva obj2Reserva = new Reserva(11, new Date(), objPassageiro, obj2Voo);
        System.out.println(obj2Reserva.toString());
        
        Voo obj3Voo = new Voo(12, "São Paulo", "Toronto");
        Reserva obj3Reserva = new Reserva(12, new Date(), objPassageiro, obj3Voo);
        System.out.println(obj3Reserva.toString());
    }
    
}
