package figura;

public abstract class Poligono extends Figura{
	private double base;
	private double altura;
	
	public Poligono() {
		super();
	}
	
	public Poligono(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double area() {
		return base * altura;
	}
}
