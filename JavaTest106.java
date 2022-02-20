import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest106 {

	public static void main(String[] args) {
		// 2010년의 매월 두 번째 일요일의 날짜를 출력
		Calendar cal = Calendar.getInstance();
		
		cal.set(2010, 0, 1);
		
		for (int i = 0; i <12 ; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			
			int secondSunday = (weekday==1) ? 8 : 16 -weekday;
			
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime(); 
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
		
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH,1);
		}
	}
}