package ClaseAbstracta;

/* en este caso la clase figura es abstracta */
/* no se puede instanciar*/
/* obliga a que las clases hijas tengan los mismo metodos que ella */
/* se puede heredar n cantidad de veces */
public abstract class Figura {
	
	
	/* declara variables */
	private int numeroLados; 
	
	/*constrcutor */
	public Figura() {
		this.numeroLados = 0;
	}
	
	public abstract float area();
	

}
