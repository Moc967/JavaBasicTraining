/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author CarneiMO
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        int nasc = t.nextInt();
        int idade = 2018 - nasc;
        if (idade>=18) {
            System.out.println("Maior de idade com "+idade+" anos");
        }else{
            System.out.println("Menor de idade com "+idade+" anos");
        }
    }
    
}
