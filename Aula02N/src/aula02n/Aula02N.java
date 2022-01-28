package aula02n;

public class Aula02N {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
    
}
