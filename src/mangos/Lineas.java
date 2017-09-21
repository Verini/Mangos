/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Andrés
 */
public class Lineas extends Estudio {

    public Lineas(Numero[] datos, ArrayList BasesDatos) {
        super(datos, BasesDatos);
    }

    public int totalLineasEn(int linea) {
        int totalLineas = 0;
        for (int i = 0; i < Lineas.BasesDatos.size(); i++) {

            if (datos[BasesDatos.get(i)].getLinea() == linea) {
                totalLineas++;
            }
        }
        return totalLineas;
    }

    public int totalLineas() {
        return totalLineasEn(1) + totalLineasEn(2) + totalLineasEn(3) + totalLineasEn(4) + totalLineasEn(5) + totalLineasEn(6) + totalLineasEn(7) + totalLineasEn(8) + totalLineasEn(9) + totalLineasEn(10) + totalLineasEn(11) + totalLineasEn(12);
    }

    public int vecesRepetidas(int linea, int cantidad) {

        int cant = 0;
        int n_repet = 0;
        int anterior;
        int actual;

        int tam = Lineas.BasesDatos.size() - 1;

        for (int i = 0; i < tam; i++) {

            if (datos[BasesDatos.get(i)].getLinea() == linea) {

                anterior = datos[BasesDatos.get(i)].getLinea();
                actual = datos[BasesDatos.get(i + 1)].getLinea();

                if (anterior == actual) {

                    n_repet++;
                } else {
                    if (n_repet == cantidad) {

                        if (actual == 0) {
                            //   System.out.println("anterio:  "+ anterior + " actual ; " +actual + "cant " + cant);

                        }

                        cant++;
                    }

                    n_repet = 0;

                }

            }

        }

        if (n_repet == cantidad) {
            cant++;
        }
        return cant;

    }

    public int MayorSeguida(int linea, int num) {
        int Mayor_seguida = 0;
        int cont1 = -1;

        for (int i = 0; i < Lineas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getLinea() == linea) {

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

    public int MayorSeguida(int linea) {
        int Mayor_seguida = 0;
        int cont1 = -1;

        for (int i = 0; i < Lineas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getLinea() == linea) {

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

    public int totalCero() {
        int cont1 = 0;

        for (int i = 0; i < Lineas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getValor() == 0) {

                cont1++;
            }
        }
        return cont1++;
    }

    public int conteoCuantasLineasEn10() {

        int partir = 9;
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < Lineas.BasesDatos.size(); i++) {

            if (partir != 0) {
                set.add(datos[BasesDatos.get(i)].getLinea());
                partir--;

            } else {
                int cont = 0;
                Iterator<Integer> myListIterator = set.iterator();
                while (myListIterator.hasNext()) {
                    Integer dato = myListIterator.next();
                    if (dato != 0) {
                        cont++;
                    }
                    //System.out.println(dato);
                }

                System.out.println(cont);

                set.clear();
                partir = 9;
                set.add(datos[BasesDatos.get(i)].getLinea());

            }

        }
        /*      
        int cont=0;        
        Iterator<Integer> myListIterator = set.iterator(); 
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next(); 
            if(dato !=0){
                 cont++;
            }
            System.out.println(dato);
        }        
        
        System.out.println(cont);
         */
        return 1;
    }

    public int conteoCuantasLineasEn10(int par) {

        int partir = par - 1;
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < Lineas.BasesDatos.size(); i++) {

            if (partir != 0) {
                set.add(datos[BasesDatos.get(i)].getLinea());
                partir--;

            } else {
                int cont = 0;
                Iterator<Integer> myListIterator = set.iterator();
                while (myListIterator.hasNext()) {
                    Integer dato = myListIterator.next();
                    if (dato != 0) {
                        cont++;
                    }
                    //System.out.println(dato);
                }

                System.out.println(cont);

                set.clear();
                partir = par - 1;
                set.add(datos[BasesDatos.get(i)].getLinea());

            }

        }
        /*      
        int cont=0;        
        Iterator<Integer> myListIterator = set.iterator(); 
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next(); 
            if(dato !=0){
                 cont++;
            }
            System.out.println(dato);
        }        
        
        System.out.println(cont);
         */
        return 1;
    }

    public String verLineas() {

        this.verLine();
        for (int i = 1; i <= 12; i++) {
            System.out.println("Mayor nuvero de veces seguidas Linea " + i + ":" + this.MayorSeguida(i));
        }
        for (int j = 1; j <= 12; j++) {

            int tam = this.MayorSeguida(j);
            for (int i = 1; i <= tam; i++) {

                System.out.println("Line " + j + ". Veces repetidas iguales a " + i + ": " + this.vecesRepetidas(j, i));

            }
        }

        System.out.println("Cantidad de ceros en Linea 1: " + this.totalCero());

        return "gcgcg";
    }

    private String verLine() {
        String Valor = "";
        int tTotal = this.totalLineas();

        Valor = "\nTotal de numeros: " + this.getTamBasesDatos();
        Valor = Valor + "\nTotal que son 0: " + this.totalCero() + "\n";
        Valor = Valor + "Tatal que son Lineas: " + tTotal + "\n";

        for (int i = 1; i <= 12; i++) {

            int tCol = this.totalLineasEn(i);
            float por = (float) ((float) tCol / (float) tTotal) * 100;
            Valor = Valor + "\tLinea " + i + ": " + tCol + "   " + String.format("%.2f", por) + "%\n";
        }

        System.out.println(Valor);
        return Valor;
    }

}
