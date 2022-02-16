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
			// src�� �� ���� ����
			if(pos>=src.length())break;
			
			// target�� ���ڿ��� ���� �� ������ count 1 ����
			// pos���� ���� ��ġ�� +1�� ���ش�
			if(src.indexOf(target,pos)!=-1) {
				count++;
				pos = src.indexOf(target,pos)+1;
			} else {
			// ������ ��� pos�� 1 ����
				pos++;
			}
			
			
		}
		
		// ã�� �� ��ȯ
		return count;
	}
}