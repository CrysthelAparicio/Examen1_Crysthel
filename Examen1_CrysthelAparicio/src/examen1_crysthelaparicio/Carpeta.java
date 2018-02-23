/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_crysthelaparicio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author COPECO -13
 */
public class Carpeta extends Fichero {

    private ArrayList<Fichero> documentos = new ArrayList();

    public Carpeta() {
        super();
    }

    public Carpeta(int tamano, Date FechaCreacion, String hechoPor, String nombre, Carpeta perteneceA) throws Excepcion {
        super(tamano, FechaCreacion, hechoPor, nombre, perteneceA);
    }

    public ArrayList<Fichero> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(ArrayList<Fichero> documentos) {
        this.documentos = documentos;
    }

    @Override
    public String toString() {
        return super.toString() + "Carpeta{" + "documentos=" + documentos + '}';
    }

}
