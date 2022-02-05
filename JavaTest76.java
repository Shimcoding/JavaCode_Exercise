
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

public class JavaTest76 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		//ó�� ���� ��ǥ �Է�
		System.out.print(p);
		//getDistance()�� ���� ��ǥ�� �ְ� �Ÿ� ���
		System.out.println(p.getDistance(2,2));
	}
}

class MyPoint{
	int x;
	int y;
	
	MyPoint() {
		this(0,0);
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		System.out.print("��ǥ:("+x1+","+y1+")�� �Ÿ�= ");
		// Math.abs()�� ���̳ʽ��� �� ��츦 ���
		// Math.pow()�� ���� ���, Math.sqrt()�� ������ ���
		return Math.sqrt((double)Math.pow(Math.abs(x1-x),2)+(double)Math.pow(Math.abs(y1-y), 2));
	}
	
	@Override
	public String toString() {
		return "��ǥ:("+x+","+y+")�� ";
	}
}