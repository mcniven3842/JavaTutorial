package SetterAndGetter;

public class Coche {
    //al definir las viables con private se impide que sean accesibles a otras clases
    //esto corresponde a encapsulacion
    
    //Las variables fijas y comunes a todos los coches:
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    
    /* Las variables del auto que son variables dependiendo el tipo de coche */
    String color;
    int peso_total;
    boolean asientos_cuero,climatizador;
    

    /* metodo constructor que inicializa las variables */
    public Coche(){
    ruedas = 4;
    largo = 2000;
    motor = 1600;
    peso_plataforma = 500;
    }
    
    /* metodo getter, indica el tipo de dato a regresar, devuelve un dato */
    public String dime_largo(){
    
        return "el largo del coche es " +largo;
    }
    
    /* metodo setter, modifica el valor de una propiedad, no devuelve dato */
    public void establece_color(String color_coche){
    color = color_coche;
    }
    
    /* otro metodo getter para indicar color */
    public String dime_color(){
    return "el color del coches es "+ color;
    }
    
    
}
