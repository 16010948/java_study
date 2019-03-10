package project;

import java.util.*;

class Concert{
	Scanner sc=new Scanner(System.in);
	String[] S= {"---","---","---","---","---","---","---","---","---","---"};
	String[] A= {"---","---","---","---","---","---","---","---","---","---"};
	String[] B= {"---","---","---","---","---","---","---","---","---","---"};
	
	int countS=0;
	int countA=0;
	int countB=0;
	final int MAX_NUM=10;
	
	void printArray(String[] arr) {
		for(String s:arr) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
 	void reservation() {
		System.out.print("�¼����� S(1),A(2),B(3) >> ");
		int a=sc.nextInt();
		boolean flag=true;
		
		if(a==1) {
			System.out.print("S>> ");
			printArray(S);
			if(countS==MAX_NUM) {
				System.out.println("������ �� á���ϴ�.");
				flag=false;
			}
		}
		else if(a==2) {
			System.out.print("A>> ");
			printArray(A);
			if(countA==MAX_NUM) {
				System.out.println("������ �� á���ϴ�.");
				flag=false;
			}
			
		}
		else if(a==3){
			System.out.print("B>> ");
			printArray(B);
			if(countB==MAX_NUM) {
				System.out.println("������ �� á���ϴ�.");
				flag=false;
			}
		}
		else {
			System.out.println("�߸��� ��ȣ �Դϴ�.");
			flag=false;
			}
		while(flag==true) {
			System.out.print("�̸�: ");
			String name=sc.next();
			System.out.print("��ȣ: ");
			int num=sc.nextInt();
			
			if(0>num || num >10) {
				System.out.println("�߸��� ��ȣ �Դϴ�.");
				continue;
			}
			
			if(a==1) {
				if(S[num-1]=="---") {
					S[num-1]=name;
					countS++;
					flag=false;
				}
				else {
					System.out.println("������ �� ���� �¼� �Դϴ�.");
				}
			}
			else if(a==2) {
				if(A[num-1]=="---") {
					A[num-1]=name;
					countA++;
					flag=false;
				}
				else {
					System.out.println("������ �� ���� �¼� �Դϴ�.");
				}
			}
			else {
				if(B[num-1]=="---") {
					B[num-1]=name;
					countB++;
					flag=false;
				}
				else {
					System.out.println("������ �� ���� �¼� �Դϴ�.");
				}
			}
		}
	}
	
	void view() {
		System.out.print("S>> ");
		printArray(S);
		System.out.print("A>> ");
		printArray(A);
		System.out.print("B>> ");
		printArray(B);
		System.out.println("<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>");
		
	}
	
	void cancel() {
		boolean flag=false;
		System.out.print("�¼����� S(1),A(2),B(3) >> ");
		int a=sc.nextInt();
		
		if(a==1) {
			System.out.print("S>> ");
			printArray(S);
			if(countS==0) {
				System.out.println("������ ����� �����ϴ�.");
				flag=true;
			}
			if(flag==false) {
				System.out.print("�̸�: ");
				String name=sc.next();
				for(int i=0;i<10;i++) {
					if(S[i].equals(name)) {
						S[i]="---";
						flag=true;
						break;
					}
				}
				if(flag==false) System.out.println("���� �̸� �Դϴ�.");
			}
		}
		else if(a==2) {
			System.out.print("A>> ");
			printArray(A);
			if(countA==0) {
				System.out.println("������ ����� �����ϴ�.");
				flag=true;
			}
			if (flag==false) {
				System.out.print("�̸�: ");
				String name=sc.next();
				for(int i=0;i<10;i++) {
					if(A[i].equals(name)) {
						A[i]="---";
						flag=true;
						break;
					}
				}
				if(flag==false) System.out.println("���� �̸� �Դϴ�.");
			}
		}
		else {
			System.out.print("B>> ");
			printArray(B);
			if(countB==0) {
				System.out.println("������ ����� �����ϴ�.");
				flag=true;
			}
			if(flag==false) {
				System.out.print("�̸�: ");
				String name=sc.next();
				for(int i=0;i<10;i++) {
					if(B[i].equals(name)) {
						B[i]="---";
						flag=true;
						break;
					}
				}
				if(flag==false) System.out.println("���� �̸� �Դϴ�.");
			}
		}
		
	}
	
	void run() {
		while(true) {
		System.out.print("����(1), ��ȸ(2), ���(3), ������(4) >> ");
		int a=sc.nextInt();
			switch(a) {
			case 1:
				reservation();
				break;
			case 2:
				view();
				break;
			case 3:
				cancel();
				break;
			case 4:
				return;
			default:
				System.out.println("�߸��� ��ȣ �Դϴ�.");
			}
		}
	}
}

public class Hw12 {
	public static void main(String[] args) {
		Concert con=new Concert();
		con.run();
	}
}
