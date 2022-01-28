/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author CarneiMO
 */
public class IdiomaDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Locale idioma = Locale.getDefault();
    System.out.print("O idioma do sistema operacional é ");    
    System.out.println(idioma.getDisplayLanguage());
    
    }
    
}
