package project;

import java.util.*;

class Tv{
	Boolean power; //���� 
	int channel=10; //ä��
	void power() {
		if(power==false) power=true;
		else power=false;
	} //power�� false�� ���¿����� ->true(����on), true�� ���¿����� ->false(����off)�� �Ǵ� �޼ҵ�
	void channelUp() {
		channel++;
		System.out.println("ä����="+channel);
	} //ä�� +1�Ǵ� �޼ҵ�
	void channelDown() {
		channel--;
		System.out.println("ä����="+channel);
	}//ä�� -1�Ǵ� �޼ҵ�
}

class CaptionTv extends Tv{
	Boolean power;
	Boolean caption=false; //ĸ��(�ڸ�) ���� on/off
	void displayCaption(String text){
		//caption ���°� on(true)�� �� text�� ����Ѵ�.
		if(caption==true) {
			System.out.println("�ڸ�="+text);
		}
	}
}


public class Q5_0207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String text;
		CaptionTv tv=new CaptionTv();
		tv.channelUp();
		System.out.println("�ڸ��� �Է��Ͻÿ�");
		text=sc.next();
		tv.caption=true;
		tv.displayCaption(text);

	}

}
