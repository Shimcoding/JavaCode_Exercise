
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiEvent;

public class JavaTest75 {
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
	
	static double getDistance(int x,int y, int x1, int y1) {
		// Math.abs()로 마이너스가 될 경우를 대비
		// Math.pow()로 제곱 계산, Math.sqrt()로 제곱근 계산
		return Math.sqrt((double)Math.pow(Math.abs(x1-x),2)+(double)Math.pow(Math.abs(y1-y), 2));
	}
}