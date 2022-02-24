import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class JavaTest112 {

	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // list . ���� �� �������� ������������ �����Ѵ�
		int prevRank = -1; // ���� �������
		int prevTotal = -1; // ���� ����
		int length = list.size();
		
		for (int i = 0; i < list.size(); i++) {
			Student3 s = (Student3)list.get(i);
			if(s.total == prevTotal) {
				s.schoolRank = prevRank;
			} else {
				s.schoolRank = i + 1;
			}
			prevRank = s.schoolRank;
			prevTotal = s.total;
			
			
		}
	}

	public static void main(String[] args) {
		ArrayList<Student3> list = new ArrayList<>();
		list.add(new Student3("���ڹ�",2,1,70,90,70)); 
		list.add(new Student3("���ڹ�",2,2,60,100,80)); 
		list.add(new Student3("ȫ�浿",1,3,100,100,100)); 
		list.add(new Student3("���ü�",1,1,90,70,80)); 
		list.add(new Student3("���ڹ�",1,2,80,80,90));
		
		calculateSchoolRank(list);
		
		Iterator<Student3> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}

class Student3 implements Comparable<Student3> {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total; // ����
	int schoolRank; // �������

	Student3(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public int compareTo(Student3 o) {
		return o.total - this.total;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank; // �����߰�
	}
} // class Student