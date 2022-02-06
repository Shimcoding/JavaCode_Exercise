
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

import javax.print.attribute.standard.OrientationRequested;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiEvent;

public class JavaTest78 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		// isNumber()�� �̿��� �����̸� true, �ƴϸ� false ���.
		// ��, �����̳� null ���� '��ȯ�� �� �����ϴ�' ���
		String str = "123";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str)); 
		str = "1234o";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
		str = "";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
	}

	private static String isNumber(String str) {
		//�����̳� null Ȯ��
		if(!isCheck(str)){
			return "�����̳� null�� ��ȯ�� �� �����ϴ�.";
		}
		
		boolean check = true;
		for (int i = 0; i < str.length(); i++) {
			if(!('0'<=str.charAt(i) && str.charAt(i)<='9')){
				check = false;
				break;
			}
		}
		return check == true ? "true" : "false";
	}

	private static boolean isCheck(String str) {
		return str.equals("") || str==null ? false : true;
	}
}