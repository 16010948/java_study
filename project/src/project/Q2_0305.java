package project;

import java.io.*;
import java.util.*;

public class Q2_0305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
			br=new BufferedReader(new FileReader("data.txt"));
			pw=new PrintWriter(new FileWriter("answer.txt"));
			ArrayList<String> list=new ArrayList<String>();
			
			String str=null;
			System.out.println("<�������� ���� ��>");
			while((str=br.readLine())!=null) {
				list.add(str);
				System.out.println(str);
			}
			br.close();
			Collections.sort(list);
			Iterator<String> iter=list.iterator();
			System.out.println("\n<�������� ���� ��>");
			while(iter.hasNext()) {
				str=iter.next();
				System.out.println(str);
				pw.println(str);
			}
			pw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
