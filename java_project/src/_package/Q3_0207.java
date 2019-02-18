package _package;

import java.util.*;

public class Q3_0207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number=new int[6];
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),result,j;
		for(int i=1;i<=a;i++) {
			for(int k=0;k<6;k++) {
			result=(int)(Math.random()*45)+1;
			for(j=0;j<k;j++) {
				if(number[j]==result) break;
				}
			if(j==k) number[k]=result;
			else k--;
			}
			System.out.println(i+"¹øÂ°: ["+number[0]+","+number[1]+","+number[2]+","+number[3]+","+number[4]+","+number[5]+"]");
		}
	}

}
