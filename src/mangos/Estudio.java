/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import java.util.ArrayList;

/**
 *
 * @author Andrés
 */
public class Estudio {

    protected Numero[] datos;
    protected static ArrayList<Integer> BasesDatos;

    
    
///////////////////////////BASICA///////////////////////////////////////////////
    public Estudio(Numero[] datos, ArrayList BasesDatos) {
        this.datos = datos;
        this.BasesDatos = BasesDatos;
    }
    
    public void setBasesDatos(ArrayList<Integer> BasesDatos) {
        this.BasesDatos = BasesDatos;
    }

    public int getTamBasesDatos() {
        return Estudio.BasesDatos.size();
    }

    
    
    
    
    @Override
    public String toString() {
        String valor = "";
        /* for (int i = 0; i < this.datos.length; i++) {
            valor = "Analisis{" + "datos=" + this.datos[i] + '}';
            System.out.println(valor);
        }*/

        for (int i = 0; i < this.BasesDatos.size(); i++) {
            valor = "Analisis{" + "datos=" + this.BasesDatos.get(i) + ',' + datos[BasesDatos.get(i)].getColumna() + '}';
            System.out.println(valor);

        }

        return valor;

    }
    


////////////////////////////////////////////////////////////////////////////////


///////////////////////////NUMERO CALIENTE//////////////////////////////////////
    public String nCalientes() {
        float por;

        int cont = 0;
        for (int i = 0; i < 37; i++) {

            por = (float) ((float) (100 * contarNumero(i) / (float) this.BasesDatos.size()));
            cont = contarNumero(i) + cont;
            //if(por >=3 )
            System.out.println("Numero " + i + ": " + contarNumero(i) + "    " + String.format("%03.2f", por) + "%");
        }

        System.out.println("Total : " + cont);
        return "";
    }

    private int contarNumero(int numero) {
        int cont = 0;
        for (int i = 0; i < this.BasesDatos.size(); i++) {

            if (this.BasesDatos.get(i) == numero) {
                cont++;
            }

        }
        return cont;
    }
    
    public void CombinacionDocenasColumnas(){
    int cc=0;
    int ci=0;
    int ic=0;
    int ii=0;
    int cero=0;
    
    for (int i = 0; i < BasesDatos.size()-1; i++){
        int columnaActual=datos[BasesDatos.get(i)].getColumna();
        int columnaSiguiente=datos[BasesDatos.get(i+1)].getColumna();
        int docenaActual=datos[BasesDatos.get(i)].getDocena();
        int docenaSiguiente=datos[BasesDatos.get(i+1)].getDocena();
        if (BasesDatos.get(i+1)!=0){
            if ((columnaActual != columnaSiguiente) && (docenaActual != docenaSiguiente)) {
                cc++;
                
                
            }
            
            else if ((columnaActual != columnaSiguiente) && (docenaActual == docenaSiguiente)) {
                ci++;
        }
            else if ((columnaActual == columnaSiguiente) && (docenaActual != docenaSiguiente)) {
                ic++;
        }
            else{
                ii++;
                
            }
        }else{
            cero++;
        }
        
    }
    
    System.out.println( "Numero de veces que hace un cambio - cambio: "+ cc);
    System.out.println( "Numero de veces que hace un cambio - repite: "+ ci);
    System.out.println( "Numero de veces que hace un repite - cambio: "+ ic);
    System.out.println( "Numero de veces que hace un repite - repite: "+ ii);
    
    
    System.out.println( "Jugando a cc ganamos cc menos los ceros * 21: "+ (cc*21));
    System.out.println( "Jugando a cc perdemos: "+ ((ci+ic+ii+cero)*16));
    System.out.println( "Balance es igual a: "+ ((cc*21)-(ci+ic+ii+cero)*16));
    
}
    
     public void CombinacionDocenasColumnasLineas(){
    int ccc=0;
    int cic=0;
    int icc=0;
    int iic=0;
    int cci=0;
    int cii=0;
    int ici=0;
    int iii=0;
    
    int cero=0;
    
    for (int i = 0; i < BasesDatos.size()-1; i++){
        int columnaActual=datos[BasesDatos.get(i)].getColumna();
        int columnaSiguiente=datos[BasesDatos.get(i+1)].getColumna();
        int docenaActual=datos[BasesDatos.get(i)].getDocena();
        int docenaSiguiente=datos[BasesDatos.get(i+1)].getDocena();
        int lineaActual=datos[BasesDatos.get(i)].getLinea();
        int lineaSiguiente=datos[BasesDatos.get(i+1)].getLinea();
        
        if (BasesDatos.get(i+1)!=0){
            if ((columnaActual != columnaSiguiente) && (docenaActual != docenaSiguiente) && (lineaActual != lineaSiguiente) ) {
                ccc++;  
            }
            
            else if ((columnaActual != columnaSiguiente) && (docenaActual == docenaSiguiente) && (lineaActual != lineaSiguiente)) {
                cic++;
        }
            else if ((columnaActual == columnaSiguiente) && (docenaActual != docenaSiguiente) && (lineaActual != lineaSiguiente)) {
                icc++;
        }
            else if ((columnaActual == columnaSiguiente) && (docenaActual == docenaSiguiente) && (lineaActual != lineaSiguiente)) {
                iic++;
        }
            else if ((columnaActual != columnaSiguiente) && (docenaActual != docenaSiguiente) && (lineaActual == lineaSiguiente)) {
                cci++;
        }
            else if (columnaActual != columnaSiguiente && docenaActual == docenaSiguiente && lineaActual == lineaSiguiente) {
                cii++;
        }
            else if (columnaActual == columnaSiguiente && docenaActual != docenaSiguiente && lineaActual == lineaSiguiente) {
                ici++;
        }
            else{
                iii++;
                
            }
        }else{
            cero++;
        }
        
    }
    
    System.out.println( "Numero de veces que hace un cambio - cambio - cambio: "+ ccc);
    System.out.println( "Numero de veces que hace un cambio - repite - cambio: "+ cic);
    System.out.println( "Numero de veces que hace un repite - cambio - cambio: "+ icc);
    System.out.println( "Numero de veces que hace un repite - repite - cambio: "+ iic);
    System.out.println( "Numero de veces que hace un cambio - cambio - repite: "+ cci);
    System.out.println( "Numero de veces que hace un cambio - repite - repite: "+ cii);
    System.out.println( "Numero de veces que hace un repite - cambio - repite: "+ ici);
    System.out.println( "Numero de veces que hace un repite - repite - repite: "+ iii);
    
   
    System.out.println( "Jugando a ccc ganamos cc menos los ceros * 23: "+ (ccc*23));
    System.out.println( "Jugando a ccc perdemos: "+ ((cic+icc+iic+cci+cii+ici+iii+cero)*14));
    System.out.println( "Balance es igual a: "+ ((ccc*23)-(cic+icc+iic+cci+cii+ici+iii+cero)*14));
 
}

////////////////////////////////////////////////////////////////////////////////
    


}
