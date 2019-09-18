package Ej4;

import java.io.File;
import java.io.FilenameFilter;

import static teclado.Teclado.readString;

public class Main {

    public static void main(String[] args) {

        Filtro filtro = new Filtro();

        System.out.println("Introduce un directorio: ");

        File dir = new File(readString());

        buscar(dir, filtro);

        }

        public static void buscar(File dir, Filtro filtro) {

        if (dir.isDirectory()) {

            File[] lst_archivos = dir.listFiles();

            System.out.println("Resultados: ");

            for (int i = 0; i < lst_archivos.length; i++) {

                if (filtro.accept(dir, lst_archivos[i].getName())) {

                    System.out.println(lst_archivos[i].getName());

                }

            }

        }

        }

}
