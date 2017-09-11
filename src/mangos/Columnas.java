/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Andrés
 */
public class Columnas extends Estudio {

    public Columnas(Numero[] datos, ArrayList BasesDatos) {
        super(datos, BasesDatos);

    }

    public int totalColumna(int columna) {
        int totalColumna = 0;
        for (int i = 0; i < this.BasesDatos.size(); i++) {

            if (datos[BasesDatos.get(i)].getColumna() == columna) {
                totalColumna++;
            }
            
        }
        
        return totalColumna;
    }

  
    public int MayorSeguida(int columna) {
        int Mayor_seguida=0;
        int cont1 = -1;
        
        for (int i = 0; i < this.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getColumna() == columna) {
                  
                        cont1++;  
                  
                    if(Mayor_seguida <= cont1){
                        Mayor_seguida =cont1;

                  }
                  
            
            }else{
                
                  cont1 = -1;                                
                  
            }
 
        }
        return Mayor_seguida;
    }
 
/*
    public void verTotalColumnas() {

        System.out.println(this.total_c1 + "  " + this.total_c2 + "  " + this.total_c3);
        
        System.out.println(this.Mayor_seguida_c1 + " " + this.Mayor_seguida_c2 + " " + this.Mayor_seguida_c3);
        System.out.println(this.contNumVeces+ " "+  contTotalSecion);
    }
*/
}
