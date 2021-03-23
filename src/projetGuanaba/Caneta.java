package projetGuanaba;

public class Caneta {
    int preco ;
    String marca ;
    String cor ;
    boolean tampada ;
    double ponta ;

    void status(){

        System.out.println("uma caneta:"+ this.cor);
        System.out.println("esta tampada?"+ this.tampada);
        System.out.println("a marca é:" + this.marca);
        System.out.println("o preço foi:" + this.preco);
        System.out.println("a medida da ponta é" +  this.ponta);
    }

    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    void rabiscar(){
        if (tampada == true){
            System.out.println("Não posso rabiscar !");
        }else{
            System.out.println("Estou rabiscando !!!");
        }
    }
}
