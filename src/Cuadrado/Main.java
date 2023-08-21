package Cuadrado;

public class Main {
    public static void main(String[] args) {
        Cuadrado cua1 = new Cuadrado();
        cua1.setLado(6);
        System.out.println("El lado del cuadrado es: "+cua1.getLado());
        System.out.println("El perimetro es: "+cua1.calcularPerimetro());
        System.out.println("El area es: "+cua1.calcularArea());
        System.out.println("-----------------");
        Triangulo tri1 = new Triangulo();
        tri1.setLado(7);
        System.out.println("El lado del triangulo es: "+tri1.getLado());
        System.out.println("El perimetro es: "+tri1.calcularPerimetro());
        System.out.println("El area es: "+tri1.calcularArea());
        System.out.println("-----------------");
        Rectangulo rec1 = new Rectangulo();
        rec1.setBase(8);
        rec1.setAltura(9);
        System.out.println("La base es: "+rec1.getBase());
        System.out.println("La altura es: "+rec1.getAltura());
        System.out.println("El perimetro es: "+rec1.calcularPerimetro());
        System.out.println("El area es: "+rec1.calcularArea());
        System.out.println("-----------------");

    }

}

