/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablerodamas;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class circulo {
    //método clase o método estático
    public static void main(String[] args) {
        int radio; //almacena el radio del circulo
        
        //instancia un objeto de tipo "Scanner"
        Scanner entrada= new Scanner (System.in);
        
        //solicitud y obtencion del radio del circulo
        System.out.println("Digite el radio");
        radio=entrada.nextInt();
        
        //visualizacion de resultados
        //diametro
        System.out.printf("\nEl diametro del circulo es: %d.",(2*radio));
        
        //circunferencia
        System.out.printf("\nLa circunferencia del circulo es: %f.",(2*Math.PI*radio));
        
        //area
        System.out.printf("\nEl area del circulo es: %f.\n",(Math.PI*radio*radio));
        
        //salida normal
        System.exit(0);
    } //fin del metodo main
    
}
