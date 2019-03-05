package project;

import java.io.*;
import java.util.*;

public class Hw10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		ArrayList<String> list=new ArrayList<String>();
		Random random=new Random();
		
		try{
			br=new BufferedReader(new FileReader("word.txt"));
			String s=null;
			
			while((s=br.readLine())!=null) {
				list.add(s);
			}
			br.close();
			int a=random.nextInt(list.size());
			Scanner sc=new Scanner(System.in);
			System.out.print("난이도(1~5)>>");
			String word=list.get(a);
			
			int level=sc.nextInt();
			
			while(level>word.length()) {
				a=random.nextInt(list.size());
				word=list.get(a);
			}
			
			for(int i=0;i<level;i++) {
				int index=random.nextInt(list.get(a).length());
				if(word.charAt(index)!='_') {
					if(index==0) word='_'+word.substring(index+1,word.length());
					else if(index==word.length()-1) word=word.substring(0,index)+'_';
					else word=word.substring(0,index)+'_'+word.substring(index+1,word.length());
				}
				else {
					i--;
				}
			}
			
			System.out.println(word);
			int count=1;
			System.out.print(">>");
			String answer=sc.next();
			while(count<5) {
				if(list.get(a).equals(answer)) {
					System.out.print("정답");
					return;
				}
				else {
					System.out.print(">>");
					count++;
					answer=sc.next();
				}
			}
			System.out.print("정답은 "+list.get(a)+"입니다.");
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
		}

}
