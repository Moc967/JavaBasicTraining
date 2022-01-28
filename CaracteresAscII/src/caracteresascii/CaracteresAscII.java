/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteresascii;

/**
 *
 * @author CarneiMO
 */
public class CaracteresAscII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        for (int i = 32; i<=126;i++){
            System.out.println(i+" : "+(char)i+"\t");
        }
    }
    
}
