import java.util.Scanner;

public class java0306 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		int a = sc.nextInt();
		System.out.println(toNum(a));

	}

	public static int toNum(int a) {
		int result = 0;
		int[] dash = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		while (a>0) {
				int num = a % 10; //������
				a /= 10; //while���� ������ ����
				//   1 / 10
				result += dash[num];
			}
			return result;//void�� �ƴҽÿ��� ���ϰ� �ޱ�
		
	}
}
