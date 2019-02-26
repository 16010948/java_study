package project;

import java.util.*;


class Student implements Comparable<Student>{
	String name;
	int kor,eng,math;
	int total;
	
	public Student(String name,int kor, int eng, int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.total=kor+eng+math;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTotal() {
		return total;
	}
	
	public int compareTo(Student s) {
		if(s.total>this.total) return 1;
		else if(s.total<this.total) return-1;
		else return 0;
	}
	
}

public class Q5_0226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students=new ArrayList<Student>();
		
		Student stduent1=new Student("가",10,20,30);
		Student stduent2=new Student("나",50,60,70);
		Student stduent3=new Student("다",20,30,40);
		Student stduent4=new Student("라",70,80,90);
		Student stduent5=new Student("마",30,40,50);
		
		students.add(stduent1);
		students.add(stduent2);
		students.add(stduent3);
		students.add(stduent4);
		students.add(stduent5);
		
		Collections.sort(students);
		
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i).getName()+":"+students.get(i).getTotal());
		}
	}

}
