import java.util.Arrays;

public class JavaTest86 {

	public static void main(String[] args) {
		
		//물건 구매를 하는 b 객체 생성
		Buyer b = new Buyer();
		
		// 1.물건을 구매하여 돈이 부족할 때까지 진행
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		// 2. 배열 길이가 부족해 두 배 더 늘리고
				//돈이 부족할 때까지 진행
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
		
		// 산 물건과 사용한 금액 그리고 남은 금액 출력
		b.summary();
	}
}

class Buyer{
	int money = 1000;
	int PreMoney = money;
	Product[] cart = new Product[10]; //구입한 물건 담기 위한 배열
	int i =0;
	
	void buy(Object p) {
		if(p instanceof Product) {
			//형변환 해주기
			Product pp = (Product)p;
			
			//들어온 물건을 살 수 있는지 검사
			if(!isMoney(pp.price)) {
				System.out.println("돈이 부족하여 "+pp+"를(을) 살 수 없습니다.");
				return;
			}
			//카트에 물건 넣기
			cart[i++] = pp;
			
			//가격만큼 잔액 차감
			money -= pp.price;
			add();
		}
	}

	void add() {
		// 꽉 찬 배열 크기 변경
		if(cart.length <= i) {
			// 현재의 배열보다 길이가 2배인 p1 배열 생성
			Product[] p1 = new Product[cart.length*2];
			// 배열 복사
			System.arraycopy(cart, 0, p1, 0, cart.length);
			// p1의 주솟값을 cart에 넣기
			cart = p1;
		}
	}
	
	void summary() {
		StringBuffer sb = new StringBuffer(cart.length);
		System.out.println("카트의 길이:"+cart.length);
		System.out.print("구입한 물건:");
		for(Product p : cart) {
			if(p==null) break;
			sb.append(p);
			sb.append(",");
		}
		System.out.println(sb);
		System.out.println("사용한 금액:"+(PreMoney-money));
		System.out.println("남은 금액:"+money);
		
	}
	
	private boolean isMoney(int price) {
		if(money>price) {
			//살 수 있으면 true를 반환
			return true;
		}
		//살 수 없으면 false를 반환
		return false;
	}
	
}

class Product{
	int price; //제품의 가격
	
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