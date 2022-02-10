
public class JavaTest85 {

	public static void main(String[] args) {
		DanceRobot d = new DanceRobot();
		SingRobot s = new SingRobot();
		Robot r = new DrawRobot(); //������ �̿�
		DrawRobot r1 = new DrawChild(); //������ �̿�
		
		//instanceof�� �´� �� �˻��ؼ� ���
		action(d);
		action(s);
		action(r); 
		action(r1); //�ڽ� draw()�� �ִ� ���� ���
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
		System.out.println("���� ��ϴ� .");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�� �մϴ� .");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ� .");
	}
}

// �ڽ� Ŭ���� �ϳ��� �� ���� draw() �������̵�
class DrawChild extends DrawRobot{
	void draw() {
		System.out.println("�۰� �׸��� �׸��ϴ�.");
	}
}