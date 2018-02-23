/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_crysthelaparicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
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
                    + "c. Salir!\n");
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
}
