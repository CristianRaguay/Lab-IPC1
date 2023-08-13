/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3_1;

/**
 *
 * @author crist
 */
public class Clase3_1 {

    /**
     * @param args the command line arguments
     */
    static int[] arreglo = new int[5];

    public static void main(String[] args) {
        int pos, aux;

        arreglo[0] = 5;
        arreglo[1] = 2;
        arreglo[2] = 1;
        arreglo[3] = 9;
        arreglo[4] = 7;
        
        for(int i = 0; i<5; i++){
               System.out.print(fibonacci(i) + ", ");
          }
        
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println(arreglo[i]);
//        }
        //Brubuja
//        for (int i = 0; i < arreglo.length - 1; i++) {
//            for (int j = 0; j < arreglo.length - 1; j++) {
//                if (arreglo[j] > arreglo[j + 1]) {
//                    aux = arreglo[j];
//                    arreglo[j] = arreglo[j + 1];
//                    arreglo[j + 1] = aux;
//                }
//            }
//        }
        
//        System.out.println("----------------");
        // por seleccion
//        for (int i = 0; i < arreglo.length - 1; i++) {
//            int minimo = i;
//            for (int j = i+1; j < arreglo.length; j++) {
//                if (arreglo[j] < arreglo[minimo]) {
//                    minimo = j;
//                }
//            }
//            aux = arreglo[i];
//            arreglo[i] = arreglo[minimo];
//            arreglo[minimo] = aux;
//        }

        //Por insercion
//        for (int i = 0; i < arreglo.length; i++) {
//            pos = i;
//            aux = arreglo[i];
//            while ((pos>0) && (arreglo[pos-1] > aux)) {                
//                arreglo[pos] = arreglo[pos-1];
//                pos--;
//            }
//            arreglo[pos] = aux;
//        }
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println(arreglo[i]);
//        }

        //ordenamiento Rapido
//        System.out.println("Vector original");
//        imprimirVector(arreglo);
//        ordenacionRapida(arreglo);
//        System.out.println("\nVector ordenado");
//        imprimirVector(arreglo);
    }

    public static void ordenacionRapida(int vec[]) {
        final int N = vec.length;
        quickSort(vec, 0, N - 1);
    }

    public static void quickSort(int vec[], int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        int pivote = vec[inicio];
        int elemIzq = inicio + 1;
        int elemDer = fin;
        while (elemIzq <= elemDer) {
            while (elemIzq <= fin && vec[elemIzq] < pivote) {
                elemIzq++;
            }
            while (elemDer > inicio && vec[elemDer] >= pivote) {
                elemDer--;
            }
            if (elemIzq < elemDer) {
                int temp = vec[elemIzq];
                vec[elemIzq] = vec[elemDer];
                vec[elemDer] = temp;
            }
        }

        if (elemDer > inicio) {
            int temp = vec[inicio];
            vec[inicio] = vec[elemDer];
            vec[elemDer] = temp;
        }
        quickSort(vec, inicio, elemDer - 1);
        quickSort(vec, elemDer + 1, fin);
    }

    public static void imprimirVector(int vec[]) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
    }
    
    private static int fibonacci(int num){
          if(num == 0 || num==1)
               return num;
          else
               return fibonacci(num-1) + fibonacci(num-2);
     }
}
