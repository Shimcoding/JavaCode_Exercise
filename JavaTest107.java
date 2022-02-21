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

public class JavaTest107 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); // 교집합
		ArrayList cha = new ArrayList(); // 차집합
		ArrayList hap = new ArrayList(); // 합집합
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		//교집합 구하기
		for (int i = 0; i < list1.size(); i++) {
			if(list1.contains(list2.get(i))) {
				kyo.add(list2.get(i));
			}
		}
		
		//차집합 구하기
		for (int i = 0; i < list1.size(); i++) {
			if(!list2.contains(list1.get(i))) {
				cha.add(list1.get(i));
			}
		}
		
		//합집합 구하기
		hap.addAll(list1);

		for (int i = 0; i < list1.size(); i++) {
			if(!hap.contains(list2.get(i))) {
				hap.add(list2.get(i));
			}
		}
		
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);
	}
}