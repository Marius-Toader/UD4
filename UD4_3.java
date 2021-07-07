public class UD4_3 {
	
	public static void valores(int X, int Y, double N, double M) {
		System.out.println("Valor de X = " + X);
		System.out.println("Valor de Y = " + Y);
		System.out.println("Valor de N = " + N);
		System.out.println("Valor de M = " + M);
	}

	public static void sumaI(int X, int Y) {
		int resultado = X + Y;
		System.out.println("Suma de " + X + " + " + Y + " = " + resultado);
	}
	
	public static void diferenciaI(int X, int Y) {
		int resultado = X - Y;
		System.out.println("Diferencia de " + X + " + " + Y + " = " + resultado);
	}
	public static void productoI(int X, int Y) {
		int resultado = X * Y;
		System.out.println("Producto de " + X + " + " + Y + " = " + resultado);
	}
	
	public static void cocienteI(int X, int Y) {
		int resultado = X / Y;
		System.out.println("Cociente de " + X + " + " + Y + " = " + resultado);
	}
	
	public static void restoI(int X, int Y) {
		int resultado = X % Y;
		System.out.println("Resto de " + X + " + " + Y + " = " + resultado);
	}
	
	public static void sumaD(double N, double M) {
		double resultado = N + M;
		System.out.println("Suma de " + N + " + " + M + " = " + resultado);
	}
	
	public static void diferenciaD(double N, double M) {
		double resultado = N - M;
		System.out.println("Diferencia de " + N + " + " + M + " = " + resultado);
	}
	public static void productoD(double N, double M) {
		double resultado = N * M;
		System.out.println("Producto de " + N + " + " + M + " = " + resultado);
	}
	
	public static void cocienteD(double N, double M) {
		double resultado = N / M;
		System.out.println("Cociente de " + N + " + " + M + " = " + resultado);
	}
	
	public static void restoD(double N, double M) {
		double resultado = N % M;
		System.out.println("Resto de " + N + " + " + M + " = " + resultado);
	}
	
	public static void sumaM(int X, double M) {
		double resultado = X + M;
		System.out.println("Suma de " + X + " + " + M + " = " + resultado);
	}
	
	public static void cocienteM(int Y, double M) {
		double resultado = Y / M;
		System.out.println("Cociente de " + Y + " + " + M + " = " + resultado);
	}
	public static void restoM(int Y, double M) {
		double resultado = Y % M;
		System.out.println("Cociente de " + Y + " + " + M + " = " + resultado);
	}
	
	public static void dobleI(int V) {
		int resultado = V * 2;
		System.out.println("Doble de " + V + " = " + resultado);
	}
	
	public static void dobleD(double V) {
		double resultado = V * 2;
		System.out.println("Doble de " + V + " = " + resultado);
	}
	
	public static void suma(int X, int Y, double N, double M) {
		double resultado = X + Y + N + M;
		System.out.println("Suma de todas las variables = " + resultado);
	}
	
	public static void producto(int X, int Y, double N, double M) {
		double resultado = X * Y * N * M;
		System.out.println("Producto de todas las variables = " + resultado);
	}
	public static void main(String[] args) {
		int X = 1, Y = 15;
		double N = 9.35, M = 20.01;
		
		valores(X, Y, N, M);
		sumaI(X, Y);
		diferenciaI(X, Y);
		productoI(X, Y);
		cocienteI(X, Y);
		restoI(X, Y);
		sumaD(N, M);
		diferenciaD(N, M);
		productoD(N, M);
		cocienteD(N, M);
		restoD(N, M);
		sumaM(X, N);
		cocienteM(Y, M);
		restoM(Y, M);
		dobleI(X);
		dobleI(Y);
		dobleD(N);
		dobleD(M);
		suma(X, Y, N, M);
		producto(X, Y, N, M);
	}
}