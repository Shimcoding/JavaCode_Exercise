import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class JavaTest110 {
	static int getGroupCount(TreeSet tset, int from, int to) {
		
		Student1 s1 = new Student1("", 0, 00, from, from, from);
		Student1 s2 = new Student1("", 0, 00, to, to, to);
		
		return tset.subSet(s1, s2).size();

	}

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Student1 o1, Student1 o2) {
				return o1.getAverage() - o2.getAverage()
			}
		});
		set.add(new Student1("È«±æµ¿ ", 1, 1, 100, 100, 100));
		set.add(new Student1("³²±Ã¼º ", 1, 2, 90, 70, 80));
		set.add(new Student1("±èÀÚ¹Ù ", 1, 3, 80, 80, 90));
		set.add(new Student1("ÀÌÀÚ¹Ù ", 1, 4, 70, 90, 70));
		set.add(new Student1("¾ÈÀÚ¹Ù ", 1, 5, 60, 100, 80));
		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}
}

class Student1 implements Comparable<Student1> {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student1(String name, int ban, int no, int kor, int eng, int math) {
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

	public int compareTo(Student1 o) {
		return name.compareTo(o.name);
	}
} // class Student