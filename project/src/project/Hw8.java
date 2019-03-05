package project;

import java.util.*;

public class Hw8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Vector vec=new Vector();
		
		for(int i=0;i<10;i++) {
			float f=sc.nextFloat();
			vec.add(f);
		}
		
		Collections.sort(vec);
		
		System.out.println(vec.lastElement());
	}

}
