/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;


public class NumeroPrimo {

static boolean primo(int n){
    int div = 2;
    while (div<n){
     if (n % div ==0)
         return false;
     div++;
     }
    return true;
} 
    public static void main(String[] args) {
        System.out.println(primo(1231));    // TODO code application logic here
    }
    
}
