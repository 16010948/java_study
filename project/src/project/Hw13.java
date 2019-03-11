package project;

public class Hw13 {
	
	static boolean stopped=false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread th1=new Thread5();
		
		th1.start();
		
		try {
			Thread.sleep(6*1000);
		}catch(Exception e) {}
		stopped=true;
		th1.interrupt();//sleep »óÅÂ¸¦ ±ú¿ò.
		System.out.println("stopped");
	}

}

class Thread5 extends Thread{
	public void run() {
		for(int i=0; !Hw13.stopped;i++) {
			System.out.println(i);
			if(Thread.interrupted()) {
				break;
			}
			try {
				Thread.sleep(3*1000);
			}catch(Exception e) {}
		}
	}
}