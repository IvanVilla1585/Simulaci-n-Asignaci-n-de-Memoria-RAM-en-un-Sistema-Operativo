/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Helen
 */
import Nodos.*;
import Identidades.*;
import Listas.*;
import asignacionmemoria.*;

public class ListaAuxiliar {

    NodoAuxiliar primero;

    public ListaAuxiliar() {
        primero = null;
    }

    public NodoAuxiliar getPrimero() {
        return primero;
    }

    public void setPrimero(NodoAuxiliar primero) {
        this.primero = primero;
    }

   
}
