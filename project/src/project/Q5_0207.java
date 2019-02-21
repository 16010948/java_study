package project;

import java.util.*;

class Tv{
	Boolean power; //전원 
	int channel=10; //채널
	void power() {
		if(power==false) power=true;
		else power=false;
	} //power가 false인 상태였으면 ->true(전원on), true인 상태였으면 ->false(전원off)가 되는 메소드
	void channelUp() {
		channel++;
		System.out.println("채널은="+channel);
	} //채널 +1되는 메소드
	void channelDown() {
		channel--;
		System.out.println("채널은="+channel);
	}//채널 -1되는 메소드
}

class CaptionTv extends Tv{
	Boolean power;
	Boolean caption=false; //캡션(자막) 상태 on/off
	void displayCaption(String text){
		//caption 상태가 on(true)일 때 text를 출력한다.
		if(caption==true) {
			System.out.println("자막="+text);
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
		System.out.println("자막을 입력하시오");
		text=sc.next();
		tv.caption=true;
		tv.displayCaption(text);

	}

}
