
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
    /**
     * Cantidad de 0 que hay en las tres columnas.
     *
     * @return La suma de la cantidad de 0 de las 3 columnas.
     */
    public int totalCero() {
        int cont1 = 0;

        for (int i = 0; i < Columnas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getValor() == 0) {

                cont1++;
            }
        }
        return cont1++;
    }

///////////////////////////NUMERO CALIENTE//////////////////////////////////////
    public String nCalientes() {
        float por;
        int otro = 0;
        int otro1 = 0;
        int otro2 = 0;
        int cont = 0;
        for (int i = 0; i < 37; i++) {

            por = (float) ((float) (100 * contarNumero(i) / (float) this.BasesDatos.size()));
            cont = contarNumero(i) + cont;
            //if(por >=3 )
            System.out.println("Numero " + i + ": " + contarNumero(i) + "    " + String.format("%03.2f", por) + "%");
            if (contarNumero(i) >= 3) {
                otro++;
            } else if (contarNumero(i) >= 2) {
                otro1++;
            } else {

                otro2++;
            }
        }

        System.out.println("Total : " + cont);

        for (int i = 0; i < 37; i++) {

            if (contarNumero(i) <= 1) {
                //otro++;
            }
        }
        System.out.println("Numeor frio : " + otro + " " + otro1 + " " + otro2);

        return "";
    }

    public void ponerPuntoAlosNumero() {
        //*SEgun lo k se vea en las veces k salen los nuemore */   

    }

    public String nApostarA90tiradas() {
        float por;
        int otro = 0;
        int otro1 = 0;
        int otro2 = 0;

        int otro4 = 0;
        int otro5 = 0;
        int otro6 = 0;
        int otro7 = 0;
        int otro8 = 0;
        int otro9 = 0;
        int otro10 = 0;
        int cont = 0;
        int otro3 = 0;
        int dato = 90;
        for (int i = 0; i < 37; i++) {

            por = (float) ((float) (100 * contarNumero(i) / (float) dato));
            cont = contarNumero(i) + cont;
            //if(por >=3 )
            System.out.println("Numero " + i + ": " + contarNumero(0, dato, i) + "    " + String.format("%03.2f", por) + "%");
            if (contarNumero(0, dato, i) == 10) {
                otro10++;
            } else if (contarNumero(0, dato, i) == 9) {
                otro9++;
            } else if (contarNumero(0, dato, i) == 8) {
                otro8++;
            } else if (contarNumero(0, dato, i) == 7) {

                otro7++;
            } else if (contarNumero(0, dato, i) == 6) {
                otro6++;

            } else if (contarNumero(0, dato, i) == 5) {
                otro5++;
            } else if (contarNumero(0, dato, i) == 4) {
                otro4++;
            } else if (contarNumero(0, dato, i) == 3) {
                otro3++;
            } else {
                if (contarNumero(0, dato, i) == 2) {
                    otro2++;
                } else if (contarNumero(0, dato, i) == 1) {

                    otro1++;
                } else {
                    otro++;

                }
            }
        }
        System.out.println("Numeor frio : " + otro10 + " " + otro9 + " " + otro8 + " " + " " + otro7 + " "
                + otro6 + " " + otro5 + " " + otro4 + " " + otro3 + " " + otro2 + " " + otro1 + " " + +otro + " ");
        System.out.println("Total : " + cont);

        otro = 0;
        int suma = 0;
        for (int i = 0; i <= 36; i++) {

            if ((contarNumero(0, dato, i) == 4) && (contarNumero(dato, this.BasesDatos.size(), i) == 1)) {
                otro++;

                System.out.println("Numer444o " + i + ": " + contarNumero(dato, this.BasesDatos.size(), i));
            }

        }

        System.out.println("Total : " + otro);
        System.out.println("Gaanncia : " + ((otro * (36 - otro2)) - (otro2 * (100 - dato - otro))));

        return "";
    }

    private int contarNumero(int desde, int hasta, int numero) {
        int cont = 0;
        for (int i = desde; i < hasta; i++) {

            if (this.BasesDatos.get(i) == numero) {
                cont++;
            }

        }
        return cont;

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

    public void CombinacionDocenasColumnas() {
        int cc = 0;
        int ci = 0;
        int ic = 0;
        int ii = 0;
        int cero = 0;

        int otro = 0;
        Set<Integer> set = new HashSet<Integer>();

//     List<Integer> set = new ArrayList<Integer>();
        for (int i = 0; i < BasesDatos.size() - 1; i++) {
            int columnaActual = datos[BasesDatos.get(i)].getColumna();
            int columnaSiguiente = datos[BasesDatos.get(i + 1)].getColumna();
            int docenaActual = datos[BasesDatos.get(i)].getDocena();
            int docenaSiguiente = datos[BasesDatos.get(i + 1)].getDocena();
            if (BasesDatos.get(i + 1) != 0) {
                if ((columnaActual != columnaSiguiente) && (docenaActual != docenaSiguiente)) {
                    cc++;
                    set.add(otro);
                    otro = 0;

                } else if ((columnaActual != columnaSiguiente) && (docenaActual == docenaSiguiente)) {
                    ci++;
                    otro++;
                } else if ((columnaActual == columnaSiguiente) && (docenaActual != docenaSiguiente)) {
                    ic++;
                    otro++;
                } else {
                    ii++;
                    otro++;

                }
            } else {
                cero++;
                otro++;
            }

        }

        System.out.println("Numero de veces que hace un cambio - cambio: " + cc);
        System.out.println("Numero de veces que hace un cambio - repite: " + ci);
        System.out.println("Numero de veces que hace un repite - cambio: " + ic);
        System.out.println("Numero de veces que hace un repite - repite: " + ii);

        System.out.println("Jugando a cc ganamos cc menos los ceros * 21: " + (cc * 21));
        System.out.println("Jugando a cc perdemos: " + ((ci + ic + ii + cero) * 16));
        System.out.println("Balance es igual a: " + ((cc * 21) - (ci + ic + ii + cero) * 16));

        System.out.println("Imprimir lista");

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.println(dato);
        }

    }

    public void CombinacionDocenasColumnasLineas() {
        int ccc = 0;
        int cic = 0;
        int icc = 0;
        int iic = 0;
        int cci = 0;
        int cii = 0;
        int ici = 0;
        int iii = 0;

        int cero = 0;

        int otro = 0;

        for (int i = 0; i < BasesDatos.size() - 1; i++) {
            int columnaActual = datos[BasesDatos.get(i)].getColumna();
            int columnaSiguiente = datos[BasesDatos.get(i + 1)].getColumna();
            int docenaActual = datos[BasesDatos.get(i)].getDocena();
            int docenaSiguiente = datos[BasesDatos.get(i + 1)].getDocena();
            int lineaActual = datos[BasesDatos.get(i)].getLinea();
            int lineaSiguiente = datos[BasesDatos.get(i + 1)].getLinea();

            if (BasesDatos.get(i + 1) != 0) {
                if ((columnaActual != columnaSiguiente) && (docenaActual != docenaSiguiente) && (lineaActual != lineaSiguiente)) {
                    ccc++;
                } else if ((columnaActual != columnaSiguiente) && (docenaActual == docenaSiguiente) && (lineaActual != lineaSiguiente)) {
                    cic++;
                } else if ((columnaActual == columnaSiguiente) && (docenaActual != docenaSiguiente) && (lineaActual != lineaSiguiente)) {
                    icc++;
                } else if ((columnaActual == columnaSiguiente) && (docenaActual == docenaSiguiente) && (lineaActual != lineaSiguiente)) {
                    iic++;
                } else if ((columnaActual != columnaSiguiente) && (docenaActual != docenaSiguiente) && (lineaActual == lineaSiguiente)) {
                    cci++;
                } else if (columnaActual != columnaSiguiente && docenaActual == docenaSiguiente && lineaActual == lineaSiguiente) {
                    cii++;
                } else if (columnaActual == columnaSiguiente && docenaActual != docenaSiguiente && lineaActual == lineaSiguiente) {
                    ici++;
                } else {
                    iii++;

                }
            } else {
                cero++;
            }

        }

        System.out.println("Numero de veces que hace un cambio - cambio - cambio: " + ccc);
        System.out.println("Numero de veces que hace un cambio - repite - cambio: " + cic);
        System.out.println("Numero de veces que hace un repite - cambio - cambio: " + icc);
        System.out.println("Numero de veces que hace un repite - repite - cambio: " + iic);
        System.out.println("Numero de veces que hace un cambio - cambio - repite: " + cci);
        System.out.println("Numero de veces que hace un cambio - repite - repite: " + cii);
        System.out.println("Numero de veces que hace un repite - cambio - repite: " + ici);
        System.out.println("Numero de veces que hace un repite - repite - repite: " + iii);

        System.out.println("Jugando a ccc ganamos cc menos los ceros * 23: " + (ccc * 23));
        System.out.println("Jugando a ccc perdemos: " + ((cic + icc + iic + cci + cii + ici + iii + cero) * 14));
        System.out.println("Balance es igual a: " + ((ccc * 23) - (cic + icc + iic + cci + cii + ici + iii + cero) * 14));

    }

    public void verNumeroContrarios(int num) {

        ///this.verNumeroContrarioSoloDocena(num);
        this.todoIgualMenosColumna(num);
        this.todoIgualMenosDocenas(num);
        this.todoIgualMenosMitad(num);
        this.todoIgualMenosColor(num);
        this.todoIgualMenosPar(num);
        this.todoLoContrario(num);
        this.todoLoContrarioIgualDocena(num);
        this.todoLoContrarioIgualColumnaDocena(num);

        this.todoLoContrarioIgualDocenaMitad(num);
        this.todoLoContrarioIgualDocenaPar(num);
        this.todoLoContrarioIgualDocenaColor(num);

        this.todoLoContrarioIgualColumna(num);
        this.todoLoContrarioIgualMitad(num);
        this.todoLoContrarioIgualPar(num);
        this.todoLoContrarioIgualColor(num);

        //igual dos cosas
        this.todoLoContrarioIgualColumnaMitad(num);
        this.todoLoContrarioIgualColumnaPar(num);

        this.todoLoContrarioIgualMitadPar(num);

        //tres igulaes
        this.todoLoContrarioIgualColumnaDocenaMitad(num);
        this.todoLoContrarioIgualColumnaDocenaPar(num);
        this.todoLoContrarioIgualColumnaDocenaColor(num);

        this.todoLoContrarioIgualDocenaMitadPar(num);
        this.todoLoContrarioIgualDocenaMitadColor(num);
        this.todoLoContrarioIgualMitadParColor(num);
    }

    private void verNumeroContrarioSoloDocena(int num) {

        this.todoLoContrarioIgualDocena(num);
        this.todoLoContrarioIgualColumnaDocena(num);
        this.todoLoContrarioIgualDocenaMitad(num);
        this.todoLoContrarioIgualDocenaPar(num);
        this.todoLoContrarioIgualDocenaColor(num);

        this.todoLoContrarioIgualColumnaDocenaMitad(num);
        this.todoLoContrarioIgualColumnaDocenaPar(num);
        this.todoLoContrarioIgualColumnaDocenaColor(num);
        this.todoLoContrarioIgualDocenaMitadPar(num);
        this.todoLoContrarioIgualDocenaMitadColor(num);

    }

    private void todoIgualMenosColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo igual menos Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() == datos[i].getMitad()){
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                }

                //}
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoIgualMenosPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo igual menos Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() == datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                }

                //  }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    /*Docena y mitad*/
    private void todoIgualMenosMitad(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo igual menos Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() != datos[i].getMitad()){
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                    //   }
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoIgualMenosDocenas(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo igual menos Docenas: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    // if(datos[num].getMitad() == datos[i].getMitad()){
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                }

                // }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoIgualMenosColumna(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo igual menos Columna: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() == datos[i].getMitad()){
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                    // }
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualMitadParColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Docena,Mitad,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    // if(datos[num].getMitad() == datos[i].getMitad()){
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }

                        //  }
                    }

                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualDocenaMitadColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Docena,Mitad,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() == datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }

                        // }
                    }

                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualDocenaMitadPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Docena,Mitad,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() == datos[i].getMitad()){
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                    // }
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualColumnaDocenaColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Columna,Docena,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() != datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                    // }
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualColumnaDocenaPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Columna,Docena,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() != datos[i].getMitad()){
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                    //  }
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualColumnaDocenaMitad(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Columna,Docena,Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() == datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                        //  }
                    }

                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualMitadColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Mitad y Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    // if(datos[num].getMitad() == datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }

                        //  }
                    }

                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualMitadPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Mitad y Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    // if(datos[num].getMitad() == datos[i].getMitad()){
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                        //    }
                    }

                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualDocenaColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Docena y Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() != datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }

                        //    }
                    }

                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualDocenaPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Docena y Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() != datos[i].getMitad()){
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                        //    }
                    }

                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualDocenaMitad(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Docena y Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() == datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                        //       }
                    }

                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualColumnaColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Columna y Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    // if(datos[num].getMitad() != datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                    //     }
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualColumnaPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Columna y Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    // if(datos[num].getMitad() != datos[i].getMitad()){
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                        // }
                    }

                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualColumnaMitad(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Columna y Docena: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    // if(datos[num].getMitad() == datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                        //    }
                    }

                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualColumnaDocena(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Columna y Docena: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() != datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                        //   }
                    }

                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualColor(int num) {
        int otro = 0;
        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    // if(datos[num].getMitad() != datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                    //  }
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualPar(int num) {
        int otro = 0;
        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    // if(datos[num].getMitad() != datos[i].getMitad()){
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                    //  }
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrario(int num) {
        int otro = 0;
        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    // if(datos[num].getMitad() != datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                    //  }
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualMitad(int num) {
        int otro = 0;
        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    // if(datos[num].getMitad() == datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                        //    }
                    }

                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualColumna(int num) {
        int otro = 0;
        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual Columna: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    // if(datos[num].getMitad() != datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                    //  }
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    private void todoLoContrarioIgualDocena(int num) {
        int otro = 0;
        Set<Integer> set = new HashSet<>();
        System.out.print("Todo lo contrario igual docena: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    // if(datos[num].getMitad() != datos[i].getMitad()){
                    if (datos[num].isPar() != datos[i].isPar()) {
                        if (datos[num].isColor() != datos[i].isColor()) {
                            set.add(i);
                        }

                    }

                    //   }
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
        }
        System.out.println();
    }

    
    public void verSoloDistinto(int num) {
        
         this.verSoloDistintoUno(num);
  /*      this.verSoloDistintoDos(num);
        this.verSoloDistintoTres(num);
        this.verSoloDistintoCuatro(num);*/
    
    
    }
    
    private void verSoloDistintoUno(int num){
       this.soloDistintoColumna(num);
       this.soloDistintoDocena(num);
       this.soloDistintoMitad(num);
       this.soloDistintoColor(num);
       this.soloDistintoPar(num);
    
    }
     private int[] soloDistintoColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Distinto Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isColor() != datos[i].isColor()) {
                set.add(i);
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloDistintoPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Distinto Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isPar() != datos[i].isPar()) {
                set.add(i);
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloDistintoMitad(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Distinto Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getMitad() != datos[i].getMitad()) {
                set.add(i);
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloDistintoDocena(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Distinto Docena: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() != datos[i].getDocena()) {
                set.add(i);
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloDistintoColumna(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Distinto Columna: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {

                set.add(i);
            }
        }
        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
    
    
    public void verSolo(int num) {

        this.verSoloIgualUno(num);
        this.verSoloIgualDos(num);
        this.verSoloIgualTres(num);
        this.verSoloIgualCuatro(num);

    }
    
    private void verSoloIgualCuatro(int num){
    
        this.soloIgualColumnaDocenaMitadPar(num);
        this.soloIgualColumnaDocenaMitadColor(num);
        this.soloIgualColumnaDocenaParColor(num);
        this.soloIgualColumnaMitadParColor(num);
        this.soloIgualDocenaMitadParColor(num);
    
    
    }
    
    private int[] soloIgualDocenaMitadParColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Distinto Docena,Mitad,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].getMitad() == datos[i].getMitad()) {
                if (datos[num].isPar()== datos[i].isPar() ) {
                    if (datos[num].isColor() == datos[i].isColor()) {
                    set.add(i);
                }
            }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
    
    
    private int[] soloIgualColumnaMitadParColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Distinto Columna,Mitad,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getMitad() == datos[i].getMitad()) {
                if (datos[num].isPar()== datos[i].isPar() ) {
                    if (datos[num].isColor() == datos[i].isColor()) {
                    set.add(i);
                }
            }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
    
    
    
     private int[] soloIgualColumnaDocenaParColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna,Docena,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].isPar()== datos[i].isPar() ) {
                    if (datos[num].isColor() == datos[i].isColor()) {
                    set.add(i);
                }
            }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
    
    
    private int[] soloIgualColumnaDocenaMitadColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna,Docena,Mitad,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].getMitad() == datos[i].getMitad() ) {
                    if (datos[num].isColor() == datos[i].isColor()) {
                    set.add(i);
                }
            }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
    
    
    private int[] soloIgualColumnaDocenaMitadPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna,Docena,Mitad,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].getMitad() == datos[i].getMitad() ) {
                    if (datos[num].isPar() == datos[i].isPar()) {
                    set.add(i);
                }
            }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
    
      
      
    private void verSoloIgualTres(int num){
        
           this.soloIgualColumnaDocenaPar(num);
           this.soloIgualColumnaDocenaColor(num);
           this.soloIgualColumnaDocenaMitad(num);
           this.soloIgualColumnaMitadPar(num);
           this.soloIgualColumnaMitadColor(num);
           this.soloIgualColumnaParColor(num);       
           this.soloIgualDocenaMitadPar(num);
           this.soloIgualDocenaMitadColor(num);
           this.soloIgualDocenaParColor(num);
           this.soloIgualMitadParColor(num);
    }
    
    
    
     private int[] soloIgualMitadParColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Mitad,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getMitad() == datos[i].getMitad()) {
                 if (datos[num].isPar() ==datos[num].isPar()) {
                     if (datos[num].isColor() == datos[i].isColor()) {
                    set.add(i);
                }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
    
    private int[] soloIgualDocenaParColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Docena,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].isPar() ==datos[num].isPar()) {
                     if (datos[num].isColor() == datos[i].isColor()) {
                    set.add(i);
                }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
          
        
    private int[] soloIgualDocenaMitadColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Docena,Mitad,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].getMitad() ==datos[num].getMitad()) {
                     if (datos[num].isColor() == datos[i].isColor()) {
                    set.add(i);
                }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
          
          
       private int[] soloIgualDocenaMitadPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Docena,Mitad,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].getMitad() ==datos[num].getMitad()) {
                    if (datos[num].isPar() == datos[i].isPar()) {
                    set.add(i);
                }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
    
       
       
     private int[] soloIgualColumnaParColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].isColor() == datos[i].isColor()) {
                    if (datos[num].isPar() == datos[i].isPar()) {
                    set.add(i);
                }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
    
     
     private int[] soloIgualColumnaMitadColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna,Mitad,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].isColor() == datos[i].isColor()) {
                if (datos[num].getMitad()== datos[i].getMitad()) {
                    set.add(i);
                }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
    
    private int[] soloIgualColumnaMitadPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna,Mitad,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].isPar() == datos[i].isPar()) {
                if (datos[num].getMitad()== datos[i].getMitad()) {
                    set.add(i);
                }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
    
    
    
    /*
    * Docena y mitad coge 4 nuemro en 1 yh 3 docen y coge en 2 en la 2 docenal
    * solo cambia ahii no se si era utili
    */
    private int[] soloIgualColumnaDocenaMitad(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna,Docena,Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].getMitad()== datos[i].getMitad()) {
                    set.add(i);
                }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
     
    
    private int[] soloIgualColumnaDocenaColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna,Docena,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].isColor() == datos[i].isColor()) {
                    set.add(i);
                }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
     
     
     
     private int[] soloIgualColumnaDocenaPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna,Docena,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].isPar() == datos[i].isPar()) {
                    set.add(i);
                }
            }
            }
        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }
     
    
    private void verSoloIgualDos(int num) {

        this.soloIgualColumnaDocena(num);
        this.soloIgualColumnaMitad(num);
        this.soloIgualColumnaPar(num);
        this.soloIgualColumnaColor(num);
        this.soloIgualDocenaColor(num);
        this.soloIgualDocenaPar(num);
        this.soloIgualDocenaMitad(num);
        this.soloIgualColorMitad(num);
        this.soloIgualColorPar(num);
        this.soloIgualMitadPar(num);

    }

    private int[] soloIgualMitadPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Mitad,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getMitad() == datos[i].getMitad()) {
                if (datos[num].isPar() == datos[i].isPar()) {
                    set.add(i);
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloIgualColorPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Color,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isColor() == datos[i].isColor()) {
                if (datos[num].isPar() == datos[i].isPar()) {
                    set.add(i);
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloIgualColorMitad(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Color,Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isColor() == datos[i].isColor()) {
                if (datos[num].getMitad() == datos[i].getMitad()) {
                    set.add(i);
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloIgualDocenaMitad(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Docena,Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].getMitad() == datos[i].getMitad()) {
                    set.add(i);
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloIgualDocenaPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Docena,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].isPar() == datos[i].isPar()) {
                    set.add(i);
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloIgualDocenaColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Docena,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].isColor() == datos[i].isColor()) {
                    set.add(i);
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloIgualColumnaColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].isColor() == datos[i].isColor()) {
                    set.add(i);
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloIgualColumnaMitad(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna,Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getMitad() == datos[i].getMitad()) {
                    set.add(i);
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloIgualColumnaPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].isPar() == datos[i].isPar()) {
                    set.add(i);
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloIgualColumnaDocena(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna,Docena: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    set.add(i);
                }
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private void verSoloIgualUno(int num) {

        this.soloIgualColumna(num);
        this.soloIgualDocena(num);
        this.soloIgualMitad(num);
        this.soloIgualPar(num);
        this.soloIgualColor(num);
    }

    private int[] soloIgualColor(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isColor() == datos[i].isColor()) {
                set.add(i);
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloIgualPar(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isPar() == datos[i].isPar()) {
                set.add(i);
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloIgualMitad(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getMitad() == datos[i].getMitad()) {
                set.add(i);
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloIgualDocena(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Docena: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                set.add(i);
            }

        }

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

    private int[] soloIgualColumna(int num) {

        Set<Integer> set = new HashSet<>();
        System.out.print("Misma Columna: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {

                set.add(i);
            }
        }
        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }

        System.out.println();
        Arrays.sort(resul);

        return resul;
    }

////////////////////////////////////////////////////////////////////////////////
}
