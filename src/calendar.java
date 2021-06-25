public class calendar {
	private static final int[] MAX_DAYS = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] LEAP_MAX_DAYS = {0,31,29,31,30,31,30,31,31,30,31,30,31};
	
	public boolean isLeapYear(int year) {
		if (year%4 == 0 && (year%100 != 0 || year%400 == 0)) 
			return true;
		else
			return false;
	}
	
	public int maxdaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		}
		else
			return MAX_DAYS[month];
	}
	
	/*
	 * 월을 입력하면 해당월의 달력을 출력
	 * 1일은 일요일로 정해도 무방
	 * -1을 입력받기 전까지 반복 입력 받음
	 * 프롬프트 출력
	 */
	
	public void printCalendar(int year, int month) {
		System.out.printf("   <<%d년 %d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		//get weekday automatically
		int weekday=getWeekday(year, month, 1);
		
		//print blank space
		for (int i=0;i<weekday;i++) {
			System.out.print("   ");
		}
		
		int maxDay = maxdaysOfMonth(year, month);
		int count = 7-weekday;
		int delim = (count < 7) ? count : 0;
				
		//print first line
		for(int i=1;i<=count;i++) {
			System.out.printf("%3d",i);			
		}
		System.out.println();
		
		//print from second line to last line
		count++;
		for (int i=count;i<=maxDay;i++) {
			System.out.printf("%3d",i);
			if (i%7==delim) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println();
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	}

	private int getWeekday(int year, int month, int day) {
		int syear=1970;
		int sweekday=3; //1970/Jan/1st=Thursday
		
		int count=0;
		
		for(int i=syear;i<year;i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		
		for(int i=1;i<month;i++) {
			int delta = maxdaysOfMonth(year,i);
			count += delta;
		}
		
		count += day;
		
		int weekday = (count+sweekday) % 7;
		
		return weekday;
	}
}
