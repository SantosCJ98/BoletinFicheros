package Ej4;

import java.io.File;
import java.io.FilenameFilter;

import static teclado.Teclado.readString;

public class Filtro implements FilenameFilter {

    String extension;

    Filtro() {

        pedir_extension();

    }

    public void pedir_extension() {

        System.out.println("Introduce la extensión:");

        extension = readString();

    }

    @Override
    public boolean accept(File dir, String name) {

        return name.endsWith(extension);

    }

}
