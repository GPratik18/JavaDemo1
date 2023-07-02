import java.time.*;
public class JodaTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println(date);
		System.out.println(time);
		
		int day=date.getDayOfMonth();
		int month=date.getMonthValue();
		int year=date.getYear();
		
		System.out.println(day+" /"+month+" /"+year);
		
		int hour=time.getHour();
		int minute=time.getMinute();
		int second=time.getSecond();
		int nano=time.getNano();
		
		System.out.println(hour+" :"+minute+" :"+second+" :"+nano);
	}
}
