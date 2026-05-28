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

	void tipoNota () {
    	GestorNotas g = new GestorNotas();
    	assertEquals("APROBADA Y NOTABLE", GestorNotas.notaTexto(8));


 }
}
