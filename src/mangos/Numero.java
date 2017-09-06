package mangos;

/**
 *
 * @author Andrés
 */
public class Numero {

    static private int contador = 1;
    static private boolean col = true;
    static private int colum = 1;
    static private int linea = 0;

    private int valor;
    private boolean par;    //0 Impar, 1 Par
    private boolean color;  //0 Negro , 1 Rojo
    private int decena;     // 1ª 1-12 , 2º13-24, 25-36 
    private int columna;
    private int mitad;
    private int fila;

    public Numero() {
        this.valor = contador;
        
        if(contador == 0) {
                 
            contador++;
        }else{
            contador++;
            this.par = paridad();
            this.color = colores();
            col = !col;
            this.columna = columnas();
            colum++;
            this.decena = decena();
            this.mitad = mitad();
            this.fila = filas();
        }
    }

    private boolean paridad() {
        if (this.valor % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean colores() {   
         if (this.valor == 11){
            this.col = false;
            return false;
        }
        else if(this.valor == 19){
            this.col = true;
            return true;
        }
        
        else if(this.valor == 29){
            this.col = false;
            return false;
        }
        else
            return col;
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
    
    private int columnas(){
        if (this.colum == 4 ){
            this.colum = 1;
            return this.colum;
        }
        else
            return this.colum;
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
    
    private int filas(){
        if(this.columna == 1){
            this.linea++;
        }
        return this.linea;
    }
    
    public int getValor() {
        return valor;
    }

    public int getColumna() {
        return columna;
    }

    @Override
    public String toString() {
        return "Numero{" + "valor=" + valor + ", par=" + par + ", color=" + color + ", decena=" + decena + ", columna=" + columna + ", mitad=" + mitad + ", fila=" + fila + '}';
    }

    
}
