//Excepciones Verificadas(IOException) y no verificadas(RunTimeException)
package jerarquiaExcepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Jerarquia_Excepcion {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        /*//Excepciones Verificadas(IOException)
        //Lectura de un archivo de texto (txt.)
        BufferedReader bf = new BufferedReader(new FileReader("D:\\Documentos\\NetBeansProjects\\prueba.txt"));
        String linea;
        while ((linea = bf.readLine()) != null) {
            System.out.println(linea);
        }*/
        
        //Excepciones no verificadas(RunTimeException)
        //Division entre cero
        int num1 = 5, num2 = 0;
        int resultado = num1 / num2;
        System.out.println(resultado);

    }
}
