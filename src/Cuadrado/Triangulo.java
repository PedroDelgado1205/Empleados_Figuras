package Cuadrado;

public class Triangulo {
    public int lado;

    public Triangulo(){
        this.lado=6;
    }

    public Triangulo(int lado){
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
        return ((Math.cbrt(3)/4)*Math.pow(this.lado, 2));
    }

    public int calcularPerimetro(){
        return this.lado*3;
    }
}
