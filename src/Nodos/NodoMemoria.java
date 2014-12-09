/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nodos;

/**
 *
 * @author Ivan Dario Villa
 */

import Identidades.Memoria;

public class NodoMemoria {
    
    private Memoria memoria;
    private NodoMemoria liga;
    
    public NodoMemoria(){
        
        //this.memoria = memo;
    }
    
    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public NodoMemoria getLiga() {
        return liga;
    }

    public void setLiga(NodoMemoria liga) {
        this.liga = liga;
    }

    
    
}
