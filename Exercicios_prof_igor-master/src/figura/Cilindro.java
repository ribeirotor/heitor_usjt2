package figura;

public class Cilindro extends Poligono3D{
	private double raio;
	
	public Cilindro() {
		super();
	}

	public Cilindro(double raio) {
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
		return (Math.PI * Math.pow(raio, 2)) * this.getAltura();
	}
}
