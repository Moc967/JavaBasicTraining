/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arranjos1;

/**
 *
 * @author CarneiMO
 */
public class Arranjos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a1 [] = {0,1,2,3,4,5,6,7,8};
    int a2[] = new int[a1.length];
    
    for (int i = 0;i<a1.length;i++)
        a2[i] = a1[i];
        a1[3] = 9;
        for (int val:a1) 
            System.out.print(val+", ");
            System.out.println();
            for (int val:a2)
                System.out.print(val+", ");
                System.out.println();
                      
                
            
    }
    
}
