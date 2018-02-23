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
        String nuevo = null;

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
                    String comando = "";
                    String nombrecarpeta = "";
                    String sizecarpeta = "";
                    ArrayList<Object> lista = new ArrayList();

                    System.out.println("Ingrese un nombre: ");
                    String name = sc.next();
                    System.out.println("Ingrese su nombre de usuario: ");
                    String user = sc.next();
                    System.out.println("Ingrese el size: ");
                    int size = sc.nextInt();
                    lista.add(new SistemaArchivos(nombre, usuario, size));

                    System.out.print(usuario + "/" + "root" + "/");
                    sc.nextLine();
                    comando = sc.nextLine();
                    String comando2 = comando.substring(0, 5);
                    if ("mkdir".equalsIgnoreCase(comando2)) {
                        String[] palabra = comando.split("\n");
                        for (String direccion : palabra) {
                            System.out.println(direccion);
                        }
//            StringTokenizer st = new StringTokenizer(comando, " ");
//            System.out.println(st.countTokens());
//            while (st.hasMoreTokens()) {
//                nombrecarpeta = st.nextToken();

                    }
//            lista.add(new Archivo(nombrecarpeta, Integer.parseInt(sizecarpeta)));
//            System.out.println("Se ha creado la carpeta satisfactoriamente.");
                }

            }

        }
        CharSequence c = null;
        if (nuevo.contains(c)) {
            //crear ejecutable
        }
//            ...
    }

}
