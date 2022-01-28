/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author CarneiMO
 */
public class ResolucaoDaTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit tk=Toolkit.getDefaultToolkit();
        Dimension resolucao=tk.getScreenSize();
        System.out.print("A resolução de sua tela é ");
        System.out.print(resolucao.width);
        System.out.print(" X ");
        System.out.println(resolucao.height);
    }
    
}
