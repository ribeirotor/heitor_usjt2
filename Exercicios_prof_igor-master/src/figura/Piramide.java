package figura;

public class Piramide extends Poligono3D {
	@Override
	public double volume() {
		return ((this.getBase() * this.getAltura()) * this.getProfundidade()) / 3;
	}
}
