//Uso de throw para excepciones personalizadas.
package throwExcepciones;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThrowExcepcion {

    private int numero;
    private Scanner entrada;

    public void introducirNumeros() throws Excepcion0 {
        entrada = new Scanner(System.in);
        do {
            System.out.print("Digite un numero: ");
            numero = entrada.nextInt();

            if (numero == 0) {//Quiero que se produzca una excepcion personalizada
                throw new Excepcion0();
            }

        } while (numero != 0 && numero != 1);
    }

    public static void main(String[] args) {
        ThrowExcepcion prueba = new ThrowExcepcion();
        try {
            prueba.introducirNumeros();
        } catch (Excepcion0 e) {
            System.out.println("Ha introducido el numero 0");
        }

        System.out.println("Programa terminado");
    }

}
