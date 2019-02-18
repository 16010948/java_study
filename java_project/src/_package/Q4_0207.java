package _package;

import java.util.*;

class air{
	
	int temp=20;  //에어컨 온도 초기값
	Boolean power=false; //에어컨 전원 초기값
	void tempUp() {
		temp++;
		System.out.println("현재온도: "+temp);
		} // 온도가 +1되는 메소드
	void tempDown() {
		temp--;
		System.out.println("현재온도: "+temp);
	} //온도가 -1되는 메소드
	void power() {
		if(power==true) power=false;
		else power=true;
		System.out.println("전원이 종료되었습니다.");
		powerControl();
	} // power가 false인 상태였으면 ->true(전원on), true인 상태였으면 ->false(전원off)가 되는 메소드
	void powerControl(){
	System.out.println("전원 on-3");
	Scanner power_button = new Scanner(System.in);
	int power_control = power_button.nextInt();
	if(power_control==3) power=true;
	//입력값이 3일 때 전원이 켜짐
	}
}
	
public class Q4_0207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 air a=new air();
		a.powerControl();
		
		while(true) {
		System.out.println("온도 Up-1//온도 Down-2//전원 off-3");
		Scanner controller = new Scanner(System.in);
		int controller_number = controller.nextInt();
		if(controller_number==1) a.tempUp();
		else if(controller_number==2) a.tempDown();
		else a.power();
		}
	}

}
