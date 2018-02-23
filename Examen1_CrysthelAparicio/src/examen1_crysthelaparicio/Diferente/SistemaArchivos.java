/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_crysthelaparicio.Diferente;

/**
 *
 * @author COPECO -13
 */
public class SistemaArchivos {

    private String nombre;
    private String usuario;
    private int capacidad;

    public SistemaArchivos() {
    }

    public SistemaArchivos(String nombre, String usuario, int capacidad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "SistemaArchivos{" + "nombre=" + nombre + ", usuario=" + usuario + ", capacidad=" + capacidad;
    }

}
