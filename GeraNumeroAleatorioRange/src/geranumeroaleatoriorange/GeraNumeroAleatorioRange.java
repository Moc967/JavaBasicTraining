/*
* A rotina que segue permitir gerar numeros aleatorios em determinada faixa, 
* entre start e end
*
*/
package geranumeroaleatoriorange;

/**
 *
 * @author CarneiMO
 */
public class GeraNumeroAleatorioRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int start;
        int end;
        start = 1;
        end = 10;
        int quant = 10;
        
        do 
        {
            double ale = Math.random();  
            n = (int) (start + ale*(end - start));
            System.out.println(n);
            quant--;
        }while(quant>=0);
        
    }
    
}
