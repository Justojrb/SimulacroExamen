package SimulacroExamen.SimulacroExamen;

public class GestorNotas {

	public double calcularMedia(double n1, double n2, double n3) {
		return (n1 + n2 + n3) /3;

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
		    return "SUSPENSA";
		} else if (media >= 5 && media < 7) {
		    return "APROBADA Y SUFICIENTE";
		} else if (media >= 7 && media < 9) {
		    return "APROBADA Y NOTABLE";
		} else {
		    return "APROBADA Y SOBRESALIENTE";
		}
		
	}
	
	
	public static double notaMaxima(double n1, double n2, double n3) {
		
	
		if (n1 > n2 && n1 > n3) {
			
		return n1;
			
		} else if (n2 > n1 && n2 > n3) {
			
			return n2;
			
		}
		else
		
		return n3;
	}

	public static void main(String[] args) {

		GestorNotas gestorNotas = new GestorNotas();

		double mediaCalculada = gestorNotas.calcularMedia(5, 7, 8);

		System.out.println("LA MEDIA ES : " + mediaCalculada);

		System.out.println(estaAprobado(mediaCalculada));
		
		System.out.println(notaTexto(mediaCalculada));
		
		System.out.println(GestorNotas.notaMaxima(5, 6, 7));
	}

}
