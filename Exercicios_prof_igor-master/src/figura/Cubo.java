package figura;

public class Cubo extends Poligono3D{

	@Override
	public double volume() {
		return Math.pow(this.getBase(), 3);
	}
	
}
