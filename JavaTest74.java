
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiEvent;

public class JavaTest74 {
	public static void main(String[] args) {
		Student4 s = new Student4("홍길동",1,1,100,60,76);
		
		System.out.println("이름:"+s.getName()); 
		System.out.println("총점:"+s.getTotal()); 
		System.out.println("평균:"+s.getAverage()); 
	}
}

class Student4{
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	Student4(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	//(국어,수학,영어)총합 구하기
	int getTotal() {
		// 유효성 검사
		if((0<=math && math<=100)||(0<=kor && kor<=100)||(0<=eng && eng<=100))
			return math+kor+eng;
		
		// 잘못된 값이 들어 왔으면 0을 반환
		return 0;
	}
	
	//(국어,수학,영어)평균 구하기
	double getAverage() {
		return Math.round((getTotal() / 3.0)*10)/10.0;
	}
}