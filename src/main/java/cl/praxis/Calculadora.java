package cl.praxis;


 // Clase Calculadora realiza operaciones básicas matemáticas.
 // Esta versión incluye mejoras en la legibilidad y manejo de errores.

public class Calculadora {

    // Suma dos números enteros
    public int sumar(int a, int b) {
        // Directamnete retorna el resultado de la suma.
        return a + b;
    }

    // Resta dos números enteros
    public int restar(int a, int b) {
        // Directamente retorna el resultado de la resta.
        return a - b;
    }

    // Multiplica dos números enteros
    public int multiplicar(int a, int b) {
        // Directamente retorna el resultado de la multiplicación.
        return a * b;
    }

    // Divide dos números enteros, manejando la división por cero.
    public double dividir(int a, int b) {
        // Centraliza el manejo de errores usando un método privado.
        validarDivisor(b);
        // Realiza la división y devuelve el resultado.
        return (double) a / b;
    }

    // Método privado para validar el divisor
    // Valida que el divisor no sea cero para prevenir la división por cero, lo que causaría un error en tiempo de ejecución.
    private void validarDivisor(int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero. Esto evitaría una excepción de división por cero.");
        }
    }
}
