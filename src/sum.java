import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		int a,b;
		
		//입력: 키보드로 두 수의 입력 받음
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해주세요.");
		s1=scanner.next();
		s2=scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		//출력: 화면에 두 수의 합 출력
		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a+b);
		scanner.close();
	}
}
