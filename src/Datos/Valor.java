/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Base;

/**
 *
 * @author milmax.duque
 */
public class Valor extends Base {

 private String valor;
  public Valor(){}
 
   public Valor(String valor){
   this.valor = valor;
   
   
   }

    public Valor(int contador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getValor() {
        return valor;
    }

    
    public void setValor(String valor) {
        this.valor = valor;
    }

    
    
    
    @Override
    public Base copia() {
        return new Valor(valor);
    }

    @Override
    public String toString() {
        return  valor;
    }
    
}
