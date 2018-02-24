/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_crysthelaparicio;

import java.util.Date;

/**
 *
 * @author COPECO -13
 */
public class Archivo extends Fichero {

    private String contenido;

    public Archivo() {
        super();
    }

    public Archivo(String contenido, int tamano, Date FechaCreacion, String hechoPor, String nombre, Carpeta perteneceA) throws Excepcion {
        super(tamano, FechaCreacion, hechoPor, nombre, perteneceA);
        this.contenido = contenido;
    }

    public Archivo(String nombrecarpeta, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return super.toString() + "Archivo{" + "contenido=" + contenido + '}';
    }

}
