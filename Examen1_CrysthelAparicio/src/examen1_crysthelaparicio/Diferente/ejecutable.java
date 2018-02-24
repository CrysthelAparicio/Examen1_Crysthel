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
public class ejecutable extends Archivos {

    private String texto;
    private String sistema_operativo;

    public ejecutable() {
    }

    public ejecutable(String texto, String sistema_operativo, String nombre, int tamaño, Date fechacreacion, Date fechamodificacion, carpeta perteneceA) {
        super(nombre, tamaño, fechacreacion, fechamodificacion, perteneceA);
        this.texto = texto;
        this.sistema_operativo = sistema_operativo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    @Override
    public String toString() {
        return "ejecutable{" + "texto=" + texto + ", sistema_operativo=" + sistema_operativo + '}';
    }

}
