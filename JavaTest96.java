import java.util.Arrays;
import java.util.Iterator;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest96 {

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}

	private static int count(String src, String target) {
		
		int count = 0;
		int pos = 0;
		
		while(true) {
			// src를 다 돌면 종료
			if(pos>=src.length())break;
			
			// target의 문자열과 같은 게 있으면 count 1 증가
			// pos에는 나온 위치에 +1을 해준다
			if(src.indexOf(target,pos)!=-1) {
				count++;
				pos = src.indexOf(target,pos)+1;
			} else {
			// 없으면 계속 pos에 1 증가
				pos++;
			}
			
			
		}
		
		// 찾은 수 반환
		return count;
	}
}