/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Calendar;

/**
 *
 * @author CarneiMO
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"JAN","FEV", "MAR","ABR","MAI","JUN","JUL","AGO","SET"
                ,"OUT","NOV","DEZ"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        Calendar cal = Calendar.getInstance();
        int year;
        year = cal.get(Calendar.YEAR);
        if (year%4==0){
            dias[1]=29;
        }
        for (int count=0;count<dias.length;count++){
            System.out.println("O mes de "+ mes[count]+" possui "
                    +dias[count]+" dias");
        }
    }
    
}
