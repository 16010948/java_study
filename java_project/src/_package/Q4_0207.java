package _package;

import java.util.*;

class air{
	
	int temp=20;  //������ �µ� �ʱⰪ
	Boolean power=false; //������ ���� �ʱⰪ
	void tempUp() {
		temp++;
		System.out.println("����µ�: "+temp);
		} // �µ��� +1�Ǵ� �޼ҵ�
	void tempDown() {
		temp--;
		System.out.println("����µ�: "+temp);
	} //�µ��� -1�Ǵ� �޼ҵ�
	void power() {
		if(power==true) power=false;
		else power=true;
		System.out.println("������ ����Ǿ����ϴ�.");
		powerControl();
	} // power�� false�� ���¿����� ->true(����on), true�� ���¿����� ->false(����off)�� �Ǵ� �޼ҵ�
	void powerControl(){
	System.out.println("���� on-3");
	Scanner power_button = new Scanner(System.in);
	int power_control = power_button.nextInt();
	if(power_control==3) power=true;
	//�Է°��� 3�� �� ������ ����
	}
}
	
public class Q4_0207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 air a=new air();
		a.powerControl();
		
		while(true) {
		System.out.println("�µ� Up-1//�µ� Down-2//���� off-3");
		Scanner controller = new Scanner(System.in);
		int controller_number = controller.nextInt();
		if(controller_number==1) a.tempUp();
		else if(controller_number==2) a.tempDown();
		else a.power();
		}
	}

}
