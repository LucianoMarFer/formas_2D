
package br.org.catolicasc.poo.forma;


public class Circulo extends Forma{
    protected double raio = 1;
    double area, perimetro;
    
    public Circulo(){        
    }
     public Circulo(double raio){
         this.raio = raio;
     }
    public Circulo(double raio, String cor, boolean preenchido){
        this.raio = raio; 
        this.cor = cor;
        this.preenchido = preenchido;        
    }
   public double getRaio(){
       return raio;
   }
   public void setRaio(double raio){
       this.raio = raio;       
   }
   public double getArea(){
       area = (3.14 * raio * raio);
       return area;
   }
   public double getPerimetro(){
       perimetro = (3.14 * 2 * raio);
       return perimetro;
   }
   public String toString(){
       return "Circulo [raio = " + raio + " , cor = "+ cor + " , preenchido = " + preenchido +" ]";
   }
}
