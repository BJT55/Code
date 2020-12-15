package experiment04;
import java.util.*;
public class Order {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		String user_name="007";
		System.out.print("D");
		
		int year=cal.get(Calendar.YEAR);
		System.out.print(year);
		
		int month=cal.get(Calendar.MONTH)+1;
		zeroStart(month);
		System.out.print(month);
		
		int date=cal.get(Calendar.DATE);
		zeroStart(date);
		System.out.print(date);
		
		int hour=cal.get(Calendar.HOUR);
		zeroStart(hour);
		System.out.print(hour);
		
		int minute=cal.get(Calendar.MINUTE);
		zeroStart(minute);
		System.out.print(minute);
		
		int second=cal.get(Calendar.SECOND);
		zeroStart(second);
		System.out.print(second);
		System.out.println(user_name);
	}
	public static void zeroStart(int num){
		if(num<10)
		{
			System.out.printf("0");
		}
	}

}
