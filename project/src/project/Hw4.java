package project;

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
		String string=ob.toString();
		StringBuffer s=new StringBuffer();
		for(int i = string.length() - 1; i >= 0; i--) {
	        s.append(string.charAt(i));
	    }
		stack=s.toString();
		if(string.length()==stack.length()) return true;
		else return false;
	}
}

public class Hw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringStack s=new StringStack();
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		s.push(string);
		System.out.println(s.pop());
	}

}
