package java_package;

import java.util.*;

class BankApplication{
	private String ano,ana;
	int aas;
	Scanner sc=new Scanner(System.in);
	
	public BankApplication() {}
	public BankApplication(String ano,String ana,int aas) {
		this.ano=ano;
		this.ana=ana;
		this.aas=aas;
	}
	void accountProduction(ArrayList<BankApplication> list) {
		String ano,ana;
		int aas;
		
		System.out.print("계좌번호: ");
		ano=sc.next();
		System.out.print("계좌주: ");
		ana=sc.next();
		System.out.print("초기 입금액: ");
		aas=sc.nextInt();
		list.add(new BankApplication(ano,ana,aas));
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	void accountList(ArrayList<BankApplication> list) {
		for (BankApplication s:list) {
			System.out.println(s.ano+"\t"+s.ana+"\t"+s.aas);
		}
	}
	
	void deposit(ArrayList<BankApplication> list) {
		System.out.print("계좌번호: ");
		String ano=sc.next();
		System.out.print("예금액: ");
		int aas=sc.nextInt();
		for (BankApplication s:list) {
			if(s.ano.equals(ano)) {
				s.aas=s.aas+aas;
				System.out.println("결과: 예금이 성공되었습니다.");
			}
		}
	}
	
	void withdrawal(ArrayList<BankApplication> list) {
		System.out.print("계좌번호: ");
		String ano=sc.next();
		System.out.print("출금액: ");
		int aas=sc.nextInt();
		for (BankApplication s:list) {
			if(s.ano.equals(ano)) {
				s.aas=s.aas-aas; 
				System.out.println("결과: 출금이 성공되었습니다.");
			}
				
		}
	}
	
}


public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankApplication bank= new BankApplication();
		ArrayList<BankApplication> list = new ArrayList<BankApplication>();
		Scanner sc=new Scanner(System.in);
		int number;
		Boolean flag=true;
		while(flag) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			number=sc.nextInt();
		
			switch(number) {
			case 1:
				System.out.println("------");
				System.out.println("계좌생성");
				System.out.println("------");
				bank.accountProduction(list);
				break;
			case 2:
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				bank.accountList(list);
				break;
			case 3:
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				bank.deposit(list);
				break;
			case 4:
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");
				bank.withdrawal(list);
				break;
			case 5:
				System.out.println("프로그램 종료");
				return;
			}
			
		}
	}

}
