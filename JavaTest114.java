import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class JavaTest114 {

	public static void main(String[] args) {
		// Set을 쓰면 잘 안섞이지만 
		// LinkedHashSet을 쓰면 잘 섞인다.
		Set<String> set = new HashSet<>();
		LinkedHashSet<String> lset = new LinkedHashSet<>(set);
		int[][] board = new int[5][5];
		
		for (int i = 0; lset.size()<25; i++) {
			lset.add((int)(Math.random()*30)+1+"");
		}
		
		Iterator<String> it = lset.iterator();
		
		//board 배열에 값을 넣어서 출력
//		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board[i].length; j++) {
//				board[i][j] = Integer.parseInt((String)it.next());
//				System.out.print((board[i][j] < 10 ? " " : " ")
//								+ board[i][j]);
//			}
//			System.out.println();
//		}
		
		//hasNext()를 통해 바로 값 출력
		int i =1;
		while(it.hasNext()) {
			int num = Integer.valueOf(it.next());
			System.out.print(num < 10 ? num+"  " : num +" ");
			if(i%5==0)
				System.out.println();
			i++;
		}
	}
}
