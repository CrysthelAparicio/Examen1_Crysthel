/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_crysthelaparicio.Diferente;

import java.util.Date;

/**
 *
 * @author COPECO -13
 */
public class archivo_texto extends Archivos {

    private String contenido;

    public archivo_texto() {
    }

    public archivo_texto(String contenido, String nombre, int tamaño, Date fechacreacion, Date fechamodificacion, carpeta perteneceA) {
        super(nombre, tamaño, fechacreacion, fechamodificacion, perteneceA);
        this.contenido = contenido;
    }

    public String getNombrearchivotext() {
        return contenido;
    }

    public void setNombrearchivotext(String nombrearchivotext) {
        this.contenido = nombrearchivotext;
    }

    @Override
    public String toString() {
        return "archivo_texto{" + "nombrearchivotext=" + contenido + '}';
    }
    
    public Date modificar(){
        Date fecha = new Date();
        return fecha;
    }

}
