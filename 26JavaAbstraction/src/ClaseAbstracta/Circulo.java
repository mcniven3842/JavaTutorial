package ClaseAbstracta;

public class Circulo extends Figura{

	public float radio;
	
	public float area() {
		return 3.1415f * (this.radio * this.radio);
	}
}
