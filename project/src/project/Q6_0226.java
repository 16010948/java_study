package project;

import java.util.*;

public class Q6_0226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList list=new ArrayList();
		
		list1.add(1); list2.add(3);
		list1.add(2); list2.add(4);
		list1.add(3); list2.add(5);
		list1.add(4); list2.add(6);
		
		list.addAll(list1);
		list.retainAll(list2);
		System.out.println("합집합"+list);
		/*list.addAll(list1);
		list.retainAll(list2);
		System.out.println("차집합"+list);
		list.addAll(list1);
		list.retainAll(list2);
		System.out.println("교집합"+list1);*/
	}

}
