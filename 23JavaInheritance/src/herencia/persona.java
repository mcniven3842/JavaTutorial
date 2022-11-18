package herencia;

public class persona {
	
	/*declara las varibales */
    /*Cuando se declara una variable protegida, esta sera accesible para laa clases hijas */
	/* las variables privadas no son visibles a las clases hijas y deben usar los metodos setter y getter para accederlas*/
	protected String nombre;
	private String apellido;
	private int edad;

	
	/*Se genera un constrcutor que inicializa las variables */
	/* */
	 
	public persona (String nombre, String apellido, int edad){
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	}
	
	
	/*por cada variable privada se debe generan metodos Getter */
    public String getNombre() {
    	return nombre;
    }
    
    public String getApellido() {
    	return apellido;
    }
    
    public int getEdad() {
    	return edad;
    }
    
    
    
    
    
}
