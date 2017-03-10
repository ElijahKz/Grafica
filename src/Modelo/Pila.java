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
public class Pila < T extends Base > {
   LinkedList<T> pila;
   
   public Pila(){
   pila = new LinkedList<>();
   
   }
   
   public void apilar(T e){
   pila.addFirst(e);
   
   
   }
   
   public T desapilar(){
  return pila.removeFirst(); 
   
   
   }
   
   
   public boolean estaVacia(){
   return pila.isEmpty();
   
   
   }

   @Override
    public String toString(){
    String cad = "[";
    
    for(T e:pila){
    cad += " " + e.toString();
    
    
    }
    
    return cad + "]";
    
    
    }
   
   
}
