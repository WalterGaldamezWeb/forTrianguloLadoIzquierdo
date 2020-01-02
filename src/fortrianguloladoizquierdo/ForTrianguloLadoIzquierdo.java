/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortrianguloladoizquierdo;

import java.util.Scanner;

/**
 *
 * @author Walter Galdamez
 */
public class ForTrianguloLadoIzquierdo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 0;
        char caracterFigura ='@';
        String salto_de_linea = "\n";
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero; ");

        numero = leer.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero; j++) {
                if (j <= numero - i) {
                    System.out.print(" ");
                }else{
                System.out.print(caracterFigura);
                }
            }
            System.out.print(salto_de_linea);
        }
    }
    
}
