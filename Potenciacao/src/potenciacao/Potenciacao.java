/*
A potenciação serve para simplificar cálculos com números extensos, 
e em programação isso é muito mais simplificado, apenas utiliza-se a 
função math.pow. 
Uma outra forma para realizar cálculos dessa natureza é utilizando o 
laço de repetição for através de um método que tem como parâmetros 
valores double e int.
Com base na informação acima, realize o cálculo da potenciação utilizando
o laço de repetição for conforme as orientações abaixo:
- Escreva um método em que receba em seus parâmetros um valor double x
 e um inteiro y;
- O método deve retornar um valor double de x exp y
- Considerar o valor de y>0.
 */
package potenciacao;

public class Potenciacao {

static double eleva (double x, int y){
double resp = 1;

for (int i=0; i<y; i++)

resp *= x;

return(resp);   
}
    public static void main(String[] args) {

    System.out.println(eleva(2,10));
    }
    
}
