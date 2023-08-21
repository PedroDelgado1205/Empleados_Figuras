public class Persona {
    static final public double PI=3.1416;
    protected String nombre="QWERTY";
    protected int edad=30;

    public Persona(String name){
        this.nombre=name;
    }
    public Persona(){
        this.edad=20;
        this.nombre="S/N";
    }
    public void mostrar(){
        System.out.println(this.nombre+"\n"+this.edad);
    }
    public int getEdad(){
        return this.edad;
    }
    //modificadores
    public void setEdad(int edad){
        this.edad=edad;
    }

}
