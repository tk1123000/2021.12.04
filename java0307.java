
public class java0307 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
//		String[] s =score.split(",");

		System.out.println("A : " + split(score, 'A'));
		System.out.println("B : " + split(score, 'B'));
		System.out.println("C : " + split(score, 'C'));
		System.out.println("D : " + split(score, 'D'));
		System.out.println("F : " + split(score, 'F'));
	}

	private static int split(String score,char a) {
       int num = 0;
		for (int i = 0; i < score.length(); i++) {
			if(score.charAt(i) == a) {
				num++;
		}
		
	


		}return num;
		
		}
	}
        
		
		
		
		


