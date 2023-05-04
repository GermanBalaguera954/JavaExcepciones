package excepciones;

import java.util.Scanner;

public class Ejemplo_Excepcion {
    public static void main(String[] args) {
        /*int num1=5, num2=0;//error de excepcion no se puede dividir entre cero
        
        int resultado = num1/num2;
        
        System.out.println("El resultado es: "+resultado);
        
        System.out.println("Hola mundo");*/
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite un numero: ");
        int numero = entrada.nextInt();//error de excepcion no se puede digitar un string
        System.out.println(numero);
    }

}
