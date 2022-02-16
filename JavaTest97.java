import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest97 {

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));

	}

	private static String fillZero(String src, int len) {
		//src가 공백이거나 null인 경우 src를 반환
		if("".equals(src) || src.length()==len)
			return src;
		//주어진 길이 len이 0보다 작을 경우 공백 반환
		else if(len<0)
			return "";
		else {
			
			// 주어진 문자열의 길이보다 len의 값이 같거나 작은 경우
			// 1. StringBuilder 클래스를 통해서 구하기
//			if(src.length()>len) {
//				StringBuilder sb = new StringBuilder(len);
//				for (int i = 0; i < len; i++) {
//					sb.append(src.charAt(i));
//				}
//				return sb.toString();
//			} else {
//				StringBuilder sb = new StringBuilder(len);
//				for (int i = 0; i < len-src.length(); i++) {
//					sb.append(new Integer(0));
//				}
//				sb.append(src);
//				return sb.toString();
//			}
			
			
			
			// 2.ArrayList 사용해서 구하기
			if(src.length()>len) {
				List<String> list = new ArrayList<>(len);
				
				list.add(src);
				String str = "";
				for(String s : list) {
					str += s;
				}
				
				return str;
			} else {
				List<String> list = new ArrayList<>(len);
				
				for (int i = 0; i < len-src.length(); i++) {
					list.add(new String("0"));
				}
				
				list.add(src);
				String str = "";
				for(String s : list) {
					str += s;
				}
				
				return str;
			}
		}
	}
}