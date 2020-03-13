package figura;

public class Retangulo extends Poligono implements Diagonal {

	public Retangulo() {
		super();
	}

	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(this.getBase(), 2) + Math.pow(this.getAltura(), 2));
	}

	@Override
	public double perimetro() {
		return (this.getBase() + this.getAltura()) * 2;
	}

	@Override
	public String toString() {
		return "Retangulo [diagonal=" + diagonal() + ", perimetro= " + perimetro() + ", area= " + area() + "]";
	}
	
	
}
