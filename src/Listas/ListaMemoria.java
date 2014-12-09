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

import Identidades.Memoria;
import Nodos.NodoMemoria;

public class ListaMemoria {
    
    private NodoMemoria primero;
    private NodoMemoria ultimo;
    
    
    public ListaMemoria(){
        
        primero = null;
        ultimo = null;
        
    }

    public NodoMemoria getPrimero() {
        return primero;
    }

    public void setPrimero(NodoMemoria primero) {
        this.primero = primero;
    }

    public NodoMemoria getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoMemoria ultimo) {
        this.ultimo = ultimo;
    }
    
    public boolean setMemoria(Memoria memo){
        
        boolean sw= false;
        NodoMemoria n = new NodoMemoria();
        n.setMemoria(memo);
        if(primero==null)
        {
            primero=n;
            ultimo=n;
            n.setLiga(null);
            sw=true;
        }
        else
        {
            n.setLiga(null);
            ultimo.setLiga(n);
            ultimo=n;
            sw=true;
        }
    
        return sw;
    }



}
