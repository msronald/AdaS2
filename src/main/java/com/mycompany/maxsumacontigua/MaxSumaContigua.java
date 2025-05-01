/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maxsumacontigua;

/**
 *
 * @author Ronald
 */
public class MaxSumaContigua {

    static int[] numeros ={-1,-1, 11, -4, -1, 1, 13, -5, 9, -3, 2, -8, 4};

    public static void main(String[] args) {
        
        
        int inicio=0;
        int fin=0;
        int temp = 0;
        int maximoTotal = numeros[0];
        int sumaParcial = numeros[0]; 
        
        for(int i=1; i<numeros.length; i++){
            
            if(sumaParcial <0){
                sumaParcial = numeros[i];
                temp = i;
            }
            else{
                sumaParcial = sumaParcial + numeros[i];
            }
            
            if(maximoTotal < sumaParcial){ 
                maximoTotal = sumaParcial;
                inicio = temp;
                fin = i;
            }
        }
        
        System.out.println("La suma maxima es: " + maximoTotal + " desde el indice: " + inicio +" hasta "+fin);
    }
}
