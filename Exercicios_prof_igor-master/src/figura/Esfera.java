package figura;

public class Esfera extends Poligono3D {
	private double raio;

	public Esfera() {
		super();
	}

	public Esfera(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double volume() {
		return (4 * Math.PI * Math.pow(this.getRaio(), 3) / 3);
	}
}
