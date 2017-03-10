/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_ej;

import Datos.Valor;
import Modelo.Cola;
import Modelo.OperacionPila;
import Modelo.OperacionesCola;
import Modelo.Pila;
import configuracion.Tools;
import configuracion.Tools2;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JOptionPane;

/**
 *
 * @author milmax.duque
 */
public class FXMLDocumentController implements Initializable {
    

    private String html = "";
    private String auxi;
   
 
     private Pila<Valor> pila;
     private Cola<Valor> cola;
     private int contador;
     private int contador2;
     @FXML
     Label label;
     @FXML
     Label bienvenido;
     @FXML
     private WebEngine web2;
     @FXML
     private WebEngine webEngine2;
     @FXML
     private WebView webView2;
     @FXML
     private WebView web; 
     
     
    @FXML
    private void handleButtonAction(ActionEvent event) {
        auxi = "--------" + contador + "--------";
        //valor = new Valor(auxi);
          pila.apilar(new Valor(auxi));                             
              
        contador++;
       web2.loadContent(Tools.convertirPilaAHtml(pila));
    }
     @FXML
    private void colar(ActionEvent event) {
        auxi = "--------" + contador2 + "--------";
        //valor = new Valor(auxi);
          cola.colar(new Valor(auxi));                             
              
        contador2++;
       web2.loadContent(Tools2.convertirColaAHtml(cola));
    }
    
    @FXML
    private void handleButtonAction2(ActionEvent event) {
       pila.desapilar();        
        contador--;     
       web2.loadContent(Tools.convertirPilaAHtml(pila));
        
    }
    
     @FXML
    private void desencolar(ActionEvent event) {
       cola.desencolar();
        contador2--;     
       web2.loadContent(Tools2.convertirColaAHtml(cola));
        
    }
   
    
    @FXML
    private void handleButtonAction5(ActionEvent event) {

   webEngine2.loadContent(Tools.convertirPilaAHtml(OperacionPila.duplicar(pila)));


    }
    
    @FXML
    private void clonar(ActionEvent event) {

   webEngine2.loadContent(Tools2.convertirColaAHtml(OperacionesCola.clonar(cola)));


    }
    @FXML
    private void invertir(ActionEvent event){
    
    webEngine2.loadContent(Tools2.convertirColaAHtml(OperacionesCola.invertir(cola)));
    }
    
    
    @FXML
    private void handleButtonAction6(ActionEvent event) {
        
     webEngine2.loadContent(Tools.convertirPilaAHtml(OperacionPila.invertirPila(pila)));
    }
    
    public void modificar(){
        bienvenido.setText("@Autor:");
       label.setText("Milmax Jeffrey Duque Asprilla Ing. Multimedia");
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        contador= 0;
        contador2 = 0;
        cola = new Cola< >(  );
        pila = new Pila< >(  );
        webEngine2 = webView2.getEngine();
        web2 = web.getEngine();              
        web2.loadContent(Tools.convertirPilaAHtml(pila));
        webEngine2.loadContent(Tools.convertirPilaAHtml(OperacionPila.duplicar(pila)));
        webEngine2.loadContent(Tools.convertirPilaAHtml(OperacionPila.invertirPila(pila)));
    }    
    
}
