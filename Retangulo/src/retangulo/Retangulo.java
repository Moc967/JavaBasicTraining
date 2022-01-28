/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;

class Retangulo {
double comprimento; // comprimento do retângulo
double altura; // altura do retângulo
Retangulo (double comprimento, double altura) {
this.comprimento = comprimento;
this.altura = altura;
}
double area () {
return(comprimento*altura);
}
double perimetro () {
return(2*comprimento+2*altura);
}
static int busca (Retangulo [] arr, double comprimento) {
for (int i=0; i<arr.length; i++)
if (arr[i].comprimento >= comprimento)
return(i);
return (-1);
}

    public static void main(String[] args) {
        System.out.println(i);
    }
    
}
