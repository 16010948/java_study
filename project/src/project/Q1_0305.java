package project;

import java.util.*;

public class Q1_0305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		Calendar cal1=Calendar.getInstance();
		Calendar cal2=Calendar.getInstance();
		char[] d= {'��','��','ȭ','��','��','��','��'};
		String string;
		
		System.out.print("��¥�Է�(1900-01-01)>>");
		
		string=sc.next();
		
		String[] day=string.split("-");
		int year1=Integer.parseInt(day[0]);
		int	month1=Integer.parseInt(day[1])-1;
		int date1=Integer.parseInt(day[2]);
		
		cal1.set(year1, month1, date1);
		
		if(cal1.getTimeInMillis()<=cal2.getTimeInMillis()) {
long a=(cal2.getTimeInMillis()-cal1.getTimeInMillis())/1000;
			
			System.out.println("�������� "+d[cal1.get(Calendar.DAY_OF_WEEK)-1]+"���� �̸� ������ �����Ϻ��� "+a/(24*60*60)+"�� �������ϴ�.");
			
		}
		else {
			long a=(cal1.getTimeInMillis()-cal2.getTimeInMillis())/1000;
			System.out.println("�������� "+d[cal1.get(Calendar.DAY_OF_WEEK)-1]+"���� �̸� ������ �����Ϻ��� "+(a+1)/(24*60*60)+"�� ���ҽ��ϴ�.");
		}

	}
	

}
