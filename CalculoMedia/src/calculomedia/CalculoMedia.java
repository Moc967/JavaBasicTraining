/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculomedia;

/**
 *
 * @author CarneiMO
 */
public class CalculoMedia {


    public static void main(String[] args) {
        // TODO code application logic here
    
    double media = 0;
    double precos[]={ 1234,123,245,345,569};
    String  precosS = null;
    
    for (int i=0;i<=precos.length;i++){
        precosS = doubletoString.precos[i];
    }
    for (double valor: precos){
        media += valor;
    }
    media = media/precos.length;
        System.out.println("A media de "+precosS+" é "+media);
    }
    
}
