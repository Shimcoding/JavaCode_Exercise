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

public class JavaTest102 {

	public static void main(String[] args) {
		// 두 개의 숫자를 받아서 두 숫자 사이의 구구단을 출력
		//유효성 검사
		if(args.length!=2) {
			System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
			System.exit(0);
		} else if(Integer.valueOf(args[0])>=Integer.valueOf(args[1])) {
			System.out.println("시작 단이 끝 단보다 같거나 클 수 없습니다.");
			System.exit(0);
		} else if(Integer.valueOf(args[0])<2 || Integer.valueOf(args[1])>9) {
			System.out.println("단위 범위는 2와 9사이의 값이어야 합니다.");
			System.exit(0);
		}
		
		
		for (int i = Integer.valueOf(args[0]); i <= Integer.valueOf(args[1]); i++) {
			System.out.println(i+"단");
			
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%d%n",i,j,i*j);
			}
			System.out.println();
			
		}
	}
}