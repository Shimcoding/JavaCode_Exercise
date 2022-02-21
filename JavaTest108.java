import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class JavaTest108 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("홍길동",1,1,100,100,100)); 
		list.add(new Student("남궁성",1,2,90,70,80)); 
		list.add(new Student("김자바",1,3,80,80,90)); 
		list.add(new Student("이자바",1,4,70,90,70)); 
		list.add(new Student("안자바",1,5,60,100,80));
		
		Collections.sort(list);
		Iterator<Student> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class Student implements Comparable<Student>{
	String name;
	int ban;
	int no;
	int kor, eng, math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
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

	//이름 순으로 나열하기
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
		//이름 역순으로 할려면 *-1하면 됨
	}

}