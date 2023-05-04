//Declaracion de la excepciones de un metodo.
package declaracionesExcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DeclaracionExcepcion {

    public void leerArchivo() throws FileNotFoundException {
        File archivo = new File("D:\\Documentos\\NetBeansProjects\\prueba.txt");
        FileReader fr = new FileReader(archivo);
    }

    public void leerArchivo2() throws IOException {
        leerArchivo();
    }
    public static void main(String[] args) {

    }
}
