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
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int a=sc.nextInt();
		String str1="�ƹ���",str2;
		String name;
		members[] member = new members[a];
		boolean flag=true;
		
		for(int i=0;i<a;i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			name=sc.next();
			member[i]=new members(name);
		}
		
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		
		while(flag) {
			for(int i=0;i<a;i++) {
				System.out.print(member[i].name+">>");
				str2=sc.next();
				if(str1.charAt(str1.length()-1)!=str2.charAt(0)) {
					flag=false;
					System.out.println(member[i].name+"�� �����ϴ�.");
					sc.close();
					break;
				}
				else str1=str2;
			}
		}
	}

}
