/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarrayp21;


public class TestArrayP21 {

static void resultado2(){
int[] x = {3,2,1};
int[] y = {2,5,6};
int[] w = x;
int m = 3;
y = auxiliar2(y,w,m);
for (int i=0;i<x.length;i++) System.out.println(x[i]);
for (int i=0;i<x.length;i++) System.out.println(y[i]);
System.out.println(m);
}
static int []auxiliar2(int[] a1, int[] a2,int m){
    int[] z = new int[a1.length];
    int min = m;
    int max = m;
    for (int i=0;i<a1.length;i++){
        z[i] = a1[i] + a2[i];
        if (z[i] < min) min = z[i];
        if (z[i]> max) max = z[i];
    }
m = -1;
a2[0]=min;
a2[1]=max;
return z;
}

    public static void main(String[] args) {
    resultado2();    // TODO code application logic here
    }
    
}
