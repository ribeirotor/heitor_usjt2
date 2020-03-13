package figura;
import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		ArrayList<Figura> lista = new ArrayList<Figura>();
		lista.add(new Triangulo(3, 3));
		lista.add(new Retangulo(3, 3));
		lista.add(new Quadrado(3, 3));
		lista.add(new Losango(3, 3));
		lista.add(new Circulo(3));
		
		for(Figura figura : lista) {
			System.out.println(figura.toString());
		}
		
	}
}
