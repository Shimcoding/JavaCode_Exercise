import java.util.Arrays;

public class JavaTest86 {

	public static void main(String[] args) {
		
		//���� ���Ÿ� �ϴ� b ��ü ����
		Buyer b = new Buyer();
		
		// 1.������ �����Ͽ� ���� ������ ������ ����
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		// 2. �迭 ���̰� ������ �� �� �� �ø���
				//���� ������ ������ ����
//				b.buy(new Camera());
//				b.buy(new Camera());
//				b.buy(new Camera());
//				b.buy(new Camera());
//				b.buy(new Camera());
//				b.buy(new Camera());
//				b.buy(new Camera());
//				b.buy(new Camera());
//				b.buy(new Camera());
//				b.buy(new Camera());
//				b.buy(new Camera());
		
		// �� ���ǰ� ����� �ݾ� �׸��� ���� �ݾ� ���
		b.summary();
	}
}

class Buyer{
	int money = 1000;
	int PreMoney = money;
	Product[] cart = new Product[10]; //������ ���� ��� ���� �迭
	int i =0;
	
	void buy(Object p) {
		if(p instanceof Product) {
			//����ȯ ���ֱ�
			Product pp = (Product)p;
			
			//���� ������ �� �� �ִ��� �˻�
			if(!isMoney(pp.price)) {
				System.out.println("���� �����Ͽ� "+pp+"��(��) �� �� �����ϴ�.");
				return;
			}
			//īƮ�� ���� �ֱ�
			cart[i++] = pp;
			
			//���ݸ�ŭ �ܾ� ����
			money -= pp.price;
			add();
		}
	}

	void add() {
		// �� �� �迭 ũ�� ����
		if(cart.length <= i) {
			// ������ �迭���� ���̰� 2���� p1 �迭 ����
			Product[] p1 = new Product[cart.length*2];
			// �迭 ����
			System.arraycopy(cart, 0, p1, 0, cart.length);
			// p1�� �ּڰ��� cart�� �ֱ�
			cart = p1;
		}
	}
	
	void summary() {
		StringBuffer sb = new StringBuffer(cart.length);
		System.out.println("īƮ�� ����:"+cart.length);
		System.out.print("������ ����:");
		for(Product p : cart) {
			if(p==null) break;
			sb.append(p);
			sb.append(",");
		}
		System.out.println(sb);
		System.out.println("����� �ݾ�:"+(PreMoney-money));
		System.out.println("���� �ݾ�:"+money);
		
	}
	
	private boolean isMoney(int price) {
		if(money>price) {
			//�� �� ������ true�� ��ȯ
			return true;
		}
		//�� �� ������ false�� ��ȯ
		return false;
	}
	
}

class Product{
	int price; //��ǰ�� ����
	
	Product(int price) {
		this.price = price;
	}
	
}

class Tv extends Product{
	Tv() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product{
	Computer() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}
class Camera extends Product{
	Camera() {
		super(50);
	}
	
	@Override
	public String toString() {
		return "Camera";
	}
}
class Audio extends Product{
	Audio() {
		super(150);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}