import java.io.File;

import static teclado.Teclado.readString;

public class Ej3 {

    public static void main(String[] args) {

        System.out.println("Introduce un directorio:");

        File dir = new File(readString());

        recorrer_dir(dir);

    }

    public static void recorrer_dir(File dir) {

        if (dir.exists()) {

            File[] lista_archivos = dir.listFiles();

            if (lista_archivos == null) {

                System.out.println("Este directorio no tiene archivos.");

            }

            else {

                for (int i = 0; i < lista_archivos.length; i++) {

                    if(lista_archivos[i].isFile()) {

                        System.out.println("  " + lista_archivos[i].getPath());

                    }

                    else if (lista_archivos[i].isDirectory()) {

                        System.out.println(lista_archivos[i].getPath());

                        recorrer_dir(lista_archivos[i]);

                    }

                }

            }
        }

        else {

            System.out.println("El directorio indicado no existe");

        }

    }

}
