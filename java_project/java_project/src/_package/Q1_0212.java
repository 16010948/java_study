package _package;

import java.util.*;

public class Q1_0212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(Character c : s.toCharArray()) {
			if ('0'<=c && c<='9') {
				System.out.print(c);
			}
		}
	}

}

/*
import java.util.Scanner;
public class Q1_0212 {
    public static void main(String[]args){
        System.out.println("ют╥б");
        Scanner input= new Scanner(System.in);
        String input_string=input.nextLine();
        String clean1 = input_string.replaceAll("[^0-9]", "");
        System.out.println(clean1);
    }
}
*/
