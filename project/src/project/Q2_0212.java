package project;

import java.util.*;

public class Q2_0212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int j=0,sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(j)==s.charAt(i)) {
				sum++;
			}
			else {
				System.out.print(s.charAt(j)+""+sum);
				j=i;
				sum=1;
				}
			if(i==s.length()-1)System.out.print(s.charAt(j)+""+sum);
			}
	}

}