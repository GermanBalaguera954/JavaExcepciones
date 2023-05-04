//try catch para excepciones no verificadas.
package trycatch2;

import javax.swing.JOptionPane;

public class TryCatchExcepcionesNoVerificadas {

    public void operaciones() {
        int num1 = 5, num2 = 0;
        int resultado = num1 / num2;
        System.out.println(resultado);
    }

    public void operaciones2() {
        try {
            operaciones();
        } catch (ArithmeticException a) {
            JOptionPane.showMessageDialog(null, "Error, ha intentado dividir un numero entre cero");
        }
        
        
        System.out.println("Programa terminado");
    }

    public static void main(String[] args) {
        TryCatchExcepcionesNoVerificadas prueba = new TryCatchExcepcionesNoVerificadas();
        prueba.operaciones2();
    }

}
