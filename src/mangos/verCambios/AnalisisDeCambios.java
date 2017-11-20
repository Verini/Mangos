/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos.verCambios;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.NativeFunction.function;
import mangos.Estudio;

import mangos.Numero;

/**
 *
 * @author jai
 */
public class AnalisisDeCambios {

    Cambio[] vectCambio;

    public AnalisisDeCambios(Numero[] datos, ArrayList<Integer> BasesDatos) {
        int tam = BasesDatos.size() - 1;

        vectCambio = new Cambio[tam];

        for (int i = 0; i < tam; i++) {

            vectCambio[i] = new Cambio(datos[BasesDatos.get(i)], datos[BasesDatos.get(i + 1)]);
        }
    }

    public AnalisisDeCambios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {

        String dato = new String();

        int tam = vectCambio.length;
        dato = "Total de cambio: " + tam + "\n";
        for (int i = 0; i < tam; i++) {
            dato = dato + vectCambio[i] + "\n";
        }

        return dato;

    }

    public void verCuentameCambio() {
        /*Hacer porcentajes con todo los coloeres*/
        this.cuentameCambioUno();
        this.cuentameCambioDos();

    }

    public void cuentameCambioUno() {

        System.out.println("Cambio Color :\t" + imprimeFormatLinea(this.cuentameCambioColor()));
        System.out.println("Cambio Par :\t" + imprimeFormatLinea(this.cuentameCambioPar()));
        System.out.println("Cambio Mitad :\t" + imprimeFormatLinea(this.cuentameCambioMitad()));
        System.out.println("Cambio Columna:\t" + imprimeFormatLinea(this.cuentameCambioColumna()));
        System.out.println("Cambio Docena :\t" + imprimeFormatLinea(this.cuentameCambioDocena()));

    }

    public void verTodoDocenaColor() {

        System.out.println("Cambio Docena :\t" + imprimeFormatLinea(this.cuentameCambioDocena()));
        System.out.println("Cambio Color :\t" + imprimeFormatLinea(this.cuentameCambioColor()));
        System.out.println("Cambio Docena y Color:\t" + imprimeFormatLinea(this.cuentameCambioDocenaColor()) + " Apostamos a 6 + el 0");
        System.out.println("No Cambio Docena y Color:\t" + imprimeFormatLinea(this.cuentameNoCambioDocenaColor()) + " Apostamos a 6 + el 0");
        System.out.println("Maximo Cambio Color:\t" + this.maxCambioColor());
        System.out.println("Maximo Cambio Docena:\t" + this.maxCambioDocena());
        System.out.println("Maximo Cambio Docena y color:\t" + this.maxCambioDocenaColor());

       // System.out.println("Maximo No Cambio Color:\t" + this.maxNoCambioColor());
       // System.out.println("Maximo No Cambio Docena:\t" + this.maxNoCambioDocena());
        System.out.println("Maximo No Cambio Docena y color:\t" + this.maxNoCambioDocenaColor());

    }

    public void cuentameCambioDos() {

        System.out.println("Cambio Columna y Docena:" + imprimeFormatLinea(this.cuentameCambioColumnaDocena()) + " Apostamos a 16 + el 0");
        System.out.println("Cambio Columna y Mitad:\t" + imprimeFormatLinea(this.cuentameCambioColumnaMitad()) + " Apostamos a 12 + el 0");
        System.out.println("Cambio Columna y Color:\t" + imprimeFormatLinea(this.cuentameCambioColumnaColor()) + " Apostamos a 14 + el 0");
        System.out.println("Cambio Columna y Par:\t" + imprimeFormatLinea(this.cuentameCambioColumnaPar()) + " Apostamos a 12 + el 0");
        System.out.println("Cambio Docena y Mitad:\t" + imprimeFormatLinea(this.cuentameCambioDocenaMitad()) + " Apostamos a 18 o 12 + el 0");
        System.out.println("Cambio Docena y Color:\t" + imprimeFormatLinea(this.cuentameCambioDocenaColor()) + " Apostamos a 6 + el 0");
        System.out.println("Cambio Docena y Par:\t" + imprimeFormatLinea(this.cuentameCambioDocenaPar()) + " Apostamos a 12 + el 0");
        System.out.println("Cambio Color y Par :\t" + imprimeFormatLinea(this.cuentameCambioColorPar()) + " Apostamos a 9 + el 0");
        System.out.println("Cambio Color y Mitad:\t" + imprimeFormatLinea(this.cuentameCambioColorMitad()) + " Apostamos a 9 + el 0");
        System.out.println("Cambio Mitad y Par:\t" + imprimeFormatLinea(this.cuentameCambioMitadPar()) + " Apostamos a 9 + el 0");

    }

    public void verMaxVecesSeguidasCambio() {
        this.verMaxVecesSequidasCambioUno();
        this.verMaxVecesSequidasCambioDos();
    }

    private void verMaxVecesSequidasCambioUno() {
        System.out.println("Maximo Cambio Color:\t" + this.maxCambioColor());
        System.out.println("Maximo Cambio Columna:\t" + this.maxCambioColumna());
        System.out.println("Maximo Cambio Docena:\t" + this.maxCambioDocena());
        System.out.println("Maximo Cambio Par:\t" + this.maxCambioPar());
        System.out.println("Maximo Cambio Mitad:\t" + this.maxCambioMitad());

    }

    private void verMaxVecesSequidasCambioDos() {

        System.out.println("Maximo Cambio Docena y color:\t" + this.maxCambioDocenaColor());
        System.out.println("Maximo No Cambio Docena y color:\t" + this.maxNoCambioDocenaColor());

    }

    public void verMaxVecesSeguidasNoCambio() {
        this.verMaxVecesSequidasNoCambioUno();
        this.verMaxVecesSequidasNoCambioDos();
    }

    private void verMaxVecesSequidasNoCambioDos() {

        System.out.println("Maximo No Cambio Docena y color:\t" + this.maxNoCambioDocenaColor());

    }

    private String imprimeFormatLinea(int dato) {
        String resul = "";

        int total = this.vectCambio.length;
        float por = (float) ((float) (100 * dato / (float) total));

        resul = dato + "--> " + String.format("%03.2f", por) + "%";

        return resul;

    }

    public int cuentameCambioColor() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioColor()) {
                cont++;
            }
        }
        return cont;
    }

    public int cuentameCambioColumna() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioColumna()) {
                cont++;
            }
        }
        return cont;
    }

    public int cuentameCambioPar() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioPar()) {
                cont++;
            }
        }
        return cont;
    }

    public int cuentameCambioMitad() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioMitad()) {
                cont++;
            }
        }
        return cont;
    }

    public int cuentameCambioDocena() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioDocena()) {
                cont++;
            }

        }
        return cont;
    }

    public int maxCambioColor() {
        int cont = 0;
        int max = 0;
        int tam = this.vectCambio.length;

        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioColor()) {
                cont++;

            } else {
                if (cont > max) {
                    max = cont;

                }
                cont = 0;
            }

        }

        return max;
    }

    public int maxCambioColumna() {
        int cont = 0;
        int max = 0;
        int tam = this.vectCambio.length;

        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioColumna()) {
                cont++;

            } else {
                if (cont > max) {
                    max = cont;

                }
                cont = 0;
            }

        }

        return max;
    }

    public int maxCambioPar() {
        int cont = 0;
        int max = 0;
        int tam = this.vectCambio.length;

        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioPar()) {
                cont++;

            } else {
                if (cont > max) {
                    max = cont;

                }
                cont = 0;
            }

        }

        return max;
    }

    public int maxCambioMitad() {
        int cont = 0;
        int max = 0;
        int tam = this.vectCambio.length;

        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioMitad()) {
                cont++;

            } else {
                if (cont > max) {
                    max = cont;

                }
                cont = 0;
            }

        }

        return max;
    }

    public int maxCambioDocena() {
        int cont = 0;
        int max = 0;
        int tam = this.vectCambio.length;

        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioDocena()) {
                cont++;

            } else {
                if (cont > max) {
                    max = cont;

                }
                cont = 0;
            }

        }

        return max;
    }





    ////////////////////////////////Fin de uno//////////////////////////////////////////////
    public int cuentameCambioColumnaDocena() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioColumnaDocena()) {
                cont++;
            }

        }
        //System.out.print("Este es mi cmabio y docena = " + cont );
        return cont;
    }

    public int cuentameCambioColumnaMitad() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioColumnaMitad()) {
                cont++;
            }

        }
        //System.out.print("Este es mi cmabio y docena = " + cont );
        return cont;
    }

    public int cuentameCambioColumnaColor() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioColumnaColor()) {
                cont++;
            }

        }
        //System.out.print("Este es mi cmabio y docena = " + cont );
        return cont;
    }

    public int cuentameCambioColumnaPar() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioColumnaPar()) {
                cont++;
            }

        }
        //System.out.print("Este es mi cmabio y docena = " + cont );
        return cont;
    }

    public int cuentameCambioDocenaMitad() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioDocenaMitad()) {
                cont++;
            }

        }
        //System.out.print("Este es mi cmabio y docena = " + cont );
        return cont;
    }

    public int cuentameCambioDocenaColor() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioDocenaColor()) {
                cont++;
            }

        }
        //System.out.print("Este es mi cmabio y docena = " + cont );
        return cont;
    }

    public int cuentameCambioDocenaPar() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioDocenaPar()) {
                cont++;
            }

        }
        //System.out.print("Este es mi cmabio y docena = " + cont );
        return cont;
    }

    public int cuentameCambioColorPar() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioColorPar()) {
                cont++;
            }

        }
        //System.out.print("Este es mi cmabio y docena = " + cont );
        return cont;
    }

    public int cuentameCambioColorMitad() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioColorMitad()) {
                cont++;
            }

        }
        //System.out.print("Este es mi cmabio y docena = " + cont );
        return cont;
    }

    public int cuentameCambioMitadPar() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioMitadPar()) {
                cont++;
            }

        }
        //System.out.print("Este es mi cmabio y docena = " + cont );
        return cont;
    }

    public int cuentameCambioColumnaDocenaPar() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioColumnaDocenaPar()) {
                cont++;
            }

        }
        //System.out.print("Este es mi cmabio y docena = " + cont );

        return cont;
    }

    public int cuentameNoCambioDocenaColor() {
        int cont = 0;
        int tam = this.vectCambio.length;
        for (int i = 0; i < tam; i++) {

            if (!this.vectCambio[i].isCambioDocenaColor()) {
                cont++;
            }

        }
        //System.out.print("Este es mi cmabio y docena = " + cont );
        return cont;
    }

    public int maxCambioDocenaColor() {
        int cont = 0;
        int max = 0;
        int tam = this.vectCambio.length;

        for (int i = 0; i < tam; i++) {

            if (this.vectCambio[i].isCambioDocena() && this.vectCambio[i].isCambioColor()) {
                cont++;

            } else {
                if (cont > max) {
                    max = cont;

                }
                cont = 0;
            }

        }

        return max;
    }

    
    public void verMaxVecesSequidasNoCambioUno(){
        Class<?> c = Cambio.class;
        Method[] allMethods = c.getDeclaredMethods();
     
        //Seleccionamos los metodos pro que no se guardan de la misma manera.
        Method[] metodo = this.selecMetodosUno(allMethods);
        System.out.println("Maximo No Cambio Color: \t" + this.maxNoCambio(metodo[0]));
        System.out.println("Maximo No Cambio Par: \t\t" + this.maxNoCambio(metodo[2]));
        System.out.println("Maximo No Cambio Mitad: \t" + this.maxNoCambio(metodo[3]));
        System.out.println("Maximo No Cambio Columna: \t" + this.maxNoCambio(metodo[1]));
        System.out.println("Maximo No Cambio Docena: \t" + this.maxNoCambio(metodo[4]));
    }
    
    public int maxNoCambio(Method method) {
        int cont = 0;
        int max = 0;
        int tam = this.vectCambio.length;

        //System.out.println("Mi metodo: " + method.getName());
        Cambio objeto = new Cambio();
        try {

            for (int i = 0; i < tam; i++) {
                Object result = method.invoke(this.vectCambio[i]);

                // System.out.print(result);
                if (result.equals(false)) {
                    cont++;
                } else {
                    if (cont > max) {
                        max = cont;

                    }
                    cont = 0;
                }

            }

        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(AnalisisDeCambios.class.getName()).log(Level.SEVERE, null, ex);
        }

        return max;
    }
    
    private Method[] selecMetodosUno(Method[] allMethods) {
        Method[] selcMet = new Method[5];

        for (Method m : allMethods) {

            String mname = m.getName();
            //System.out.println(mname);

            if (mname.equals("isCambioColor")) {
                selcMet[0] = m;
            }
            if (mname.equals("isCambioColumna")) {
                selcMet[1] = m;
            }
            if (mname.equals("isCambioPar")) {
                selcMet[2] = m;
            }
            if (mname.equals("isCambioMitad")) {
                selcMet[3] = m;
            }
            if (mname.equals("isCambioDocena")) {
                selcMet[4] = m;
            }
        }
        return selcMet;
    }
    
    
    
    public int maxNoCambioDocenaColor() {
        int cont = 0;
        int max = 0;
        int tam = this.vectCambio.length;

     //   System.out.println("Mierdadaa");

        for (int i = 0; i < tam; i++) {

            if (!this.vectCambio[i].isCambioDocena() && !this.vectCambio[i].isCambioColor()) {
                cont++;

            } else {
                if (cont > max) {
                    max = cont;

                }
                cont = 0;
            }

        }

        return max;

    }

    /*        
  public T myMethod(Callable<T> func) {
    return func.call();
}*/
////////////////////////////////////////////////////////////////////////////////    
}
