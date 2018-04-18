package paqueteconpaquete;
import static org.junit.Assert.*;

import org.junit.Test;

public class BuclesTest {
	
	
	@Test
	public void testSuma() {
		int resultado = Bucles.sum(3, 3);
		int esperado = 6;
		assertEquals(esperado,resultado);
	}
}
