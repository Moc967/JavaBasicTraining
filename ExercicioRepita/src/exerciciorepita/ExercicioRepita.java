/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author CarneiMO
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, total, pares=0, impares=0, acimacem=0,qtd = 0, soma = 0;
        float media;
        do {
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe o número: <br><em>(O valor 0 finaliza)</html>"));
// JOptionPane.showMessageDialog(null,"Voce Digitou o número: " + numero);
// JOptionPane.showMessageDialog(null, "Ola Mundo", "Boas Vindas", 
//      JOptionPane.INFORMATION_MESSAGE);
        soma += numero;
        qtd++;
        if (numero%2==1){
            impares++;
        }else{
            pares++;
        }
        if(numero>100){
            acimacem++;
        }
        } while(numero !=0);
        media=soma/qtd;
        JOptionPane.showMessageDialog(null,"<html> Resultado final <hr><br>" + 
                "Total de Valores: "+qtd +"<br>"+
                "Total de Pares: "+pares+"<br>"+
                "Total de Ímpares: "+impares+"<br>"+
                "Acima de 100: "+acimacem+"<br>"+
                "Média dos Valores: "+media+"<br>"+
                "Soma total: " + soma +"</html>");
    }  
}
