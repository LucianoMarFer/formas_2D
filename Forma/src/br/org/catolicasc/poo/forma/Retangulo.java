
package br.org.catolicasc.poo.forma;


public class Retangulo extends Forma{
    protected double base, altura = 1;
    double area, perimetro;
    //double area, perimetro;
    
    public Retangulo(){        
    }
     public Retangulo(double base, double altura){
         this.base = base;
         this.altura = altura;
     }
    public Retangulo(double base, double altura, String c, boolean p){
        this.base = base; 
        this.altura = altura;
        this.cor = c;
        this.preenchido = p;        
    }
   public double getBase(){
       return base;
   }
   public double getAltura(){
       return altura;
   }
   public void setBase(double base){
       this.base = base;       
   }
   public void setAltura(double altura){
       this.altura = altura;       
   }
   public double getArea(){
       area = (base * altura);
       return area;
   }
   public double getPerimetro(){
       perimetro = 2 * (base + altura);
       return perimetro;
   }
   public String toString(){
       return "Retangulo[base = " + base + " , altura = " + altura + " = , cor = " + cor + " , preenchido : " + preenchido + " ]";
   }
}

