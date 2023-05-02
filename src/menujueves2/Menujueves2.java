/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menujueves2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Menujueves2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int respuesta;
        int num1;
        int num2;
        float resultado;
        System.out.println("Dame el numero 1");
        num1=entrada .nextInt();
        
        System.out.println("Dame un numero 2");
        num2=entrada.nextInt();
        
        System.out.println("Menu de operaciones");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Division");
        System.out.println("4.- Multiplicacion");
            
        respuesta=entrada.nextInt();
        
        switch(respuesta){
                case 1:
                    resultado=num1+num2;
                    System.out.println("El resultado de la suma es:"+resultado);
                    break;
                case 2:
                    resultado=num1-num2;
                    
                    System.out.println("El resultado de la resta es:"+resultado);
                break;
                case 3:
                    resultado=num1/num2;
                    
                    System.out.println("El resultado de la division es:"+resultado);
                    break;
                case 4:
                    resultado=num1*num2;
                   
                    System.out.println("El resultado de la multiplicacion es:"+resultado);
                    break;
                default:
                    System.out.println("Esta no es una opcion");
                    break;

        }
    }
        }
    

