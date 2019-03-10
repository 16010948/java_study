package project;

import java.io.*;
import java.util.*;

public class Hw10 {
	
	public static String string(char[] arr) {
		String s=new String();
		for(int i=0;i<arr.length;i++) {
			s=s+arr[i];
		}

		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		ArrayList<String> list=new ArrayList<String>();
		char[] hidden;
		Random random=new Random();
		
		try{
			br=new BufferedReader(new FileReader("word.txt"));
			String s=null;
			
			while((s=br.readLine())!=null) {
				list.add(s);
			}
			br.close();
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
		int a=random.nextInt(list.size());
		Scanner sc=new Scanner(System.in);
		System.out.print("난이도(1~5)>>");
		char[] word;
		int level=sc.nextInt();
		hidden=new char[level];
		
		while(level>list.get(a).length()) a=random.nextInt(list.size());
		word=new char[list.get(a).length()];
		for(int i=0;i<list.get(a).length();i++) {
			word[i]=list.get(a).charAt(i);
		}

		for(int i=0;i<level;i++) {
			int index=random.nextInt(word.length);
			if(word[index]!='_') {
				hidden[i]=word[i];
				word[i]='_';
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
			if(string(hidden).contains(answer)) {
				for(int i=0;i<list.get(a).length();i++) {
					if(list.get(a).charAt(i)==answer.charAt(0)) word[i]=answer.charAt(0); 
				}
			}
			if(string(word).equals(list.get(a))) {
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
	}
}
