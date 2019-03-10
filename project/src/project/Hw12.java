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
		System.out.print("좌석구분 S(1),A(2),B(3) >> ");
		int a=sc.nextInt();
		boolean flag=true;
		
		if(a==1) {
			System.out.print("S>> ");
			printArray(S);
			if(countS==MAX_NUM) {
				System.out.println("예약이 다 찼습니다.");
				flag=false;
			}
		}
		else if(a==2) {
			System.out.print("A>> ");
			printArray(A);
			if(countA==MAX_NUM) {
				System.out.println("예약이 다 찼습니다.");
				flag=false;
			}
			
		}
		else if(a==3){
			System.out.print("B>> ");
			printArray(B);
			if(countB==MAX_NUM) {
				System.out.println("예약이 다 찼습니다.");
				flag=false;
			}
		}
		else {
			System.out.println("잘못된 번호 입니다.");
			flag=false;
			}
		while(flag==true) {
			System.out.print("이름: ");
			String name=sc.next();
			System.out.print("번호: ");
			int num=sc.nextInt();
			
			if(0>num || num >10) {
				System.out.println("잘못된 번호 입니다.");
				continue;
			}
			
			if(a==1) {
				if(S[num-1]=="---") {
					S[num-1]=name;
					countS++;
					flag=false;
				}
				else {
					System.out.println("선택할 수 없는 좌석 입니다.");
				}
			}
			else if(a==2) {
				if(A[num-1]=="---") {
					A[num-1]=name;
					countA++;
					flag=false;
				}
				else {
					System.out.println("선택할 수 없는 좌석 입니다.");
				}
			}
			else {
				if(B[num-1]=="---") {
					B[num-1]=name;
					countB++;
					flag=false;
				}
				else {
					System.out.println("선택할 수 없는 좌석 입니다.");
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
		System.out.println("<<조회를 완료하였습니다.>>");
		
	}
	
	void cancel() {
		boolean flag=false;
		System.out.print("좌석구분 S(1),A(2),B(3) >> ");
		int a=sc.nextInt();
		
		if(a==1) {
			System.out.print("S>> ");
			printArray(S);
			if(countS==0) {
				System.out.println("예약한 사람이 없습니다.");
				flag=true;
			}
			if(flag==false) {
				System.out.print("이름: ");
				String name=sc.next();
				for(int i=0;i<10;i++) {
					if(S[i].equals(name)) {
						S[i]="---";
						flag=true;
						break;
					}
				}
				if(flag==false) System.out.println("없는 이름 입니다.");
			}
		}
		else if(a==2) {
			System.out.print("A>> ");
			printArray(A);
			if(countA==0) {
				System.out.println("예약한 사람이 없습니다.");
				flag=true;
			}
			if (flag==false) {
				System.out.print("이름: ");
				String name=sc.next();
				for(int i=0;i<10;i++) {
					if(A[i].equals(name)) {
						A[i]="---";
						flag=true;
						break;
					}
				}
				if(flag==false) System.out.println("없는 이름 입니다.");
			}
		}
		else {
			System.out.print("B>> ");
			printArray(B);
			if(countB==0) {
				System.out.println("예약한 사람이 없습니다.");
				flag=true;
			}
			if(flag==false) {
				System.out.print("이름: ");
				String name=sc.next();
				for(int i=0;i<10;i++) {
					if(B[i].equals(name)) {
						B[i]="---";
						flag=true;
						break;
					}
				}
				if(flag==false) System.out.println("없는 이름 입니다.");
			}
		}
		
	}
	
	void run() {
		while(true) {
		System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4) >> ");
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
				System.out.println("잘못된 번호 입니다.");
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
