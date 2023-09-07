/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author crist
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreArchivo = "archivo_binario.bin";
        
        String contenido = "Este es el contenido que quiero escribir en el archivo.";
        // Definir la ruta del archivo donde deseas escribir
        String rutaArchivo = "mi_archivo.txt";

        try {
            // Crear un objeto FileOutputStream para escribir en el archivo binario
            FileOutputStream fileOutputStream = new FileOutputStream(nombreArchivo);
            

            // Crear un objeto DataOutputStream para escribir datos binarios
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            // Escribir datos binarios en el archivo
            dataOutputStream.writeInt(42); // Ejemplo de escritura de un entero
            dataOutputStream.writeDouble(3.14159265359); // Ejemplo de escritura de un double
            dataOutputStream.writeUTF("Hola, mundo"); // Ejemplo de escritura de una cadena UTF-8

            // Cerrar el flujo de salida de datos binarios
            dataOutputStream.close();

            System.out.println("Los datos binarios se han escrito correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Ocurrió un error al escribir el archivo binario: " + e.getMessage());
        }
        
        try {
            // Crear un objeto FileInputStream para leer el archivo binario
            FileInputStream fileInputStream = new FileInputStream(nombreArchivo);

            // Crear un objeto DataInputStream para leer datos binarios
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            // Leer datos binarios desde el archivo
            int entero = dataInputStream.readInt(); // Leer un entero
            double numeroDouble = dataInputStream.readDouble(); // Leer un double
            String cadena = dataInputStream.readUTF(); // Leer una cadena UTF-8

            // Cerrar el flujo de entrada de datos binarios
            dataInputStream.close();

            // Imprimir los datos leídos
            System.out.println("Entero: " + entero);
            System.out.println("Double: " + numeroDouble);
            System.out.println("Cadena: " + cadena);
        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer el archivo binario: " + e.getMessage());
        }
        
        try {
            // Crear un objeto File que represente el archivo
            File archivo = new File(rutaArchivo);

            // Crear un objeto FileWriter para escribir en el archivo
            FileWriter escritor = new FileWriter(archivo);

            // Crear un objeto BufferedWriter para escribir de manera eficiente
            BufferedWriter bufferedWriter = new BufferedWriter(escritor);

            // Escribir el contenido en el archivo
            bufferedWriter.write(contenido);

            // Cerrar el BufferedWriter (esto también cierra el FileWriter)
            bufferedWriter.close();

            System.out.println("El archivo se ha escrito correctamente.");
        } catch (IOException e) {
            System.err.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
        
        try {
            // Crear un objeto File que represente el archivo
            File archivo = new File(rutaArchivo);

            // Crear un objeto FileInputStream para leer el archivo
            FileInputStream fileInputStream = new FileInputStream(archivo);

            // Crear un objeto InputStreamReader para leer caracteres desde FileInputStream
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

            // Crear un objeto BufferedReader para leer líneas de texto de InputStreamReader
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String linea;
            // Leer el archivo línea por línea
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            // Cerrar los flujos de lectura
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
    
}
