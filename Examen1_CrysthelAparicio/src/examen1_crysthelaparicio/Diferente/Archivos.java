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
public class Archivos {

    private String nombre;
    private int tamaño;
    private Date fechacreacion;
    private Date fechamodificacion;

    public Archivos() {
    }

    public Archivos(String nombre, int tamaño, Date fechacreacion, Date fechamodificacion) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.fechacreacion = fechacreacion;
        this.fechamodificacion = fechamodificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    @Override
    public String toString() {
        return "Archivos{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", fechacreacion=" + fechacreacion + ", fechamodificacion=" + fechamodificacion + '}';
    }

}
