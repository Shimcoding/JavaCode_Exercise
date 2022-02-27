import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class JavaTest115 {

	public static void main(String[] args) {
		SutdaCard2 c1 = new SutdaCard2(3,true);
		SutdaCard2 c2 = new SutdaCard2(3,true);
		SutdaCard2 c3 = new SutdaCard2(1,true);
		Set<SutdaCard2> set = new HashSet<SutdaCard2>();
		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		System.out.println(set);
	}
}



class SutdaCard2{
	private int num;
	private boolean isKwang;
	
	public SutdaCard2() {
		this(1,true);
	}

	public SutdaCard2(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isKwang() {
		return isKwang;
	}

	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return isKwang ? num+"K" : num+"";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard2) {
			SutdaCard2 s1 = (SutdaCard2)obj;
			return num == s1.getNum() && isKwang == s1.isKwang();
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
	
}