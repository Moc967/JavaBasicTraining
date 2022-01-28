/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author CarneiMO
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int cc = 0;
        while (cc<20){
            cc++;
            if(cc%2!=0){
                // Pula a execução do fluxo e retorna ao inicio do loop
                continue;
            }
            if(cc==16){
                //Interrompe a execução do loop saindo do mesmo
                break;
            }
            System.out.println("Cambalhota " + cc);
            //acrescenta um timer de 1 segundo apos a instrução acima
            new Thread().sleep(1000);
            
        }
    }
    
}
