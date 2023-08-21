public class Empleado extends Persona {
    public double sueldoBruto=0;

    public void mostrar(){
        System.out.println("nombre: "+ this.nombre);
        System.out.println("edad: "+ this.edad);
        System.out.println("sueldo bruto: "+ this.sueldoBruto);
        System.out.println("salario: "+ this.calSalario());

    }
    public Empleado(){
        this.nombre="s/n";
        this.edad=0;
        this.sueldoBruto=450.0;
    }
    public Empleado(String nombre, int edad, double sueldoBruto){
        this.nombre=nombre;
        this.edad=edad;
        this.sueldoBruto=sueldoBruto;
    }
    public double calSalario(){
        double descuento = this.sueldoBruto * 0.10;
        descuento = this.sueldoBruto - descuento;
        return descuento;
    }
}
