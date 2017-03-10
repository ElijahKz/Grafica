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
public class OperacionesCola <T extends Base> {
    
    public static <T extends Base> Cola<T> clonar(Cola<T> colaInicial){
       Cola< T > clon = new Cola < >( );
       Cola < T > colaAux = new Cola < >( );
       T auxiliar;
       
       while(!colaInicial.estaVacia()){
           colaAux.colar(colaInicial.desencolar());          
         
       }
       
       while(!colaAux.estaVacia()){
      auxiliar = colaAux.desencolar();
         clon.colar(auxiliar);
         colaInicial.colar(auxiliar);
       
       }
       
       return clon;
    }
    
    
    public static <T extends Base> Cola<T> invertir(Cola<T> colaInicial){
    
        
        Cola< T > clonInicial = clonar(colaInicial);
        
      Cola< T > invertida = new Cola<  >( );
          LinkedList< T > listaAuxiliar = new LinkedList<  >(  );
           T auxi;
           
        while(!clonInicial.estaVacia()){
        
          auxi = (clonInicial.desencolar());
          listaAuxiliar.addFirst(auxi);

         }
        
    
        for (int i = 0 ; i < listaAuxiliar.size(); i++) {
            invertida.colar(listaAuxiliar.get(i));
        }
    return invertida;
    
    }
    
    
    
}
