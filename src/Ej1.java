import java.io.*;
import java.nio.file.Path;


import static teclado.Teclado.*;

public class Ej1 {

    public static void main(String args[]) {

    File archivo;

    System.out.println("Introduce la ruta de un archivo:");

        archivo = new File(readString());

        if (archivo.isFile() && archivo.exists()) {

            System.out.printf("Nombre: %s\n¿Ejecutable?: %s\n¿Oculto?: %s\nRuta relativa: %s\nRuta absoluta: %s\nTamaño: %d KBs",
                    archivo.getName(), esExe(archivo) ? "Sí" : "No", archivo.isHidden() ? "Sí" : "No", archivo.getPath(),
                    archivo.getAbsolutePath(), archivo.length() / 1024);

        }

        else if (!archivo.isFile() && archivo.exists()) {

            System.out.println("Esto no es un archivo.");

        }

        else {

            System.out.println("El archivo no existe.");

        }





    }


    public static boolean esExe (File archivo) {

        String extension = archivo.getName().substring(archivo.getName().length() - 3, archivo.getName().length());

        System.out.println(extension);

        if (extension.equals("exe")) {

            return true;

        } else {

            return false;
        }


    }


}
