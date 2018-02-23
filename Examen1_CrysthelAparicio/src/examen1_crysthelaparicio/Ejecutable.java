/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_crysthelaparicio;

/**
 *
 * @author COPECO -13
 */
public class Ejecutable {

    private String texto;
    private String sistemaOperativo;

    public Ejecutable() {
    }

    public Ejecutable(String texto, String sistemaOperativo) {
        this.texto = texto;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return "Ejecutable{" + "texto=" + texto + ", sistemaOperativo=" + sistemaOperativo + '}';
    }

}
