public class Cliente extends Persona{
    private int teledonoContacto=0;

    public void mostar(){
        System.out.println("nombre: "+this.nombre);
        System.out.println("edad: "+this.edad);
        System.out.println("telefono: "+this.teledonoContacto);
    }
    public Cliente(){
        this.nombre="s/n";
        this.edad=0;
        this.teledonoContacto=962820517;
    }
}
