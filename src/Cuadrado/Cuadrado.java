package Cuadrado;

public class Cuadrado {
    private int lado=0;

    public Cuadrado(){
        this.lado=5;
    }
    public Cuadrado(int lado){
        this.lado=lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        if (lado>0){
            this.lado = lado;
        }else {
            System.out.println("No ingrese valores negativos");
        }

    }
    public double calcularArea(){
        return Math.pow(this.lado, 2);
    }

    public int calcularPerimetro(){
        return this.lado*4;
    }
}
