
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

		// isNumber()를 이용해 숫자이면 true, 아니면 false 출력.
		// 단, 공백이나 null 값은 '반환할 수 없습니다' 출력
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str)); 
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}

	private static String isNumber(String str) {
		//공백이나 null 확인
		if(!isCheck(str)){
			return "공백이나 null은 반환할 수 없습니다.";
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