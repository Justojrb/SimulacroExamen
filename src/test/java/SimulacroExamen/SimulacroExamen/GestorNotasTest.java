package SimulacroExamen.SimulacroExamen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GestorNotasTest {

	GestorNotas gestorNotas = new GestorNotas();

	@Test
	void testMedia() {

		GestorNotas g = new GestorNotas();
		assertEquals(6.666666666666667, g.calcularMedia(5, 7, 8));
	}

	@Test
	void testAprobado() {
		GestorNotas g = new GestorNotas();
		assertTrue(true);

	}

	@Test
	void tipoNota() {
		GestorNotas g = new GestorNotas();
		assertEquals("APROBADA Y NOTABLE", GestorNotas.notaTexto(8));

	}

	@Test

	void notaMax() {
		double n1 = 10;
		double n2 = 8;
		double n3 = 7;
		double resultado = gestorNotas.notaMaxima(n1, n2, n3);
		assertEquals(10, resultado);
	}
}
