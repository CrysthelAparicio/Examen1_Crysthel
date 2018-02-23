/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_crysthelaparicio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author COPECO -13
 */
public class Examen1_CrysthelAparicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Crear nuevo directorio
        //File directorio = new File("directorio de ejemplo");
        //Comprobar si un directorio existe
        if (directorio.exists()) {
            System.out.println("El directorio ya existe");
        } else {
            System.out.println("El directorio no existe");
        }

        //Comprobando si una ruta es un directorio
        if (!directorio.exists()) {
            directorio.mkdir();
            if (directorio.isDirectory()) {
                System.out.println(directorio + "es un directorio");
            }
        }

        //Listar el Contenido del Directorio
        for (int i = 0; i < 4; i++) {
            File dir = new File(directorio + "/directorio" + i);
            if (dir.mkdir()) {
                System.out.println("Directorio" + dir + "creado");
            }
        }
        String[] listadoDirectorios = directorio.list();
        for (String filename : listadoDirectorios) {
            System.out.println(filename);
        }

        //Comprobando que un directorio esta vacio
        if (directorio.list().length == 0) {
            System.out.println("El directorio esta vacio");
        } else {
            System.out.println("El directorio no esta vacio");
        }

        //Eliminar Directorio
        eliminarRecursivamente(directorio);
        System.out.println("");

        //Copiando Directorios
        //Renombrar Directorios
        File nuevoDirectorio = null;

        if (directorio.exists()) {
            directorio.renameTo(nuevoDirectorio = new File("directorio de ejemplo renombrado"));
            System.out.println("El nuevo nombre/ruta es" + nuevoDirectorio.getAbsolutePath());

        } else {
            System.out.println("El directorio origen/destino no existe o es un directorio");
        }

        //cambiando la ruta de un directorio
        File directorioM = new File("directorio de ejemplo renombrado");

        if (directorio.exists()) {
            directorio.renameTo(nuevoDirectorio = new File("C:\\Users\\COPECO -13\\Desktop\\Examen1_Crysthel\\Guardado\\nueva"));
            System.out.println("El nuevo nombre/ruta es: " + nuevoDirectorio.getAbsolutePath());
        } else {
            System.out.println("El director origen/destino no existe o no es un directorio");
        }

        //////////////////////////////////
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        Carpeta raiz = new Carpeta();
        Carpeta actual;
        actual = raiz;
        String opcion = " ";
        ArrayList lista = new ArrayList();
        while (!opcion.equalsIgnoreCase("c")) {
            opcion = JOptionPane.showInputDialog("Menu\n"
                    + "a- Sistema de Archivo\n"
                    + "b. Tamaño del Arreglo\n"
                    + "c. Directorios\n");
            if (opcion.equalsIgnoreCase("a")) {
                int opcion2 = 0;
                while (opcion2 != 7) {
                    opcion2 = Integer.parseInt(JOptionPane.showInputDialog("1. Entrar en una Subcarpeta\n"
                            + "2. Regresar carpeta anterior\n"
                            + "3. Crear un archivo\n"
                            + "4. Crear una Carpeta\n"
                            + "5. Listar directorio Actual\n"
                            + "6. Listar todo el File System\n"
                            + "7. Salir!\n"));
                    if (opcion2 == 1) {
                        System.out.println("A que quiere entrar");
                        int pos = input.nextInt();
//                actual = (Carpeta) lista.get();
                    }
                    if (opcion2 == 2) {
                        actual = actual.getPerteneceA();
                    }
                    if (opcion2 == 3) {

                        try {
                            int tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño: "));
                            Date fecha = new Date();
                            String hecho = JOptionPane.showInputDialog("Ingrese el autor");
                            String nombre_archivo = JOptionPane.showInputDialog("Ingrese el nombre del Archivo: ");

                            String contenido = JOptionPane.showInputDialog("Ingrese el contenido del archivo");
                            lista.add(new Archivo(contenido, tamano, fecha, hecho, nombre_archivo, actual));
                        } catch (Excepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                        raiz.setDocumentos(lista);
//                        actual = raiz;

                    }
                    if (opcion2 == 4) {
                        int tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño: "));
                        Date fecha = new Date();
                        String hecho = JOptionPane.showInputDialog("Ingrese el autor");
                        String nombre_carpeta = JOptionPane.showInputDialog("Ingrese el nombre de la Carpeta: ");
                        try {
                            lista.add(new Carpeta(tamano, fecha, hecho, nombre_carpeta, actual));
                        } catch (Excepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                        raiz.setDocumentos(lista);
//                        actual = raiz;
                        crear();
                    }
                    if (opcion2 == 5) {
                        System.out.println(actual);
                    }
                    if (opcion2 == 6) {
                        System.out.println(raiz);
                    }
                }
            }
            if (opcion.equalsIgnoreCase("b")) {
                System.out.println("Ingrese tamaño del arreglo: ");
                int p = input.nextInt();
                int[] a = new int[p];
                for (int i = 0; i < p; i++) {
                    a[i] = 1 + r.nextInt(10);
                }
                System.out.println(promediopares(a, 0));

            }
            if (opcion.equalsIgnoreCase("c")) {
                int opcion3 = 0;
                while (opcion3 != 7) {
                    opcion3 = Integer.parseInt(JOptionPane.showInputDialog("1. Iniciar un Directorio\n"
                            + "2. Crear Directorios\n"
                            + "3. Otra manera de crear directorios\n"
                            + "4. Crear una Carpeta\n"
                            + "5. Listar directorio Actual\n"
                            + "6. Listar todo el File System\n"
                            + "7. Salir!\n"));
                    if (opcion3 == 1) {
                        //DIRECTORIOS
                        String separator = File.separator;
                        System.out.println("Separador de ruta: *" + separator);
                    }
                    if (opcion3 == 2) {
                        //Crear Directorio
                        File directorio = new File("directorio de ejemplo");
                        if (directorio.mkdir()) {
                            System.out.println("Directorio creado en: " + directorio.getAbsolutePath());
                        } else {
                            System.out.println("No se ha creado el directorio");
                        }

                    }
                    if (opcion3 == 3) {
                        //Otra forma de crear directorio
                        File directorioN = new File("directorio de ejemplo/directorio1/directorio2/directorio3/directorio4");
                        if (directorioN.mkdirs()) {
                            System.out.println("Directorio creado en " + directorioN.getAbsolutePath());
                        }
                        System.out.println("");
                    }

                }
            }

        }
    }

    public static int promediopares(int a[], int p) {
        int w = 0, cont = 0;
        if (p == a.length - 1) {
            return a[p];
        } else {
            if (a[p] % 2 == 0) {
                w = a[p];
                cont++;
            }
            return w / promediopares(a, p + 1);
        }

    }

    public class Crear_Carpetas_Y_Archivos {

        String carpetas = "C:\\Users\\COPECO -13\\Desktop\\Examen1_Crysthel\\Guardado\\nueva";
        String archivo = "Archivo1.txt";
    }

    public static void crear() {
        String carpetas = "C:\\Users\\COPECO -13\\Desktop\\Examen1_Crysthel\\Guardado\\nueva";
        File crea_carpeta = new File(carpetas);
        String archivo = "Archivo1.txt";
        File crea_archivo = new File(carpetas + archivo);

        if (crea_archivo.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo ya existe");
        } else {
            JOptionPane.showMessageDialog(null, "No existen pero se crearan");
            crea_carpeta.mkdirs();
            try {
                if (crea_archivo.createNewFile()) {
                    JOptionPane.showMessageDialog(null, "Archivos Creados");
                } else {
                    JOptionPane.showMessageDialog(null, "Archivos No Creados");
                }
            } catch (IOException ex) {
                Logger.getLogger(Examen1_CrysthelAparicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static void eliminarRecursivamente(File directorio) {
        File[] ficheros = directorio.listFiles();

        for (int x = 0; x < ficheros.length; x++) {
            if (ficheros[x].isDirectory()) {
                eliminarRecursivamente(ficheros[x]);
            }
            ficheros[x].delete();
        }
    }

    public static void copiarDirectorio() {
        String nombreDirectorioOrigen = Teclado.LeerCadena("Introduzca el nombre del directorio origen: ");
        File directorioOrigen = new File(nombreDirectorioOrigen);
        String nombreDirectorioDestino = Teclado.LeerCadena("Instroduzca el nombre del directorio destino: ");
        File directorioDestino = new File(nombreDirectorioDestino);

        if (!directorioOrigen.exists()) {
            System.out.println("El directorio no existe");
        } else {
            try {
                copiarCarpeta(directorioOrigen, directorioDestino);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void copiarCarpeta(File src, File dest) throws IOException {
        if (src.isDirectory()) {
            if (!dest.exists()) {
                dest.mkdir();
                System.out.println("Directorio copiado desde: " + src + "a" + dest);
            }
            String files[] = src.list();

            for (String file : files) {
                File srcFile = new File(src, file);
                File destFile = new File(dest, file);

                copiarCarpeta(srcFile, destFile);
            }

        } else {
            InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dest);

            byte[] buffer = new byte[1024];

            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.close();
            System.out.println("Archivo copiado desde: " + src + "a" + "dest");
        }
    }
}
