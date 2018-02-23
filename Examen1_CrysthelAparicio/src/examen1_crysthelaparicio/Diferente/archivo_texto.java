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

    private String nombrearchivotext;

    public archivo_texto() {
    }

    public archivo_texto(String nombrearchivotext, String nombre, int tamaño, Date fechacreacion, Date fechamodificacion) {
        super(nombre, tamaño, fechacreacion, fechamodificacion);
        this.nombrearchivotext = nombrearchivotext;
    }

    public String getNombrearchivotext() {
        return nombrearchivotext;
    }

    public void setNombrearchivotext(String nombrearchivotext) {
        this.nombrearchivotext = nombrearchivotext;
    }

    @Override
    public String toString() {
        return "archivo_texto{" + "nombrearchivotext=" + nombrearchivotext + '}';
    }
}
