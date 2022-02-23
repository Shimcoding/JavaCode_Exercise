import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class JavaTest111 {
	public static void main(String[] args) {
		
		//반을 기준으로 비교해서 오름차순으로 정렬
		//반이 같을 경우 번호를 비교해서 오름차순으로 정렬
		ArrayList<? super Student2> list = new ArrayList<>();
		list.add(new Student2("홍길동",2,1,100,100,100)); 
		list.add(new Student2("남궁성",1,2,90,70,80)); 
		list.add(new Student2("김자바",1,3,80,80,90)); 
		list.add(new Student2("이자바",2,4,70,90,70)); 
		list.add(new Student2("안자바",1,5,60,100,80));
		
		Collections.sort(list, new BanNoAscending());

		Iterator<? super Student2> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
} // class Student

class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		Student2 s1 = (Student2)o1;
		Student2 s2 = (Student2)o2;
		
		if(s1.ban==s2.ban) {
			return s1.no - s2.no;
		} else {
			return s1.ban - s2.ban;
		}
	}
}
