import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import static teclado.Teclado.readString;

public class Ej2 {

    public static void main (String args[]) {

        String[] lista_directorioactual;

        String[] lista_subdirectorio;

        File directorio = new File("directorio");

        File fichero1 = new File(directorio, "fichero1.txt");

        File fichero2 = new File(directorio, "fichero2.txt");

        File fichero3 = new File(directorio, "fichero3.txt");

        File subdirectorio = new File("directorio\\subdirectorio\\");

        File fichero4 = new File(subdirectorio, "fichero4.txt");

        if (directorio.exists()) {

            System.out.println("El primer directorio ya existe");

        }

        else {

            directorio.mkdir();

        }

        try {

          if (fichero1.createNewFile() && fichero2.createNewFile() && fichero3.createNewFile()) {

              System.out.println("Los tres archivos se ha creado correctamente.");

          }

          else {

              System.out.println("Uno de los tres archivos ya existe");

          }


        } catch (IOException e) {

            System.out.println("Error al crear los tres archivos.");

        }

        if (fichero1.exists()) {

            fichero1.delete();

            System.out.println("El primer archivo se ha borrado.");

        }

        else {

            System.out.println("No se ha encontrado el primer archivo.");

        }

        if(fichero2.exists()) {

            fichero2.renameTo(new File("fichero2_nuevoNombre.txt"));

            System.out.println("Se ha renombrado el segundo archivo.");

        }


        if (subdirectorio.exists()) {

            System.out.println("El subdirectorio ya existe");

        }

        else {

            subdirectorio.mkdir();

        }


        subdirectorio.mkdir();

        try {

            if(fichero4.createNewFile()) {

                System.out.println("El cuarto archivo se ha creado correctamente");

            }

        } catch (IOException e) {

            System.out.println("Error: no se ha podido crear el cuarto archivo archivo.");

        }



        mostrar_dir_y_cont(directorio);

        mostrar_dir_y_cont(subdirectorio);



    }


    public static void mostrar_dir_y_cont(File directorio) { ;

        String[] contenido;

        System.out.printf("Directorio: %s", directorio.getAbsolutePath());

        contenido = directorio.list();

        Arrays.asList(contenido).forEach(System.out::println);

    }

}
