package Cuadrado;

public class Rectangulo {
    private int base=0;
    private int altura=0;

    public Rectangulo(){
        this.base=5;
        this.altura=10;
    }
    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura(){
    return altura;
    }

    public void setBase(int base) {
        if (base>0){
            this.base = base;
        }else {
            System.out.println("No ingrese valores negativos");
        }

    }
    public void setAltura(int altura) {
        if (altura>0){
            this.altura = altura;
        }else {
            System.out.println("No ingrese valores negativos");
        }

    }
    public double calcularArea() {
        return this.altura*this.base;
    }

    public int calcularPerimetro(){
        return (this.altura*2)+(this.base*2);
    }
}
