public class Operaciones {
    public int numero;

    public Operaciones() {
        this.numero = 3;
    }

    public Operaciones(int num) {
        this.numero = num;
    }

    public void getFactorial() {
        int fac = 1;
        for (int i = 1; i <= this.numero; i++) {
            fac *= i;
        }
        System.out.println("bucle "+this.numero + "! = " + fac);
    }

    public void mostrarFactorial() {
        System.out.println("recursivo "+this.numero + "! = " + factorialR(this.numero));
    }

    public int factorialR(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorialR(n - 1);
        }
    }
}

