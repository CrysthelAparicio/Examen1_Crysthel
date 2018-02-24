/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_crysthelaparicio.Diferente;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author COPECO -13
 */
public class carpeta extends Archivos {

    private ArrayList<Archivos> listaarchivos = new ArrayList();

    public carpeta() {
    }

    public carpeta(String nombre, int tamaño, Date fechacreacion, Date fechamodificacion, carpeta perteneceA) {
        super(nombre, tamaño, fechacreacion, fechamodificacion, perteneceA);
    }

    public ArrayList<Archivos> getListaarchivos() {
        return listaarchivos;
    }

    public void setListaarchivos(ArrayList<Archivos> listaarchivos) {
        this.listaarchivos = listaarchivos;
    }

    @Override
    public String toString() {
        return "carpeta{" + "listaarchivos=" + listaarchivos + '}';
    }

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Date modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
