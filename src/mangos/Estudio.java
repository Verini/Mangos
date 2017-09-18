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

////////////////////////////////////////////////////////////////////////////////
    


}
