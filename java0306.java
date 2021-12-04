import java.util.Scanner;

public class java0306 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int a = sc.nextInt();
		System.out.println(toNum(a));

	}

	public static int toNum(int a) {
		int result = 0;
		int[] dash = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		while (a>0) {
				int num = a % 10; //나머지
				a /= 10; //while문을 끝내기 위함
				//   1 / 10
				result += dash[num];
			}
			return result;//void가 아닐시에는 리턴값 받기
		
	}
}
