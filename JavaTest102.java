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
		// �� ���� ���ڸ� �޾Ƽ� �� ���� ������ �������� ���
		//��ȿ�� �˻�
		if(args.length!=2) {
			System.out.println("���� �ܰ� �� ��, �� ���� ������ �Է����ּ���.");
			System.exit(0);
		} else if(Integer.valueOf(args[0])>=Integer.valueOf(args[1])) {
			System.out.println("���� ���� �� �ܺ��� ���ų� Ŭ �� �����ϴ�.");
			System.exit(0);
		} else if(Integer.valueOf(args[0])<2 || Integer.valueOf(args[1])>9) {
			System.out.println("���� ������ 2�� 9������ ���̾�� �մϴ�.");
			System.exit(0);
		}
		
		
		for (int i = Integer.valueOf(args[0]); i <= Integer.valueOf(args[1]); i++) {
			System.out.println(i+"��");
			
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%d%n",i,j,i*j);
			}
			System.out.println();
			
		}
	}
}