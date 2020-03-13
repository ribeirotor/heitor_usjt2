package figura;

public class Triangulo extends Poligono {

	public Triangulo() {
		super();
	}

	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return (this.getBase() * this.getAltura()) / 2;
	}

	@Override
	public double perimetro() {
		return 3 * this.getBase();
	}

	@Override
	public String toString() {
		return "Triangulo [area= " + area() + ", perimetro= " + perimetro() + "]";
	}
	
	

}
