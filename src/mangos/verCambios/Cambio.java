/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos.verCambios;


import java.lang.reflect.Method;
import mangos.Numero;

/**
 *
 * @author jai
 */
public class Cambio {
   boolean cambioColor;
   boolean cambioPar;
   boolean cambioMitad;
   boolean cambioDocena;
   boolean cambioColumna;

    public Cambio(Numero A,Numero B) {
        
         this.cambioColor  =  this.sonIguales(A.isColor(),B.isColor());
         this.cambioColumna=  this.sonIguales(A.getColumna(),B.getColumna());
         this.cambioDocena = this.sonIguales(A.getDocena(), B.getDocena());
         this.cambioMitad = this.sonIguales(A.getMitad(),B.getMitad());
         this.cambioPar   =this.sonIguales(A.isPar(),B.isPar());
        
    }
    
     public Cambio() {
      /*   this.cambioColor  = false;
         this.cambioColumna=  false;
         this.cambioDocena = false;
         this.cambioMitad = false;
         this.cambioPar   =false^;*/
     }
     
     public void setCambio(Numero A,Numero B){
       
         this.cambioColor  =  this.sonIguales(A.isColor(),B.isColor());
         this.cambioColumna=  this.sonIguales(A.getColumna(),B.getColumna());
         this.cambioDocena = this.sonIguales(A.getDocena(), B.getDocena());
         this.cambioMitad = this.sonIguales(A.getMitad(),B.getMitad());
         this.cambioPar   =this.sonIguales(A.isPar(),B.isPar());
        
    }
    private  boolean sonIguales(boolean A,boolean B){
        boolean resul=true;
        if(A == B){
            resul= false;
        }
        return resul;
    }
    
    private  boolean sonIguales(int A,int B){
        boolean resul=true;
        if(A == B){
            resul= false;
        }
        return resul;
    }
  
    public boolean isCambioColor() {
        return cambioColor;
    }

    public boolean isCambioPar() {
        return cambioPar;
    }

    public boolean isCambioMitad() {
        return cambioMitad;
    }

    public boolean isCambioDocena() {
        return cambioDocena;
    }

    public boolean isCambioColumna() {
        return cambioColumna;
    }
    
/////////////////////////////////////////////////////////////////////////       
    private boolean isHanCambiado(boolean A,boolean B){
        boolean resul=false;
        
        if((A == true)&&(B==true)){
            resul= true;
        }
        return resul;
    }
    
    public boolean isCambioColumnaDocena() {
       return this.isHanCambiado(this.cambioColumna,this.cambioDocena);
    }
    
    public boolean isCambioColumnaMitad() {
       return this.isHanCambiado(this.cambioColumna,this.cambioMitad);
    }
    
     public boolean isCambioColumnaColor() {
       return this.isHanCambiado(this.cambioColumna,this.cambioColor);
    }
     
    public boolean isCambioColumnaPar() {
       return this.isHanCambiado(this.cambioColumna,this.cambioPar);
    }
      
    public boolean isCambioDocenaMitad() {
       return this.isHanCambiado(this.cambioDocena,this.cambioMitad);
    }
    
    public boolean isCambioDocenaColor() {
       return this.isHanCambiado(this.cambioDocena,this.cambioColor);
    }
    
    public boolean isCambioDocenaPar() {
       return this.isHanCambiado(this.cambioDocena,this.cambioPar);
    }
    
    public boolean isCambioColorPar() {
       return this.isHanCambiado(this.cambioColor,this.cambioPar);
    }
    
    public boolean isCambioColorMitad() {
       return this.isHanCambiado(this.cambioColor,this.cambioMitad);
    }
    
    public boolean isCambioMitadPar() {
       return this.isHanCambiado(this.cambioPar,this.cambioMitad);
    }
    
//////////////////////////////////////////////////////////////////////////
    private boolean isHanCambiado(boolean A,boolean B,boolean C){
        boolean resul=false;
        
        if((A == true)&&(A == B)&&(B == C)){
            resul= true;
        }
        return resul;
    }
 
    public boolean isCambioColumnaDocenaMitad() {
       return this.isHanCambiado(this.cambioColumna,this.cambioDocena,this.cambioMitad);
    }
    
    public boolean isCambioColumnaDocenaPar() {
       return this.isHanCambiado(this.cambioColumna,this.cambioDocena,this.cambioPar);
    }
    
    public boolean isCambioColumnaDocenaColor() {
       return this.isHanCambiado(this.cambioColumna,this.cambioDocena,this.cambioColor);
    }
    
    
   public boolean isCambioColumnaMitadPar() {
       return this.isHanCambiado(this.cambioColumna,this.cambioMitad,this.cambioPar);
    }
    
    public boolean isCambioColumnaMitadColor() {
       return this.isHanCambiado(this.cambioColumna,this.cambioMitad,this.cambioColor);
    }
    
    
    
 
    public boolean isCambioColumnaParColor() {
       return this.isHanCambiado(this.cambioColumna,this.cambioPar,this.cambioColor);
    }
     
   public boolean isCambioDocenaMitadPar() {
       return this.isHanCambiado(this.cambioDocena,this.cambioMitad,this.cambioPar);
    }
    
     public boolean isCambioDocenaMitadColor() {
       return this.isHanCambiado(this.cambioDocena,this.cambioMitad,this.cambioColor);
    }
    
     public boolean isCambioDocenaParColor() {
       return this.isHanCambiado(this.cambioDocena,this.cambioPar,this.cambioColor);
    }
     
     
      public boolean isCambioMitadParColor() {
       return this.isHanCambiado(this.cambioMitad,this.cambioPar,this.cambioColor);
    }
    
/////////////////////////////////////////////////////////////////////////////////////    
        private boolean isHanCambiado(boolean A,boolean B,boolean C,boolean D){
        boolean resul=false;
        
        if((A == true)&&(A == B)&&(B == C)&&(C==D)){
            resul= true;
        }
        return resul;
    }
        
    public boolean isCambioColumnaDocenaMitadPar() {
       return this.isHanCambiado(this.cambioColumna,this.cambioDocena,this.cambioMitad,this.cambioPar);
    }
    
    public boolean isCambioColumnaDocenaMitadColor() {
       return this.isHanCambiado(this.cambioColumna,this.cambioDocena,this.cambioMitad,this.cambioColor);
    }
    
    public boolean isCambioColumnaDocenaParColor() {
       return this.isHanCambiado(this.cambioColumna,this.cambioDocena,this.cambioPar,this.cambioColor);
    }
    
    public boolean isCambioColumnaMitadParColor() {
       return this.isHanCambiado(this.cambioColumna,this.cambioMitad,this.cambioPar,this.cambioColor);
    }
    
    
    public boolean isCambioDocenaMitadParColor() {
       return this.isHanCambiado(this.cambioPar,this.cambioDocena,this.cambioMitad,this.cambioColor);
    }
            
        
        
/////////////////////////////////////////////////////////////////////////////////////    
     private boolean isHanCambiado(boolean A,boolean B,boolean C,boolean D,boolean E){
        boolean resul=false;
        
        if((A == true)&&(A == B)&&(B == C)&&(C==D)&&(E==C)){
            resul= true;
        }
        return resul;
    }
     
     private boolean isHanCambiadoTodo(){
       return isHanCambiado(this.cambioColor,this.cambioColumna,this.cambioDocena,this.cambioMitad,this.cambioPar);
    }
      
        
    
    @Override
    public String toString() {
        return "Cambio{" + "cambioColor=" + cambioColor + ", cambioPar=" + cambioPar + ", cambioMitad=" + cambioMitad + ", cambioDocena=" + cambioDocena + ", cambioColumna=" + cambioColumna + '}';
    }

    Method[] getMethods() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    
   
   
    
}
