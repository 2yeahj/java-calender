import java.util.Scanner;

public class prompt {
	
	/*
	 * param week 요일명
	 * return 0~6 (0=Sunday, 6=Saturday)
	 */
	
	public int parseDay(String week) {
		if (week.equals("su")) return 0;
		else if (week.equals("mo")) return 1;
		else if (week.equals("tu")) return 2;
		else if (week.equals("we")) return 3;
		else if (week.equals("th")) return 4;
		else if (week.equals("fr")) return 5;
		else if (week.equals("sa")) return 6;
		else
			return 0;
	}
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		calendar cal = new calendar();
		
		int month=1;
		int year=2020;
		int weekday=0;
		while (true) {
			System.out.println("년도를 입력해주세요. (exit: -1)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if (year==-1) break;
			
			System.out.println("달을 입력해주세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			System.out.println("첫째 날의 요일을 입력하세요.(su, mo, tu, we, th, fr, sa)");
			System.out.print("WEEKDAY> ");
			String str_weekday = scanner.next();
			weekday=parseDay(str_weekday);
			
			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}

			cal.printCalendar(year, month, weekday);
		}	
		
		System.out.println("Bye!");
		scanner.close();
	}
	
	public static void main(String[] args) {
		
		//셸 실행
		prompt p = new prompt();
		p.runPrompt();

	}
}