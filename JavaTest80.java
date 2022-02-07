
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.print.attribute.standard.OrientationRequested;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiEvent;

public class JavaTest80 {
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절댓값 :"+abs(value)); 
		// 2. 나온 절댓값들을 리스트에 저장하고 출력
		List<Integer> list = new ArrayList<>();
		list.add(abs(value));
		System.out.println(list);
		
		value = -10;
		System.out.println(value+"의 절댓값 :"+abs(value));
		list.add(abs(value));
		System.out.println(list);
		
	}

	// 1. Math.abs() 절댓값 반환
	private static int abs(int value) {
		return Math.abs(value);
	}
	
	
}