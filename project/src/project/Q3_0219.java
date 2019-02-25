package project;

import java.util.*;

class _BankApplication{
	private String ano,ana;
	int aas;
	Scanner sc=new Scanner(System.in);
	
	public _BankApplication() {}
	public _BankApplication(String ano,String ana,int aas) {
		this.ano=ano;
		this.ana=ana;
		this.aas=aas;
	}
	void accountProduction(ArrayList<_BankApplication> list) {
		String ano,ana;
		int aas;
		
		System.out.print("���¹�ȣ: ");
		ano=sc.next();
		System.out.print("������: ");
		ana=sc.next();
		System.out.print("�ʱ� �Աݾ�: ");
		aas=sc.nextInt();
		list.add(new _BankApplication(ano,ana,aas));
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
	}
	
	void accountList(ArrayList<_BankApplication> list) {
		for (_BankApplication s:list) {
			System.out.println(s.ano+"\t"+s.ana+"\t"+s.aas);
		}
	}
	
	void deposit(ArrayList<_BankApplication> list) {
		System.out.print("���¹�ȣ: ");
		String ano=sc.next();
		System.out.print("���ݾ�: ");
		int aas=sc.nextInt();
		for (_BankApplication s:list) {
			if(s.ano.equals(ano)) {
				s.aas=s.aas+aas;
				System.out.println("���: ������ �����Ǿ����ϴ�.");
			}
		}
	}
	
	void withdrawal(ArrayList<_BankApplication> list)throws AccountErrorException {
		System.out.print("���¹�ȣ: ");
		String ano=sc.next();
		System.out.print("��ݾ�: ");
		int aas=sc.nextInt();
		for (_BankApplication s:list) {
			if(s.ano.equals(ano)) {
				if(s.aas<aas) throw new AccountErrorException();
				else{
					s.aas=s.aas-aas; 				
					System.out.println("���: ����� �����Ǿ����ϴ�.");
				}
			}
				
		}
	}
	
}
class AccountErrorException extends Exception {}

public class Q3_0219 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_BankApplication bank= new _BankApplication();
		ArrayList<_BankApplication> list = new ArrayList<_BankApplication>();
		Scanner sc=new Scanner(System.in);
		int number;
		Boolean flag=true;
		while(flag) {
			System.out.println("---------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("---------------------------------");
			System.out.print("����> ");
			number=sc.nextInt();
		
			switch(number) {
			case 1:
				System.out.println("------");
				System.out.println("���»���");
				System.out.println("------");
				bank.accountProduction(list);
				break;
			case 2:
				System.out.println("------");
				System.out.println("���¸��");
				System.out.println("------");
				bank.accountList(list);
				break;
			case 3:
				System.out.println("------");
				System.out.println("����");
				System.out.println("------");
				bank.deposit(list);
				break;
			case 4:
				System.out.println("------");
				System.out.println("���");
				System.out.println("------");
				try{
					bank.withdrawal(list);
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println();
					System.out.println();
				}
				break;
			case 5:
				System.out.println("���α׷� ����");
				return;
			}
			
		}
	}

}
