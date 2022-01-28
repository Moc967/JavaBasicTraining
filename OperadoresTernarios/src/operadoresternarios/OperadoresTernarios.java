/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresternarios;

/**
 *
 * @author CarneiMO
 */
public class OperadoresTernarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 22;
        n2 = 23;
        r = (n1>n2)? n1+n2:n1-n2; 

        /*
         *O operador ternario substitui uma expressao if/then/else e é utilizado
         *para atribuir valores para uma unica variavel baseado em determinada 
         *condição
         */
        System.out.println(r);
    }
    
}
