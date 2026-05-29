package SimulacroExamen.SimulacroExamen;

public class GestorNotas {

	public double calcularMedia(double n1, double n2, double n3) {
		return (n1 + n2 + n3) / 3;

	}

	public static boolean estaAprobado(double media) {

		if (media >= 5) {

			return true;

		} else {

			return false;
		}

	}

	public static String notaTexto(double media) {
		if (media < 5) {
			return "suspenso";
		} else if (media >= 5 && media < 7) {
			return "aprobado y suficiente";
		} else if (media >= 7 && media < 9) {
			return "aprobado y notable";
		} else {
			return "aprobado y sobresaliente";
		}

	}

	public static double notaMaxima(double n1, double n2, double n3) {
		
		if (n1 < 0 ||  n2 < 0 || n3 < 0 ) {
			
			throw new IllegalArgumentException("La nota no puede ser un número negativo");
			
		} if (n1 > 10 || n2 > 10 || n3 > 10) {
			throw new IllegalArgumentException("La nota no puede ser un número mayor que 10");
			
		}  
		
		
		if (n1 > n2 && n1 > n3) {
			
		return n1;
			
		} else if (n2 > n1 && n2 > n3) {
			
			return n2;
			
		}
		
		return n3;
	}

	

	public static void main(String[] args) {

		GestorNotas gestorNotas = new GestorNotas();

		double mediaCalculada = gestorNotas.calcularMedia(5, 7, 8);

		System.out.println("la media es : " + mediaCalculada);

		System.out.println(estaAprobado(mediaCalculada));

		System.out.println(notaTexto(mediaCalculada));

		System.out.println(GestorNotas.notaMaxima(10, 6, 9));
	}

}
