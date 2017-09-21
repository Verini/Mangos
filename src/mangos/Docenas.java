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
public class Docenas extends Estudio {

    public Docenas(Numero[] datos, ArrayList BasesDatos) {
        super(datos, BasesDatos);
    }

    public int totalDocenasEn(int docena) {
        int totalDocenas = 0;
        for (int i = 0; i < Docenas.BasesDatos.size(); i++) {

            if (datos[BasesDatos.get(i)].getDocena() == docena) {
                totalDocenas++;
            }
        }
        return totalDocenas;
    }

    public int totalDocenas() {
        return totalDocenasEn(1) + totalDocenasEn(2) + totalDocenasEn(3);
    }

    public int vecesRepetidas(int docena, int cantidad) {

        int cant = 0;

        int n_repet = 0;

        int anterior;
        int actual;

        int tam = Docenas.BasesDatos.size() - 1;

        for (int i = 0; i < tam; i++) {

            if (datos[BasesDatos.get(i)].getDocena() == docena) {

                anterior = datos[BasesDatos.get(i)].getDocena();
                actual = datos[BasesDatos.get(i + 1)].getDocena();

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

    public int MayorSeguida(int docena, int num) {
        int Mayor_seguida = 0;
        int cont1 = -1;

        for (int i = 0; i < Columnas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getDocena() == docena) {

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

    public int MayorSeguida(int docena) {
        int Mayor_seguida = 0;
        int cont1 = -1;

        for (int i = 0; i < Columnas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getDocena() == docena) {

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

    public int conteoDosColumnas(int col1, int col2) {
        return this.totalDocenasEn(col1) + this.totalDocenasEn(col2);
    }

    public boolean ganasApostandoDosCol(int col1, int col2) {

        int fichasGan = this.totalDocenasEn(col1) + this.totalDocenasEn(col2);

        int cero = totalCero();
        int fichasPer = ((totalDocenas() - fichasGan) + cero) * 2;

        int val = fichasGan - fichasPer;
        System.out.println("Columnas " + col1 + " " + col2 + ": " + val);
        return true;
    }


    /**
     * Esta funcion devuelve la cantidad de veces qeu se acierta apostando a no
     * repetir en docenas, mirara cuando repita n_repetir veces y en la docena
     * docena.
     *
     * @param docena Columna que seleccionamos.
     * @param n_repetir Cuando se apuesta a repetir.
     * @return cont1 que sera el numero de veces que se acierta.
     */
    public int aNoRepetir(int docena, int n_repetir) {
        int cont1 = 0;
        int contR = 0;

        int datoA;
        int datoB;

        int tam = Columnas.BasesDatos.size() - 1;

        for (int i = 0; i < tam; i++) {

            if (datos[BasesDatos.get(i)].getDocena() == docena) {
                contR++;

                if (contR == n_repetir) {

                    datoA = datos[BasesDatos.get(i)].getDocena();
                    datoB = datos[BasesDatos.get(i + 1)].getDocena();

                    if (datoA != datoB) {

                        cont1++;
                    }
                }
            } else {
                contR = 0;

            }

        }
        return cont1++;
    }

    /**
     * Esta funcion devuelve la cantidad de veces qeu se acierta apostando a
     * repetir en docenas, mirara cuando repita n_repetir veces y en la docena
     * docena.
     *
     * @param docena Columna que seleccionamos.
     * @param n_repetir Cuando se apuesta a repetir.
     * @return cont1 que sera el numero de veces que se acierta.
     */

    public String verDocenas() {

        this.verDocenas();

        System.out.println("Mayor nuvero de veces seguidas Docena 1: " + this.MayorSeguida(1));
        System.out.println("Mayor nuvero de veces seguidas Docena 2: " + this.MayorSeguida(2));
        System.out.println("Mayor nuvero de veces seguidas Docena 3: " + this.MayorSeguida(3));

        int tam = this.MayorSeguida(1);
        for (int i = 1; i <= tam; i++) {

            System.out.println("Doce 1 . Veces repetidas iguales a " + i + ": " + this.vecesRepetidas(1, i));

        }

        tam = this.MayorSeguida(2);
        for (int i = 1; i <= tam; i++) {
            System.out.println("Doce 2 . Veces repetidas iguales a " + i + ": " + this.vecesRepetidas(2, i));
        }

        tam = this.MayorSeguida(3);
        for (int i = 1; i <= tam; i++) {
            System.out.println("Doce 3 . Veces repetidas iguales a " + i + ": " + this.vecesRepetidas(3, i));
        }

        System.out.println("Cantidad de ceros en Docena 1: " + this.totalCero());

        return "gcgcg";
    }

    public String verDocen() {
        String Valor = "";
        int tTotal = this.totalDocenas();
        int tCol = this.totalDocenasEn(1);
        Valor = "\nTotal de numeros: " + this.getTamBasesDatos();
        Valor = Valor + "\nTotal que son 0: " + this.totalCero() + "\n";
        Valor = Valor + "Tatal que son docenas: " + tTotal + "\n";

        float por = (float) ((float) tCol / (float) tTotal) * 100;
        Valor = Valor + "\tDocena 1: " + tCol + "   " + String.format("%.2f", por) + "%\n";

        tCol = this.totalDocenasEn(2);
        por = (float) ((float) tCol / (float) tTotal) * 100;
        Valor = Valor + "\tDocena 2: " + tCol + "   " + String.format("%.2f", por) + "%\n";

        tCol = this.totalDocenasEn(3);
        por = (float) ((float) tCol / (float) tTotal) * 100;
        Valor = Valor + "\tDocena 3: " + tCol + "   " + String.format("%.2f", por) + "%\n";
        System.out.println(Valor);
        return Valor;
    }

    public int aRepetir(int docena, int n_repetir) {
        int cont1 = 0;
        int contR = 0;

        int datoA;
        int datoB;

        int tam = Columnas.BasesDatos.size() - 1;

        for (int i = 0; i < tam; i++) {

            if (datos[BasesDatos.get(i)].getDocena() == docena) {
                contR++;

                if (contR == n_repetir) {

                    datoA = datos[BasesDatos.get(i)].getDocena();
                    datoB = datos[BasesDatos.get(i + 1)].getDocena();

                    if (datoA == datoB) {

                        cont1++;
                    }
                }
            } else {
                contR = 0;

            }

        }
        return cont1++;
    }

    public String noRepetirDocena(int docena) {

        System.out.println("Apuesta: No se repite en la Docena " + docena + " en repetición x");
        int tam = this.MayorSeguida(docena) + 1;

        int cont_ganadas = 0;
        int cont_apuestas = 0;
        int ganas = 0;
        int pierdes = 0;
        int total = 0;
        float por;
        System.out.println("Repet x  | Ganadas --> %  | Perdidas --> % | TotalApu | %GanadasT | %PerdidasT");

        for (int i = 1; i <= tam && tam != 1; i++) {
            ganas = this.aNoRepetir(docena, i);
            total = this.vecesRepetir(docena, i);
            cont_ganadas = cont_ganadas + ganas;
            cont_apuestas = cont_apuestas + total;
        }

        for (int i = 1; i <= tam && tam != 1; i++) {
            ganas = this.aNoRepetir(docena, i);
            total = this.vecesRepetir(docena, i);
            pierdes = (total - ganas);

            por = (float) ((float) (100 * ganas) / (float) total);
            System.out.print("\t" + i + "   " + String.format("%02d", ganas) + " --> " + String.format("%03.2f", por) + "%   ");

            por = (float) ((float) (100 * pierdes) / (float) total);
            System.out.print(String.format("%02d", pierdes) + " --> " + String.format("%03.2f", por) + "%    " + String.format("%02d", total) + "    \t");

            por = (float) ((float) (100 * ganas) / (float) cont_apuestas);
            System.out.print(String.format("%03.2f", por) + "%  ");

            por = (float) ((float) (100 * pierdes) / (float) cont_apuestas);
            System.out.println(String.format("%03.2f", por) + "%      ");

        }
        System.out.println("Totales: " + "\t" + cont_ganadas + "\t" + (cont_apuestas - cont_ganadas) + "\t" + cont_apuestas);
        System.out.println("___________________________________________");
        return "";
    }

    /**
     * Esta funcion devuelve la cantidad de veces que se puede apostar a repetir
     * n_repetir en todo nuesto vecotr.
     *
     * @param docena Columna que seleccionamos.
     * @param n_repetir Cuando se apuesta a repetir.
     * @return cont1 que sera el numeor de veces que se puesta.
     */
    public int vecesRepetir(int docena, int n_repetir) {
        int cont1 = 0;
        int contR = 0;

        int datoA;
        int datoB;

        int tam = Columnas.BasesDatos.size() - 1;

        for (int i = 0; i < tam; i++) {

            if (datos[BasesDatos.get(i)].getDocena() == docena) {
                contR++;

                if (contR == n_repetir) {
                    cont1++;

                }
            } else {
                contR = 0;

            }

        }
        return cont1++;
    }

}
