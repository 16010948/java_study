package project;

import java.io.*;

public class Hw11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("a.jpg");
		try {
			FileInputStream fis=new FileInputStream(file);
			
			File dfile=new File("b.jpg");
			
			FileOutputStream fos=new FileOutputStream(dfile);
			
			byte[] b=new byte[(int)file.length()];
			int start=0,end=(int)file.length()/10;
			int count=10;
			while(start+end!=(int)file.length()) {
				fis.read(b, start,end);
				System.out.print("*");
				fos.write(b,start,end);
				start+=end;
				if(start+end>(int)file.length()) {
					end=(int)file.length()-start;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
