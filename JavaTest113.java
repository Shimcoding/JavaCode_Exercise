import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class JavaTest113 {

	public static void main(String[] args) {
		ArrayList<Student4> list = new ArrayList<>();
		list.add(new Student4("이자바",2,1,70,90,70)); 
		list.add(new Student4("안자바",2,2,60,100,80)); 
		list.add(new Student4("홍길동",1,3,100,100,100)); 
		list.add(new Student4("남궁성",1,1,90,70,80)); 
		list.add(new Student4("김자바",1,2,80,80,90));
		
		calculateSchoolRank(list);
		calculateSchoolRank(list);
		Iterator it = list.iterator();
		while(it.hasNext())
		System.out.println(it.next());

	}
	
	public static void calculateSchoolRank(List list) {
		Collections.sort(list, new ClassTotalComparator());
		
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for (int i = 0, n=0; i < list.size(); i++, n++) {
			Student4 s = (Student4)list.get(i);
			
			if(s.ban != prevBan) {
				prevRank = -1;
				prevTotal = -1;
				n = 0;
			}
			
			if(s.total == prevTotal) {
				s.classRank = prevRank;
			} else {
				s.classRank = n+1;
			}
			
			prevBan = s.ban;
			prevTotal =s.total;
			prevRank = s.schoolRank;
			
		}
	}
}

class Student4 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank; // 전교등수
	int classRank; // 반등수

	Student4(String name, int ban, int no, int kor, int eng, int math) {
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

	public int compareTo(Object o) {
		if (o instanceof Student4) {
			Student4 tmp = (Student4) o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank + "," + classRank // 새로추가
		;
	}
} // class Student

class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student4 && o2 instanceof Student4) {
			Student4 s1 = (Student4)o1;
			Student4 s2 = (Student4)o2;
			
			int res = s1.ban - s2.ban;
			
			if(res==0)
				res = s2.total - s1.total;
			return res;
		}
		return 0;
	}
}
