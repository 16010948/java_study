package project;

import java.util.Scanner;

class members{
	String name;
	
	public members(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
}

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int a=sc.nextInt();
		String str1="아버지",str2;
		String name;
		members[] member = new members[a];
		boolean flag=true;
		
		for(int i=0;i<a;i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			name=sc.next();
			member[i]=new members(name);
		}
		
		System.out.println("시작하는 단어는 아버지입니다.");
		
		while(flag) {
			for(int i=0;i<a;i++) {
				System.out.print(member[i].name+">>");
				str2=sc.next();
				if(str1.charAt(str1.length()-1)!=str2.charAt(0)) {
					flag=false;
					System.out.println(member[i].name+"이 졌습니다.");
					sc.close();
					break;
				}
				else str1=str2;
			}
		}
	}

}
