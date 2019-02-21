package project;

import java.util.*;

public class Q1_0212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String string=sc.next();
		for(int i=0;i<string.length();i++) {
			if('0'<=string.charAt(i) && string.charAt(i)<='9') System.out.println(string.charAt(i));
		}
	}

}

/*import java.util.Scanner;
	public class Q1_0212 {
		public static void main(String[]args){
    		System.out.println("ют╥б");
    		Scanner input= new Scanner(System.in);
    		String input_string=input.nextLine();
    		String clean1 = input_string.replaceAll("[^0-9]", "");
    		System.out.println(clean1);
	}
}*/