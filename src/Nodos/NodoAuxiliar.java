/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Helen
 */
import Identidades.Auxiliar;

public class NodoAuxiliar {

    private Auxiliar auxiliar;
    private NodoAuxiliar liga;

    public NodoAuxiliar() {

    }

    public Auxiliar getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(Auxiliar auxiliar) {
        this.auxiliar = auxiliar;
    }

    public NodoAuxiliar getLiga() {
        return liga;
    }

    public void setLiga(NodoAuxiliar liga) {
        this.liga = liga;
    }

}
