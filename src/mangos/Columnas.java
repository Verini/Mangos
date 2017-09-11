/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import java.util.ArrayList;

/**
 *
 * @author Andrés Eloy Castro Manciny.
 * @author Jairo González Lemus.
 */
public class Columnas extends Estudio {

    public Columnas(Numero[] datos, ArrayList BasesDatos) {
        super(datos, BasesDatos);
    }
    
    public int totalColumnaEn(int columna) {
        int totalColumna = 0;
        for (int i = 0; i < Columnas.BasesDatos.size(); i++) {

            if (datos[BasesDatos.get(i)].getColumna() == columna) {
                totalColumna++;
            }
        }
        return totalColumna;
    }
    
    public int totalColumna() {
        return totalColumnaEn(1) + totalColumnaEn(2)+totalColumnaEn(3);
    }
    
    public String verColumnas(){
        String Valor = "";
        int tTotal = this.totalColumna();
        int tCol = this.totalColumnaEn(1);
        Valor = "\nTotal de numeros: " + this.BasesDatos.size();
        Valor =  Valor + "\nTotal que son 0: " + this.totalCero()+ "\n";
        Valor = Valor + "Tatal que son columnas: " + tTotal + "\n";
     
        float por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tColumna 1: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
        
        tCol = this.totalColumnaEn(2);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tColumna 2: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
    
        tCol = this.totalColumnaEn(3);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tColumna 3: " + tCol + "   "+ String.format("%.2f", por) + "%\n";
        System.out.println( Valor);
        return Valor;
    }
    
    
    
    
    public int MayorSeguida(int columna, int num) {
        int Mayor_seguida = 0;
        int cont1 = -1;

        for (int i = 0; i < Columnas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getColumna() == columna) {

                cont1++;
                if (num == cont1) {
                    Mayor_seguida++;
                }

            } else {
                cont1 = -1;
            }

        }
        return Mayor_seguida;
    }

    public int MayorSeguida(int columna) {
        int Mayor_seguida = 0;
        int cont1 = -1;

        for (int i = 0; i < Columnas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getColumna() == columna) {

                cont1++;

                if (Mayor_seguida <= cont1) {
                    Mayor_seguida = cont1;

                }

            } else {

                cont1 = -1;

            }

        }
        return Mayor_seguida;
    }

 
    

    /**
     * Cantidad de 0 que hay en las tres columnas.
     *
     * @return La suma de la cantidad de 0 de las 3 columnas.
     */
    public int totalCero() {
        int cont1 = 0;

        for (int i = 0; i < Columnas.BasesDatos.size(); i++) { 
                    if(datos[BasesDatos.get(i)].getValor() == 0) {
                       
                         cont1++;
                    }
        }
        return cont1++;
    }

    /*
    public void verTotalColumnas() {

        System.out.println(this.total_c1 + "  " + this.total_c2 + "  " + this.total_c3);
        
        System.out.println(this.Mayor_seguida_c1 + " " + this.Mayor_seguida_c2 + " " + this.Mayor_seguida_c3);
        System.out.println(this.contNumVeces+ " "+  contTotalSecion);
    }
     */
}
