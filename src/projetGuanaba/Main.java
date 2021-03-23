package projetGuanaba;

public class Main {
    public static void main(String args []){

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.preco = 5;
        c1.ponta = 0.5;
        c1.tampada = true;
        c1.marca = "BIC";

        c1.status();
        c1.rabiscar();
        c1.destampar();
        System.out.println(c1.tampada);

        c1.rabiscar();
        /*Caneta c2 = new Caneta();
        c2.ponta = 1.0;
        c2.tampada = false;
        c2.cor = "preta";
        c2.preco = 2;
        c2.marca = "pirata";

        c2.status();
        c2.rabiscar();        */

    }
}
