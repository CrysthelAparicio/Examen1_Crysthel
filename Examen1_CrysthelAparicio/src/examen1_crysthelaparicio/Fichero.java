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
public class Fichero {

    protected int tamano;
    protected Date FechaCreacion;
    protected String hechoPor;
    protected String nombre;
    protected Carpeta perteneceA;

    public Fichero() {
    }

    public Fichero(int tamano, Date FechaCreacion, String hechoPor, String nombre, Carpeta perteneceA) throws Excepcion {
        if (tamano < 0 || tamano > 1024) {
            throw new Excepcion("El tamaño deber ser entre 0 y 1024");
        } else {
            this.tamano = tamano;
        }

        this.FechaCreacion = FechaCreacion;
        this.hechoPor = hechoPor;
        this.nombre = nombre;
        this.perteneceA = perteneceA;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) throws Excepcion {
        this.tamano = tamano;

    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public String getHechoPor() {
        return hechoPor;
    }

    public void setHechoPor(String hechoPor) {
        this.hechoPor = hechoPor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carpeta getPerteneceA() {
        return perteneceA;
    }

    public void setPerteneceA(Carpeta perteneceA) {
        this.perteneceA = perteneceA;
    }

    @Override
    public String toString() {
        return "Fichero{" + "tamano=" + tamano + ", FechaCreacion=" + FechaCreacion + ", hechoPor=" + hechoPor + ", nombre=" + nombre + '}';
    }

}
