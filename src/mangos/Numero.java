package mangos;

/**
 *
 * @author Andrés
 */
public class Numero {

    static private int contador = 1;
    static private boolean col = true;

    private int valor;
    private boolean par;    //0 Impar, 1 Par
    private boolean color;  //0 Negro , 1 Rojo
    private int decena;     // 1ª 1-12 , 2º13-24, 25-36 
    private int columna;
    private int mitad;
    private int fila;

    /*    public Numero(int valor, boolean par, boolean color, int decena, int columna, int mitad, int fila) {
        contador++;
        this.valor = contador;
        this.par = par;
        this.color = color;
        this.decena = decena;
        this.columna = columna;
        this.mitad = mitad;
        this.fila = fila;
    }*/
    public Numero() {
        this.valor = contador;
        contador++;
        this.par = paridad();
        this.color = colores();
        this.decena = decena();
        this.mitad = mitad();

    }

    private boolean paridad() {
        if (this.valor % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean colores() {

        boolean rcol = this.col;

        return rcol;

    }

    private int decena() {

        int doc;

        if (this.valor < 13) {
            doc = 1;
        } else if (this.valor < 25) {
            doc = 2;
        } else {
            doc = 3;
        }

        return doc;
    }

    private int mitad(){
        int mit;
        
        if(this.valor < 19 ){
            mit = 1;  
        }else {
            mit = 2;
        }
        return mit;
    }
    
    public int getValor() {
        return valor;
    }

}
