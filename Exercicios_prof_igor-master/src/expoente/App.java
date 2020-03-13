package expoente;

public class App {

	public static void main(String[] args) {
		double n = 125;
		double resultado = 0;
		int base = 1;
		int expoente = 0;

		do {
			base++;
			expoente = 0;
			do {
				expoente++;
				resultado = Math.pow(base, expoente);
			} while (resultado < n);
			
		} while (resultado != n);

		System.out.print("Base: " + base + " Expoente: " + expoente + " Resultado: " + resultado);
	}

}
