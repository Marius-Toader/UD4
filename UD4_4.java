public class UD4_4 {
	
	public static int incremento77(int N) {
		N = N + 77;
		return N;
	}

	public static int decremento3(int N) {
		N = N - 3;
		return N;
	}
	
	public static int duplicar(int N) {
		N = N * 2;
		return N;
	}
	public static void main(String[] args) {
		int N = 7;
		
		System.out.println("N = " + N);
		N = incremento77(N);
		System.out.println("N = " + N);
		N = decremento3(N);
		System.out.println("N = " + N);
		N = duplicar(N);
		System.out.println("N = " + N);
	}
}