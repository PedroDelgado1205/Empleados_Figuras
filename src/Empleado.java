public class Empleado {
    private double sueldoBruto=7890.55;

    public void mostrar(){
        //Persona per = new Persona();
        //per.nombre="hola";
        //per.mostrar();
    }
    public void calcularSalario(){
        double descuento = sueldoBruto * 10;
        double neto = descuento - sueldoBruto;
        System.out.println(neto);
    }
}
