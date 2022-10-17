package br.edu.fatecfranca.projeto2.ex0;

public class Projeto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        prod1.setNome("microfone");
        prod1.setQtde(3);
        prod1.setPreco(94.21);
        prod1.mostrar();
        System.out.println(" Qtde: " + prod1.getQtde());
        System.out.println(" Nome: " + prod1.getNome());
        System.out.println(" Preco: " + prod1.getPreco());
   
    
        Rio prod2 = new Rio();
        prod2.setNome("Tiête");
        prod2.setNivel(0.2);
        prod2.setPoluido(true);
        System.out.println("\nNivel: " + prod2.getNivel());
        System.out.println(" Nome: " + prod2.getNome());
        System.out.println(" Poluido: " + prod2.getPoluido());
    }
}
