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
public class separacion_de_digitos {

    public static void main(String[] args) {
        //abre metodo main
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("\nIntroduzca un numero de cinco cifras y sera impresa con espacios");
        numero = entrada.nextInt();
        System.out.printf("%d ",   numero/10000);
        System.out.printf("%d ", (numero%10000)/1000);
        System.out.printf("%d ", ((numero%10000)%1000)/100);
        System.out.printf("%d ", (((numero%10000)%1000)%100)/10);
        System.out.printf("%d\n ", ((((numero%10000)%1000)%100)%10));

    } //cierra main

}
