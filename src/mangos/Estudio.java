
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import apuestas.ApuestaColor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import mangos.verCambios.AnalisisDeCambios;

/**
 *
 * @author Andrés
 */
public class Estudio {

    public static Method getMethod(String unaVariableString, Class<String> aClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     
    }

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
   public void Apuestas(){
        
             
        
        ApuestaColor Apu =new ApuestaColor(this.datos,this.BasesDatos);
      System.out.println(Apu);
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

    private int[] retornarVerSet(SortedSet<Integer> set) {

        Iterator<Integer> myListIterator = set.iterator();
        int tam = 0;
        int[] resul = new int[set.size()];

        while (myListIterator.hasNext()) {
            Integer dato = myListIterator.next();

            System.out.print(" " + dato);
            resul[tam] = dato;
            tam++;
        }
 System.out.print("--->" + tam);
        System.out.println();
        //Arrays.sort(resul);

        return resul;

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
            } else if (contarNumero(0, dato, i) == 2) {
                otro2++;
            } else if (contarNumero(0, dato, i) == 1) {

                otro1++;
            } else {
                otro++;

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

    private int[] todoIgualMenosColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();

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

        return this.retornarVerSet(set);
    }

    private int[] todoIgualMenosPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    /*Docena y mitad*/
    private int[] todoIgualMenosMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoIgualMenosDocenas(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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
        return this.retornarVerSet(set);
    }

    private int[] todoIgualMenosColumna(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualMitadParColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualDocenaMitadColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualDocenaMitadPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualColumnaDocenaColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualColumnaDocenaPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualColumnaDocenaMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualMitadColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualMitadPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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
        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualDocenaColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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
        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualDocenaPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualDocenaMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualColumnaColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualColumnaPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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
        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualColumnaMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualColumnaDocena(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualPar(int num) {
        int otro = 0;
        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrario(int num) {
        int otro = 0;
        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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
        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualColumna(int num) {
        int otro = 0;
        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] todoLoContrarioIgualDocena(int num) {
        int otro = 0;
        SortedSet<Integer> set = new TreeSet<>();
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
        return this.retornarVerSet(set);
    }

    

    public void verSoloDistinto(int num) {

        this.verSoloDistintoUno(num);
        this.verSoloDistintoDos(num);
        this.verSoloDistintoTres(num);
        this.verSoloDistintoCuatro(num);

    }
    
    private void verSoloDistintoCuatro(int num) {

        this.soloDistintoColumnaDocenaMitadPar(num);
        this.soloDistintoColumnaDocenaMitadColor(num);
        this.soloDistintoColumnaDocenaParColor(num);
        this.soloDistintoColumnaMitadParColor(num);
        this.soloDistintoDocenaMitadParColor(num);

    }

    private int[] soloDistintoDocenaMitadParColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto  Docena,Mitad,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() != datos[i].getDocena()) {
                if (datos[num].getMitad() !=  datos[i].getMitad()) {
                    if (datos[num].isPar()!=  datos[i].isPar()) {
                        if (datos[num].isColor() !=  datos[i].isColor()) {
                            set.add(i);
                        }
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColumnaMitadParColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Mitad,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() !=  datos[i].getColumna()) {
                if (datos[num].getMitad() !=  datos[i].getMitad()) {
                    if (datos[num].isPar() !=  datos[i].isPar()) {
                        if (datos[num].isColor() !=  datos[i].isColor()) {
                            set.add(i);
                        }
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColumnaDocenaParColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Docena,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna()!= datos[i].getColumna()) {
                if (datos[num].getDocena() !=  datos[i].getDocena()) {
                    if (datos[num].isPar() !=  datos[i].isPar()) {
                        if (datos[num].isColor() !=  datos[i].isColor()) {
                            set.add(i);
                        }
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColumnaDocenaMitadColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Docena,Mitad,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() !=  datos[i].getColumna()) {
                if (datos[num].getDocena() !=  datos[i].getDocena()) {
                    if (datos[num].getMitad()!=  datos[i].getMitad()) {
                        if (datos[num].isColor()!=  datos[i].isColor()) {
                            set.add(i);
                        }
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColumnaDocenaMitadPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Docena,Mitad,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna()!=  datos[i].getColumna()) {
                if (datos[num].getDocena() !=  datos[i].getDocena()) {
                    if (datos[num].getMitad() !=  datos[i].getMitad()) {
                        if (datos[num].isPar() !=  datos[i].isPar()) {
                            set.add(i);
                        }
                    }
                }
            }
        }
        return this.retornarVerSet(set);
    }
    
    
    
    
  private void verSoloDistintoTres(int num) {

        this.soloDistintoColumnaDocenaPar(num);
        this.soloDistintoColumnaDocenaColor(num);
        this.soloDistintoColumnaDocenaMitad(num);
        this.soloDistintoColumnaMitadPar(num);
        this.soloDistintoColumnaMitadColor(num);
        this.soloDistintoColumnaParColor(num);
        this.soloDistintoDocenaMitadPar(num);
        this.soloDistintoDocenaMitadColor(num);
        this.soloDistintoDocenaParColor(num);
        this.soloDistintoMitadParColor(num);
    }

    private int[] soloDistintoMitadParColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Mitad,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getMitad() != datos[i].getMitad()) {
                if (datos[num].isPar() != datos[num].isPar()) {
                    if (datos[num].isColor() != datos[i].isColor()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoDocenaParColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Docena,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() != datos[i].getDocena()) {
                if (datos[num].isPar() != datos[num].isPar()) {
                    if (datos[num].isColor()!= datos[i].isColor()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoDocenaMitadColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Docena,Mitad,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena()!=datos[i].getDocena()) {
                if (datos[num].getMitad() != datos[num].getMitad()) {
                    if (datos[num].isColor()!= datos[i].isColor()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoDocenaMitadPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Docena,Mitad,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() != datos[i].getDocena()) {
                if (datos[num].getMitad() != datos[num].getMitad()) {
                    if (datos[num].isPar() != datos[i].isPar()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColumnaParColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].isColor() != datos[i].isColor()) {
                    if (datos[num].isPar() != datos[i].isPar()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColumnaMitadColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Mitad,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].isColor() != datos[i].isColor()) {
                    if (datos[num].getMitad()!= datos[i].getMitad()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColumnaMitadPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Mitad,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].isPar() != datos[i].isPar()) {
                    if (datos[num].getMitad() != datos[i].getMitad()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    /*
    * Docena y mitad coge 4 nuemro en 1 yh 3 docen y coge en 2 en la 2 docenal
    * solo cambia ahii no se si era utili
     */
    private int[] soloDistintoColumnaDocenaMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Docena,Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna()!= datos[i].getColumna()) {
                if (datos[num].getDocena()!= datos[i].getDocena()) {
                    if (datos[num].getMitad()!= datos[i].getMitad()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColumnaDocenaColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Docena,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna()!= datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    if (datos[num].isColor() != datos[i].isColor()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColumnaDocenaPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Docena,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    if (datos[num].isPar() != datos[i].isPar()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    
    
    private void verSoloDistintoDos(int num) {

        this.soloDistintoColumnaDocena(num);
        this.soloDistintoColumnaMitad(num);
        this.soloDistintoColumnaPar(num);
        this.soloDistintoColumnaColor(num);
        this.soloDistintoDocenaColor(num);
        this.soloDistintoDocenaPar(num);
        this.soloDistintoDocenaMitad(num);
        this.soloDistintoColorMitad(num);
        this.soloDistintoColorPar(num);
        this.soloDistintoMitadPar(num);

    }

    private int[] soloDistintoMitadPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Mitad,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getMitad() != datos[i].getMitad()) {
                if (datos[num].isPar() != datos[i].isPar()) {
                    set.add(i);
                }
            }

        }
        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColorPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Color,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isColor() != datos[i].isColor()) {
                if (datos[num].isPar() != datos[i].isPar()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColorMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Color,Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isColor() != datos[i].isColor()) {
                if (datos[num].getMitad() != datos[i].getMitad()) {
                    set.add(i);
                }
            }

        }
        return this.retornarVerSet(set);
    }

    private int[] soloDistintoDocenaMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Docena,Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() != datos[i].getDocena()) {
                if (datos[num].getMitad() != datos[i].getMitad()) {
                    set.add(i);
                }
            }

        }
        return this.retornarVerSet(set);
    }

    private int[] soloDistintoDocenaPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Docena,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() != datos[i].getDocena()) {
                if (datos[num].isPar() != datos[i].isPar()) {
                    set.add(i);
                }
            }

        }
        return this.retornarVerSet(set);
    }

    private int[] soloDistintoDocenaColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Docena,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() != datos[i].getDocena()) {
                if (datos[num].isColor() != datos[i].isColor()) {
                    set.add(i);
                }
            }

        }
        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColumnaColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].isColor() != datos[i].isColor()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColumnaMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getMitad() != datos[i].getMitad()) {
                    set.add(i);
                }
            }

        }
        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColumnaPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].isPar() != datos[i].isPar()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);

    }

    private int[] soloDistintoColumnaDocena(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna,Docena: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {
                if (datos[num].getDocena() != datos[i].getDocena()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);
    }

    private void verSoloDistintoUno(int num) {
        this.soloDistintoColumna(num);
        this.soloDistintoDocena(num);
        this.soloDistintoMitad(num);
        this.soloDistintoColor(num);
        this.soloDistintoPar(num);

    }

    private int[] soloDistintoColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isColor() != datos[i].isColor()) {
                set.add(i);
            }

        }

        return this.retornarVerSet(set);

    }

    private int[] soloDistintoPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isPar() != datos[i].isPar()) {
                set.add(i);
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getMitad() != datos[i].getMitad()) {
                set.add(i);
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoDocena(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Docena: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() != datos[i].getDocena()) {
                set.add(i);
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloDistintoColumna(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Distinto Columna: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() != datos[i].getColumna()) {

                set.add(i);
            }
        }
        return this.retornarVerSet(set);
    }

    public void verSolo(int num) {

        this.verSoloIgualUno(num);
        this.verSoloIgualDos(num);
        this.verSoloIgualTres(num);
        this.verSoloIgualCuatro(num);

    }

    private void verSoloIgualCuatro(int num) {

        this.soloIgualColumnaDocenaMitadPar(num);
        this.soloIgualColumnaDocenaMitadColor(num);
        this.soloIgualColumnaDocenaParColor(num);
        this.soloIgualColumnaMitadParColor(num);
        this.soloIgualDocenaMitadParColor(num);

    }

    private int[] soloIgualDocenaMitadParColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma  Docena,Mitad,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].getMitad() == datos[i].getMitad()) {
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumnaMitadParColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Columna,Mitad,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getMitad() == datos[i].getMitad()) {
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumnaDocenaParColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Columna,Docena,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    if (datos[num].isPar() == datos[i].isPar()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumnaDocenaMitadColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Columna,Docena,Mitad,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    if (datos[num].getMitad() == datos[i].getMitad()) {
                        if (datos[num].isColor() == datos[i].isColor()) {
                            set.add(i);
                        }
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumnaDocenaMitadPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Columna,Docena,Mitad,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    if (datos[num].getMitad() == datos[i].getMitad()) {
                        if (datos[num].isPar() == datos[i].isPar()) {
                            set.add(i);
                        }
                    }
                }
            }
        }
        return this.retornarVerSet(set);
    }

    private void verSoloIgualTres(int num) {
        System.out.println("Numeor : " + num );
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

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Mitad,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getMitad() == datos[i].getMitad()) {
                if (datos[num].isPar() == datos[num].isPar()) {
                    if (datos[num].isColor() == datos[i].isColor()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualDocenaParColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Docena,Par,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].isPar() == datos[num].isPar()) {
                    if (datos[num].isColor() == datos[i].isColor()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualDocenaMitadColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Docena,Mitad,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].getMitad() == datos[num].getMitad()) {
                    if (datos[num].isColor() == datos[i].isColor()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualDocenaMitadPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Docena,Mitad,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].getMitad() == datos[num].getMitad()) {
                    if (datos[num].isPar() == datos[i].isPar()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumnaParColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumnaMitadColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Columna,Mitad,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].isColor() == datos[i].isColor()) {
                    if (datos[num].getMitad() == datos[i].getMitad()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumnaMitadPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Columna,Mitad,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].isPar() == datos[i].isPar()) {
                    if (datos[num].getMitad() == datos[i].getMitad()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    /*
    * Docena y mitad coge 4 nuemro en 1 yh 3 docen y coge en 2 en la 2 docenal
    * solo cambia ahii no se si era utili
     */
    private int[] soloIgualColumnaDocenaMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Columna,Docena,Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    if (datos[num].getMitad() == datos[i].getMitad()) {
                        set.add(i);
                    }
                }
            }
        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumnaDocenaColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumnaDocenaPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
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

        return this.retornarVerSet(set);
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

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Mitad,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getMitad() == datos[i].getMitad()) {
                if (datos[num].isPar() == datos[i].isPar()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColorPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Color,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isColor() == datos[i].isColor()) {
                if (datos[num].isPar() == datos[i].isPar()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColorMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Color,Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isColor() == datos[i].isColor()) {
                if (datos[num].getMitad() == datos[i].getMitad()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualDocenaMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Docena,Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].getMitad() == datos[i].getMitad()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualDocenaPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Docena,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].isPar() == datos[i].isPar()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualDocenaColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Docena,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                if (datos[num].isColor() == datos[i].isColor()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumnaColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Columna,Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].isColor() == datos[i].isColor()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumnaMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Columna,Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getMitad() == datos[i].getMitad()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumnaPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Columna,Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].isPar() == datos[i].isPar()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumnaDocena(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Columna,Docena: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {
                if (datos[num].getDocena() == datos[i].getDocena()) {
                    set.add(i);
                }
            }

        }

        return this.retornarVerSet(set);
    }

    private void verSoloIgualUno(int num) {

        this.soloIgualColumna(num);
        this.soloIgualDocena(num);
        this.soloIgualMitad(num);
        this.soloIgualPar(num);
        this.soloIgualColor(num);
    }

    private int[] soloIgualColor(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Color: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isColor() == datos[i].isColor()) {
                set.add(i);
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualPar(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Par: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].isPar() == datos[i].isPar()) {
                set.add(i);
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualMitad(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Mitad: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getMitad() == datos[i].getMitad()) {
                set.add(i);
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualDocena(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Docena: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getDocena() == datos[i].getDocena()) {
                set.add(i);
            }

        }

        return this.retornarVerSet(set);
    }

    private int[] soloIgualColumna(int num) {

        SortedSet<Integer> set = new TreeSet<>();
        System.out.print("Misma Columna: ");
        for (int i = 0; i <= 36; i++) {

            if (datos[num].getColumna() == datos[i].getColumna()) {

                set.add(i);
            }
        }
        return this.retornarVerSet(set);
    }

    public void mirarCambiosEnTodasLasApuestas(){
           
        AnalisisDeCambios Analiza = new AnalisisDeCambios(this.datos,this.BasesDatos);
      
        Analiza.verCuentameCambio();
       // Analiza.verMaxVecesSeguidasCambio();
        
        //this.verSoloDistintoTres(3);
       //this.verSoloIgualTres(3);
     for(int i=0;i<37;i++){
     this.verSoloIgualTres(i);
     
     }
    }
    
    public void verDatosNumeroSeRepite(){
    
        for (int i = 0; i <= 36; i++) {
                System.out.println("Numero"+ i +": "+ mayorNumeorDeVecesQueSeRepiteNumero(i));
        }
    
    
    }
    
    public int mayorNumeorDeVecesQueSeRepiteNumero(int num){
    int cont=-1;
    int mayor=0;
      for (int i = 0; i < this.BasesDatos.size(); i++) {
            if ( this.BasesDatos.get(i) == num) {
                cont++;
            }else{
                if(cont>mayor){
                    mayor=cont;
                }
                cont = -1;
            }
        }
      return mayor;
    }
   
    
    
    public void estudioDeLosCambio(){
        
        AnalisisDeCambios Analiza = new AnalisisDeCambios(this.datos,this.BasesDatos);
       // System.out.print(Analiza.toString());
        //Analiza.cuentameCambio();
        
       // System.out.println(" Docena color:" + Analiza.maxVecesSeguidasNoCambioDocenaColor());
       // Analiza.verMaxVecesSeguidasCambio();
        Analiza.verTodoDocenaColor();
    for(int i=0;i<37;i++){
        //this.soloIgualColumnaDocena(i); 4
        
        //this.soloIgualDocenaColor(i);
    //   this.soloDistintoColumnaColor(i);
         //this.soloDistintoColorPar(i);10
      //  this.
     // this.soloIgualDocenaColor(i);//6 en cad doce
 //this.soloDistintoColumnaPar(i);//13
//this.soloDistintoDocenaPar(i);
  //this.soloDistintoColorMitad(i);
  //this.soloDistintoMitadPar(i);
  //this.soloDistintoDocenaMitad(i);
 // this.soloDistintoColumnaMitad(i);
  //this.soloDistintoColumnaDocena(i);
    }
       //6 
     
   
        
    }
////////////////////////////////////////////////////////////////////////////////
}
