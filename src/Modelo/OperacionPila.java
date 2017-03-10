/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author milmax.duque
 */
public class OperacionPila <T extends Base> {
    
    public static <T extends Base> Pila<T> duplicar(Pila<T> pilaOriginal){
        T valor;
        Pila<T> aux = new Pila<>();
        Pila<T> duplicada  = new Pila<>(); 
               
        while(!pilaOriginal.estaVacia()){
        aux.apilar(pilaOriginal.desapilar());
        
        
        }

        while(!aux.estaVacia()){
          valor = aux.desapilar();
        pilaOriginal.apilar(valor);
        duplicada.apilar(valor);
        }
    
    return duplicada;    
    }
    
    public static <T extends Base> Pila<T> invertirPila(Pila<T> pilaOriginal){
        Pila<T> pilaCopia = duplicar(pilaOriginal);
        Pila<T> pilaInvert = new Pila<>();
        
        while(!pilaCopia.estaVacia()){
        pilaInvert.apilar(pilaCopia.desapilar());
        
        
        }
        
        return pilaInvert;
        
        
    }
}
