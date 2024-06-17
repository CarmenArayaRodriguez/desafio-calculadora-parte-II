package cl.praxis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


 // Clase de prueba para la Calculadora que utiliza JUnit 5.
 // Se añaden comentarios explicativos para ayudar en el proceso de aprendizaje.

public class CalculadoraTest {
    private Calculadora calc = new Calculadora();

    @Test
    public void testSumar() {
        // Prueba que valida que la suma de 2 y 3 sea 5. Este comentario explica el propósito específico de la prueba.
        assertEquals(5, calc.sumar(2, 3), "Esperado: la suma de 2 y 3 debe ser 5");
    }

    @Test
    public void testRestar() {
        // Prueba que valida que la resta de 2 y 3 sea -1. Clarifica qué se está verificando exactamente.
        assertEquals(-1, calc.restar(2, 3), "Esperado: la resta de 2 y 3 debe ser -1");
    }

    @Test
    public void testMultiplicar() {
        // Prueba que valida que la multiplicación de 2 y 3 sea 6. Muestra el resultado esperado claramente.
        assertEquals(6, calc.multiplicar(2, 3), "Esperado: el producto de 2 y 3 debe ser 6");
    }

    @Test
    public void testDividir() {
        // Prueba que valida que la división de 6 por 3 sea 2.0.
        // SE usa 0.001 para permitir pequeñas diferencias en el resultado debido a cómo las computadoras calculan con números decimales.
        assertEquals(2.0, calc.dividir(6, 3), 0.001, "Esperado: la división de 6 por 3 debe resultar en 2.0");
        // Prueba para confirmar que la división por cero lanza la excepción adecuada.
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(1, 0), "Se espera IllegalArgumentException al dividir por cero para evitar errores de tiempo de ejecución.");
    }
}
