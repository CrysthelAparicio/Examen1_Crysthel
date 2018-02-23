/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_crysthelaparicio.Diferente;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author COPECO -13
 */
public class programacion2 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Archivos> archivos = new ArrayList();
    static ArrayList<carpeta> Carpeta = new ArrayList();
//static Date fechacreacion;
//static Date fechamodificacion;
    static Date fechacreacion = new Date();
    static Date fechamodificacion = new Date();
    static carpeta carpeta = new carpeta();
    static String comando1 = "mkdir", comando2 = "cat";

    public static void main(String[] args) {
        char resp = 's';
        String nuevo;

        System.out.println("Ingrese nombre:");
        String nombre = sc.next();
        System.out.println("Ingrese usuario");
        String usuario = sc.next();
        System.out.println("Capacidad de bytes");
        int bytes = sc.nextInt();
        Date fecha1 = fechacreacion;
        System.out.println(fecha1);

////crear capetaRaiz
        archivos.add(new carpeta("root", bytes, fecha1, fechamodificacion));
        for (int i = 0; i < archivos.size(); i++) {

            System.out.print(usuario + "/" + archivos.get(i).getNombre());

            while (resp == 's') {
                nuevo = sc.next();
                String a = "mkdir", b = ".txt", c = ".exec";
                if (nuevo.contains(a)) {
                    //crear carpeta

//        //Segunda forma, StringTokenizer
//       
//        StringTokenizer st=new StringTokenizer(nuevo," ");
//        JOptionPane.showMessageDialog(null, st.nextToken() );
//        while (st.hasMoreElements()) {
//            Object nextElement = st.nextElement();
//            System.out.println(nextElement);
                    Carpeta.add(new carpeta(nombre, i, fechacreacion, fechamodificacion));

                }
                if (nuevo.contains(b)) {
                    //crear texto

                }
                if (nuevo.contains(c)) {
                    //crear ejecutable
                }
//            ...
            }

        }

    }
}
