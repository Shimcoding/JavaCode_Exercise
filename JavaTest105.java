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

public class JavaTest105 {

	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890"
				};
		
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String input = sc.nextLine();
			
			if("".equals(input)) {
				continue;
			
			} else if(input.equalsIgnoreCase("q")) {
				System.exit(0);
			
			} else {
				// 입력한 input에 번호가 phoneNumArr[i]에 있으면('-' 제외)
				// list에 추가
				for (int i = 0; i < phoneNumArr.length; i++) {
					String str = phoneNumArr[i].replaceAll("-", "");
					
					if(str.indexOf(input) != -1)
						list.add(phoneNumArr[i]);
				}
			}
			
			
			if(list.size()>0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("일치하는 번호가 없습니다.");
			}
		}
		
	}
}