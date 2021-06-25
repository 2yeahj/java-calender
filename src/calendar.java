import java.util.Scanner;

public class calendar {
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	public int maxdaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
		String PROMPT="cal> ";
		Scanner scanner = new Scanner(System.in);
		calendar cal = new calendar();
		
		int month=1;
		
		while (true) {
			System.out.println("달을 입력해주세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.maxdaysOfMonth(month));
		}	
		
		System.out.println("Bye!");
		scanner.close();
	}
}
