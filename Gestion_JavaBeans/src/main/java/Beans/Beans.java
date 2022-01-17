
package Beans;

import java.io.Serializable;


public class Beans implements Serializable {
   private int base;
   private int altura;

   
    public Beans() {
    }

    public Beans(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

   
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
  
   public int getArea(){
       
       return base * altura;
   }
}
