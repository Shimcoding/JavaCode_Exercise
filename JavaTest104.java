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

public class JavaTest104 {

	public static void main(String[] args) {
		// 주어진 범위(from~to)에 속한 임의의 정수값을 반환.
		for(int i=0; i< 20; i++)
			System.out.print(getRand(-1,-3)+",");
	}

	private static int getRand(int from, int to) {
		return (int)(Math.random() * (Math.abs(to-from)+1))+ Math.min(from,to);
	}
}