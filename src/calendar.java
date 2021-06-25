import java.util.Scanner;

public class calendar {
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	public int maxdaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		calendar cal = new calendar();
		System.out.println("달을 입력해주세요.");
		int month = scanner.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.maxdaysOfMonth(month));
		scanner.close();
	}
}
