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
		
		System.out.print("���¹�ȣ: ");
		ano=sc.next();
		System.out.print("������: ");
		ana=sc.next();
		System.out.print("�ʱ� �Աݾ�: ");
		aas=sc.nextInt();
		list.add(new BankApplication(ano,ana,aas));
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
	}
	
	void accountList(ArrayList<BankApplication> list) {
		for (BankApplication s:list) {
			System.out.println(s.ano+"\t"+s.ana+"\t"+s.aas);
		}
	}
	
	void deposit(ArrayList<BankApplication> list) {
		System.out.print("���¹�ȣ: ");
		String ano=sc.next();
		System.out.print("���ݾ�: ");
		int aas=sc.nextInt();
		for (BankApplication s:list) {
			if(s.ano.equals(ano)) {
				s.aas=s.aas+aas;
				System.out.println("���: ������ �����Ǿ����ϴ�.");
			}
		}
	}
	
	void withdrawal(ArrayList<BankApplication> list) {
		System.out.print("���¹�ȣ: ");
		String ano=sc.next();
		System.out.print("��ݾ�: ");
		int aas=sc.nextInt();
		for (BankApplication s:list) {
			if(s.ano.equals(ano)) {
				s.aas=s.aas-aas; 
				System.out.println("���: ����� �����Ǿ����ϴ�.");
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
				bank.withdrawal(list);
				break;
			case 5:
				System.out.println("���α׷� ����");
				return;
			}
			
		}
	}

}
