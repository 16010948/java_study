package project;

import java.util.*;

public class Hw6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		int count;
		System.out.println("히스토그램을 그립니다.");
		for(char i='A';i<='Z';i++) {
			System.out.print(i);
			for(int j=0;j<string.length();j++) {
				if(string.toUpperCase().charAt(j)==i) System.out.print("-");
			}
			System.out.println();
		}
		sc.close();
	}

}
