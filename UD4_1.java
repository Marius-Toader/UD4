public class UD4_1 {
	
	public static int suma(int a, int b, int resultado) {
		resultado = a + b;
		return resultado;
	}
	
	public static int resta(int a, int b, int resultado) {
		resultado = a - b;
		return resultado;
	}
	
	public static int multiplicacion(int a, int b, int resultado) {
		resultado = a * b;
		return resultado;
	}
	
	public static int division(int a, int b, int resultado) {
		resultado = a / b;
		return resultado;
	}
	
	public static int residuo(int a, int b, int resultado) {
		resultado = a % b;
		return resultado;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		int resultado = 0;
		
		resultado = suma(a, b, resultado);
		System.out.println("Suma: " + resultado);
		resultado = resta(a, b, resultado);
		System.out.println("Resta: " + resultado);
		resultado = multiplicacion(a, b, resultado);
		System.out.println("Multiplicación: " + resultado);
		resultado = division(a, b, resultado);
		System.out.println("División: " + resultado);
		resultado = residuo(a, b, resultado);
		System.out.println("Residuo: " + resultado);
	}
}