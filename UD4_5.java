public class UD4_5 {

	public static void main(String[] args) {
		int A = 5, B = 17, C = 7, D = 5;
		
		D = B;
		A = D;
		C = A;
		B = C;
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
	}
}