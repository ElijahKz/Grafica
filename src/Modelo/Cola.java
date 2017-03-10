/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.LinkedList;

/**
 *
 * @author milmax.duque
 */
public class Cola < T extends Base> {
    LinkedList<T> cola;

    public Cola() {
        cola = new LinkedList< >();
        
    }
    
    public void colar(T e){
        cola.add(e);
    
    
    }
    
    public T desencolar(){
    
    return cola.removeFirst();
    
    
    }
    
    public boolean estaVacia(){
    return cola.isEmpty();
    
    }
    
    @Override
    public String toString(){
    String cad = "[";
    
    for(T e:cola){
    cad += " " + e.toString();
    
    
    }
    
    return cad + "]";
    
    
    }
    
}
