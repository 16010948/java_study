package _package;

import java.util.*;

interface Stack {
	int length();
	Object pop();
	boolean push(Object ob);
}

class StringStack implements Stack{
	String stack;
	
	public int length() {
		return stack.length();
	}
	public Object pop() {
		return stack;
	}
	public boolean push(Object ob) {
		String str=ob.toString();
		StringBuffer s=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {
			s.append(str.charAt(i));
		}
		stack=new String(s);
		if(stack.length()==str.length()) return true;
		else return false;
	}
}

public class Hw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringStack s=new StringStack();
		Scanner sc=new Scanner(System.in);
		String stack=sc.next();
		s.push(stack);
		System.out.println(s.pop());
	}

}
