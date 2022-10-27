
package br.org.catolicasc.poo.forma;


public class Quadrado extends Retangulo{
    public double lado = 1.0;
    public Quadrado(){
    }
    public Quadrado(double lado){
        this.lado = lado;
    }
    public Quadrado(double lado, String cor, boolean preenchido){
        this.lado = lado;
        this.cor = cor; 
        this.preenchido = preenchido;
    }
    public void setLado(double lado){
       this.lado = lado;       
   }
   public double getLado(){
       return lado;
   }
   public double getArea(){
       area = (lado * lado);
       return area;
   }
   public double getPerimetro(){
       perimetro = 2 * (lado + lado);
       return perimetro;
   }
   public String toString(){
       return "Quadrado[lado = " + lado + " , cor " + cor + " ,   preenchido " + preenchido + " ]";
   }
}
