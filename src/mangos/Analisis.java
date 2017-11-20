/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author jai
 */
public class Analisis {

    private Columnas Columna;
    private Color Color;
    private Docenas Docena;
    private Lineas Linea;
  

    public void setBasesDatos(ArrayList BasesDatos) {
        Columna.setBasesDatos(BasesDatos);
    }

    public Analisis(ArrayList BasesDatos) {

        Numero[] datos = new Numero[37];

        for (int i = 0; i < datos.length; i++) {
            datos[i] = new Numero();
            // System.out.println(this.datos[i]);

        }
        this.Columna = new Columnas(datos, BasesDatos);
        this.Color = new Color(datos, BasesDatos);
        this.Docena = new Docenas(datos, BasesDatos);
        this.Linea = new Lineas(datos, BasesDatos);

        //System.out.println("akiii siii " + this.datos[this.BasesDatos.get(8)].getColumna());
        //this.verBasesDatos();
    }
 
    public void AnalizaApuesta(){
            this.Columna.Apuestas();
            this.Color.verDatosNumeroSeRepite();
  
    }
    
    public void analisis() {

    }

    @Override
    public String toString() {
        return (this.Columna.toString());
    }

////////////////////////////////MIRAR COMO GANAR ESTA APUESTA/////////////////
    public void verFuncionesColumnas() {

       // this.Columna.verColumnas();
      //  this.Columna.apostarDosCol();
       // this.Columna.ultimaColumRepe();
        //this.Columna.columnaUltTquiTaca();
        //this.Columna.vecesUltTquiTaca();
        //this.Columna.verNoRepetir(1);
        //this.Columna.verNoRepetir(2);
        //this.Columna.verNoRepetir(3);
      //  this.Columna.nApostarA90tiradas();
       //this.Columna.nCalientes();

    }

    public void verNumeros(int numero){
    
       // this.Color.todoLoContrario(numero);
    //  this.Color.verNumeroContrarios(numero);
       //this.Color.verSolo(numero);
     //this.Color.verSoloDistinto(numero);
 
    //    this.Columna.estudioDeLosCambio();
        
    }
    public void analizarElCambioEnApuestas(){
          this.Color.mirarCambiosEnTodasLasApuestas();
    }
    
    public void verFuncionesLineas() {
        this.Linea.verLineas();
        this.Linea.conteoCuantasLineasEn10(30);
    }

    public void verFuncionesDocenas() {
        this.Docena.verDocenas();

    }

    public void verFuncionesCombinadas() {

      
        this.Columna.CombinacionDocenasColumnas();

    }

    private Object getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
