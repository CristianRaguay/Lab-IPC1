/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Clase2 {

    static int global;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// entradas y salidas de java y casteos
//        double a = 3.141516;
//        int b = (int) a;
//        System.out.println("valor de a: " + a);
//        System.out.println("valor de b: " + b);
//        
//        int numero = 66;
//        numero = numero / 2;
//        char caracter = (char) numero;
//        String cadena = Integer.toString(numero);
//        String cadena2 = "Hola mundo " + cadena;
//        System.out.println("numero: " + numero);
//        System.out.println("caracter: " + caracter);
//        System.out.println("cadena: " + cadena);
//        System.out.println("cadena 2: " + cadena2);

//Estructura if
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese un valor a");
//        int a = sc.nextInt();
//        System.out.println("valor ingresado de a: " + a);
//        System.err.println("Ingrese una cadena");
//        String cadena = sc.next();
//        System.out.println("cadena" + cadena);
//        if (a < 30) {
//            System.out.println("es menor a 30");
//        }else if(a > 65){
//            System.out.println("es mayor a 65");
//        }else{
//            System.out.println("es mayor a 30");
//        }
        System.out.println("ingrese un valor");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                while (a == 1) {
                    a++;
                    System.out.println(a);
                }
                System.out.println("valor de a: " + a);
                break;
            case 2:
                do {
                    a++;
                    System.out.println(a);
                } while (a <= 4);
                break;
            default:
                int[] vector = new int[5];
                vector[0] = 5;
                vector[1] = 4;
                vector[2] = 3;
                for (int i = 0; i < vector.length; i++) {
                    System.out.println(vector[i]);
                }
        }
//        int[] vector = new int[5];
//        vector[0] = 5;
//        vector[1] = 4;
//        vector[2] = 3;
//        System.out.println(vector[4]);
//
//        System.out.println("valor x");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println("valor y");
//        int y = sc.nextInt();
//        
//        String[][] matriz = new String[x][y];
//        
//        matriz[0][0] = "Valor en posicion 0,0";
//        System.out.println("matriz: " + matriz[0][0]);
    }

}
