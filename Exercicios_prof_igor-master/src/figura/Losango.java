package figura;

public class Losango extends Poligono {
	
	public Losango() {
		super();
	}

	public Losango(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double perimetro() {
		return this.getBase() * 4;
	}

	@Override
	public String toString() {
		return "Losango [perimetro= " + perimetro() + ", area= " + area() + "]";
	}
	
	
}
