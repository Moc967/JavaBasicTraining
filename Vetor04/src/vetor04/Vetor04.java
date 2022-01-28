/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author CarneiMO
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int vet[]={1,11,2,13,5,3,8,7,12,23,10,14,15,99};
        Arrays.sort(vet);
        System.out.print("Informe o numero que deseja localizar ");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();
        for (int v:vet){
            System.out.print(v+" ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet,num);
        System.out.println("Encontrei o valor "+num+" na posição " + p);
    }
    
}
