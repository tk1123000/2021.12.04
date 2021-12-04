
public class java0308 {

	public static void main(String[] args) {
 
		int input = 8;
		
		for (int i = 1; i <= input; i++) {
			System.out.println(fibo(i)+" ");
		}
		
	}

	private static int fibo(int i) {

		int a = 0;
		int b = 1;
		int tamp = 1;
		for (int j = 1; j < i; j++) {

			tamp = a + b;
			a = b;
			b = tamp;
			
		}
		return tamp;


	
	}
}
