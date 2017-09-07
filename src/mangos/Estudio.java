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
public abstract class Estudio {

    public Numero[] datos;
    protected ArrayList<Integer> BasesDatos;
    
    
    
    
    

    public Estudio(Numero[] datos, ArrayList BasesDatos) {
        this.datos = datos;
        this.BasesDatos = BasesDatos;
    }

    ;
    
    
    
    
    
    public abstract void verTotalColumnas();
     
     

    @Override
    public String toString() {
        return this.toString();
    }
;

}
