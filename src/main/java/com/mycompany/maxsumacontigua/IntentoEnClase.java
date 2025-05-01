/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maxsumacontigua;

/**
 *
 * @author Ronald
 */
public class IntentoEnClase {

    static int[] numeros = {-2,11,-4,13,-5,9,-3,2,-4,11,-5,17,-2,10,-5}; //Se piensa la suma como una grafica total vs indice;
    //Si se considera dos puntos, el menor y el mayor en la gráfica, se podría decir que la "ganancia" total es la resta entre el mayor con el menor
    
    public static void main(String[] args) {
        int sumaActual = 0;
        int mayorSuma = 0; //Es el mayor punto en la grafica
        int menorSuma = 0; //Es el menor punto en la grafica
        int indiceFinal=0, indiceInicial=0; //Deben seguir el orden correcto inicio-final
        int posibleIndiceFinal=0, posibleIndiceInicial=0; //Los posibles indices en realidad no respetan una secuencia inicio-final, sino que tambien final-inicio.. Por eso se les considera "posibles" pero no finales hasta chequear que estén el orden correcto
        
        for(int i=0; i<numeros.length; i++){
            sumaActual = sumaActual+numeros[i]; 
            
           if(sumaActual <= menorSuma){
               menorSuma = sumaActual;
               posibleIndiceInicial = i+1; //No se puede empezar la suma con un numero negativo. Se asume que el siguiente número será positivo, de otra manera lo actualiza. En todo caso encontrará el positivo
           }
           if(sumaActual >= mayorSuma){
              mayorSuma = sumaActual;
              posibleIndiceFinal = i;
           }
           if(posibleIndiceInicial <= posibleIndiceFinal){ //De otra manera se consideraría el caso de la mayor resta, cuando indiceFinal < IndiceInicial .. Mientras el indice avanza en la grafica estaría ubicado del punto mas alto al punto mas bajo, en ese caso debería obtenerse la mayor perdida
               indiceFinal = posibleIndiceFinal;
               indiceInicial = posibleIndiceInicial;
           }
        }
        
        System.out.println("Suma mayor desde el numero en el lugar #" +(indiceInicial+1)+" hasta #"+(indiceFinal+1) +" con un total de: " + (mayorSuma - menorSuma));
        //(!!) Lo que devuelve no son indices que van de 0 a n-1, sino de 1 a n..
    }
}
