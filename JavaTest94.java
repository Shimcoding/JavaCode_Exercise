import java.util.Arrays;
import java.util.Iterator;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest94 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		// 1.subString()으로 나누기
//		path = fullPath.substring(0,fullPath.indexOf("\\P"));
//		fileName = fullPath.substring(fullPath.indexOf("\\P")+1);
//		
//		System.out.println("fullPath:"+fullPath);
//		System.out.println("path:"+path);
//		System.out.println("fileName:"+fileName);
		
		
		
		// 2.split()으로 '\'나누기
		String[] str = fullPath.split("\\\\");
		System.out.println(Arrays.toString(str));
		
		for (int i = 0; i < str.length-1; i++) {
			path += str[i]+"\\";
		}
		path = path.substring(0,path.length()-1);
		fileName = str[str.length-1];
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
		
	}
}
