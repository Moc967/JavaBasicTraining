/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CarneiMO
 */
public class Calendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy");
        String cal = formatador.format( data );
        System.out.println(cal);
    }
    
}
