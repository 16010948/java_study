package project;

import java.util.*;

public class Hw14 {
	
	Vector<String> v= new Vector<String>();
	
	WordGenerator th = new WordGenerator();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Hw14 hw=new Hw14();
		Vector v=hw.v;
		
		hw.th.start();
		
		while(true) {
			
			System.out.println(v);
			System.out.print(">>");
			String s=sc.nextLine();
			if(v.contains(s)) {
				v.remove(s);
			}
		}
	}
	
	class WordGenerator extends Thread{
		String [] data = {"�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī"};
		public void run() {
			
			while(true) {
				String word=data[(int) (Math.random()*9)];
				if(!v.contains(word)) v.addElement(word);
				try {
					Thread.sleep(2*1000);
				}catch(Exception e) {}
			}
		}
	}
}

