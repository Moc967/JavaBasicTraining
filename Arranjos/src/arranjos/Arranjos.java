/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arranjos;

/**
 *
 * @author CarneiMO
 */
public class Arranjos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] d = new double[10];
        
        for (int i=0; i<10; i++){
            d[i] = i;
            System.out.println("O vetor de double na posição "+ i + " é: " + d[i]);
    }
    }
}