import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest90 {

	public static void main(String[] args) {
		// 1. 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
//		int answer = (int)(Math.random()*100)+1;
		int input = 0; //사용자 입력
		int count = 0; //시도횟수를 세기 위한 변수
		
		
		
		// 2.IntStream을 이용해서 랜덤 값 구해서 answer에 넣기
		IntStream randomInt = new Random().ints(1,101).limit(1);
		int answer = randomInt.sum(); // 어차피 하나의 수로 제한해서 그 값 하나만 나옴
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			Scanner sc = new Scanner(System.in);
			
			try {
				input = sc.nextInt();
				
				// 1~100 사이의 값을 입력했는지 유효성 검사
				if(!isCheck(input))
					throw new Exception();
				
				if(answer>input) {
					System.out.println("더 큰 수를 입력하세요.");
				} else if(answer < input){
					System.out.println("더 작은 수를 입력하세요.");
				} else {
					System.out.println("맞췄습니다.");
					System.out.println("시도횟수는 "+count+"번입니다.");
					break;
				}
			} catch (Exception e) {
				System.out.println("유효하지 않는 값입니다.");
				continue;
			}
			
		} while (true);
	}

	private static boolean isCheck(int input) {
		return 0<input && input <101;
	}
}