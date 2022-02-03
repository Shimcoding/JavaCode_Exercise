
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

public class JavaTest73 {
	public static void main(String[] args) {
		SutdaCard2 card1 = new SutdaCard2(3,false);
		SutdaCard2 card2 = new SutdaCard2();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		System.out.println("card1이 선택한 숫자:"+card1.getNum());
		System.out.println("card2이 선택한 숫자:"+card2.getNum());
		
	}	
}		

class SutdaCard2{
	private int num;
	private boolean isKwang;
	
	SutdaCard2() {
		this(1,true);
	}
	
	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if(1<=num && num<=10) {
			this.num = num;
		}
	}
	public boolean isKwang() {
		return isKwang;
	}
	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
	String info() {
		return isKwang == true ? num+"K" : num+"";
	}
	
}