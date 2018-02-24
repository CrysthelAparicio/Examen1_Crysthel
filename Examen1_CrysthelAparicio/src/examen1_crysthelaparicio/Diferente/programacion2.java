/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_crysthelaparicio.Diferente;

import examen1_crysthelaparicio.Archivo;
import examen1_crysthelaparicio.Carpeta;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author COPECO -13
 */
public class programacion2 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList list = new ArrayList();
    static ArrayList<Archivos> archivos = new ArrayList();
    static ArrayList<carpeta> Carpeta = new ArrayList();
    static Date fechacreacion = new Date();
    static Date fechamodificacion = new Date();
    static carpeta carpeta = new carpeta();
    static String comando1 = "mkdir", comando2 = "cat", comando3="ls";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        carpeta root = new carpeta();
        carpeta actual;
        actual = root;

        char resp = 's';
        String nuevo;

        System.out.println("Ingrese un nombre:");
        String nombre = sc.next();
        System.out.println("Ingrese un usuario");
        String usuario = sc.next();
        System.out.println("Capacidad de bytes o tamaño");
        int bytes = sc.nextInt();
        Date fecha1 = fechacreacion;
        System.out.println(fecha1);
        String opcion1 = "";

        archivos.add(new carpeta("root", bytes, fechacreacion, fechamodificacion, actual));
        for (int i = 0; i < archivos.size(); i++) {

            System.out.print(usuario + "/" + archivos.get(i).getNombre());

            nuevo = sc.next();
            String a = "mkdir", b = ".txt", c = ".exec", d = "cd..", e = "cd", f = "del", g = "Is", h= "del";
            if (nuevo.contains(a)) {

                String nombrecarpeta = nuevo.split(a)[1];
                Date fecha = new Date();
                archivos.add(new carpeta(nombrecarpeta, 10, fecha, fecha, actual));

            }
            if (nuevo.contains(b)) {
                String nom = nuevo.split(b)[0];
                String nombretxt = nom.split("cat")[1];
                Date fecha = new Date();;
                System.out.print("ingrese contenido:");
                String contenido = sc.next();
                archivos.add(new archivo_texto(contenido, nombretxt, 10, fecha, fecha, actual));
            }
            if (nuevo.contains(c)) {
                String nom = nuevo.split(c)[0];
                String nombrexec = nom.split("cat")[1];
                Date fecha = new Date();
                System.out.println("Ingrese sistema operativo al que pertenece");
                String sistemop = sc.next();
                System.out.print("ingrese contenido:");
                String contenido = sc.next();
                String cadena = "";
                if (contenido.contains("0")) {
                    for (int j = 0; j < contenido.length(); j++) {
                        if (contenido.charAt(j) != '0') {
                            cadena += contenido.charAt(j);
                        }
                    }
                }
                System.out.println(cadena);
                archivos.add(new ejecutable(cadena, sistemop, nombrexec, 10, fecha, fecha, actual));

            }
            if (nuevo.contains(f)) {
                String ar = nuevo.split(f)[1];
                for (int j = 0; j < archivos.size(); j++) {
                    if (archivos.get(i).getNombre().equals(ar)) {
                        archivos.remove(j);
                    }
                }

            }
            if (nuevo.contains(g)) {
                String cadena = "";
                for (int j = 0; j < archivos.size(); j++) {
                    cadena += archivos.get(i) + "\n";
                }
                System.out.println(cadena);
            }

            if (nuevo.contains(h)) {
                String mod = nuevo.split(h)[1];
                for (int j = 0; j < archivos.size(); j++) {
                    if(Carpeta.get(i).getNombre().equals(mod)){
                        Date fechacreacion = carpeta.modificar();
                        //((carpeta)Carpeta.get(i).setFechacreacion(fechacreacion));
                    }
                }
              
                }
            }

        }

    }
