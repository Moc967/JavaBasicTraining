
package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", 0.5f, "Amarela");
        c1.Status();
        
    //    System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta "+ c1.getPonta());
        Caneta c2 = new Caneta("BIC", 1.5f,"Verde");
        c2.Status();
        
    }
    
}
