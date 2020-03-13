package figura;

public class Quadrado extends Poligono implements Diagonal {
	

	public Quadrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quadrado(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double diagonal() {
		return this.getBase() * Math.sqrt(2);
	}

	@Override
	public double perimetro() {
		return this.getBase() * 4;
	}

	@Override
	public String toString() {
		return "Quadrado [diagonal= " + diagonal() + ", perimetro= " + perimetro() + ", area= " + area() + "]";
	}
	
	
}
