
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

import javax.jws.Oneway;
import javax.print.attribute.standard.OrientationRequested;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiEvent;

import ch4.For3;

public class JavaTest82 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		//ó���� 10�� �ְ�
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		//�� ������ 20�� �ְ�
		t.setChannel(20);
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		
		//���� ch�� vol�� ��Ÿ����
		System.out.println("��ü:"+t);
		
		//ch���� vol�� ���ϱ�
		System.out.println("ch���� vol�� ��:"+ t.upAndDown(t.getChannel(), t.getVolume()));
	}
}

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int preChannel; //������ ������ channel �� �ֱ�
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(MIN_CHANNEL > channel || channel > MAX_CHANNEL)
			return;
		preChannel = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(MIN_VOLUME > volume || volume > MAX_VOLUME)
			return;
		this.volume = volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(preChannel);
	}
	
	@Override
	public String toString() {
		return "ch="+getChannel()+" vol="+getVolume();
	}
	
	String upAndDown(int x, int y) {
		return x > y ? "ch�� �� Ů�ϴ�." : (x<y ? "vol�� �� Ů�ϴ�." : "���� �����ϴ�.");
	}
	
}