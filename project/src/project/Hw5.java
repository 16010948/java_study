package project;

import java.util.*;

class Location{
	float latitude;
	float longutude;
}

public class Hw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Location> map=new HashMap<String,Location>();	
		Scanner sc=new Scanner(System.in);
		String s;
		Location l=new Location();
		for(int i=0;i<3;i++) {
			System.out.print("���� �Է�>>");
			s=sc.next();
			System.out.print("���� �Է�>>");
			l.latitude=sc.nextFloat();
			System.out.print("�浵 �Է�>>");
			l.longutude=sc.nextFloat();
			map.put(s, l);
			}
		System.out.print("���� �˻�>>");
		s=sc.next();
		Location location=map.get(s);
		System.out.println(location.latitude+","+location.longutude);
		sc.close();
	}
}
