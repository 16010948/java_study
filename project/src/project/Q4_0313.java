package project;

class Thread3 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}

public class Q4_0313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th=new Thread(new Thread3());
		
		th.setDaemon(true);
		
		th.start();
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("종료합니다.");
	}

}
