
public class JavaTest85 {

	public static void main(String[] args) {
		DanceRobot d = new DanceRobot();
		SingRobot s = new SingRobot();
		Robot r = new DrawRobot(); //다형성 이용
		DrawRobot r1 = new DrawChild(); //다형성 이용
		
		//instanceof로 맞는 거 검사해서 출력
		action(d);
		action(s);
		action(r); 
		action(r1); //자식 draw()에 있는 값이 출력
	}
	
	static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot d = (DanceRobot)r;
			d.dance();
		}
		
		if(r instanceof SingRobot) {
			SingRobot d = (SingRobot)r;
			d.sing();
		}
		
		if(r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
	
	}
}

class Robot {

}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다 .");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다 .");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다 .");
	}
}

// 자식 클래스 하나를 더 만들어서 draw() 오버라이딩
class DrawChild extends DrawRobot{
	void draw() {
		System.out.println("작게 그림을 그립니다.");
	}
}