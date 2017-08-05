/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

/**
 *
 * @author jai
 */
public class Analisis {
    Numero[] datos;
    
    public Analisis() {
               
        this.datos = new Numero[37];
        
        for (int i=1; i < this.datos.length  ;i++){
            this.datos[i] = new Numero();
            System.out.println(this.datos[i]);
        }
                    
    }

    @Override
    public String toString() {
        String valor=""; 
        for (int i=1; i < this.datos.length  ;i++){
            valor =  "Analisis{" + "datos=" + this.datos[i] + '}';
             System.out.println(valor);
        }
        
       
        return valor;
    }
    
    
}
