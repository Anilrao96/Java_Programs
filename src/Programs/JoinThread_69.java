package Programs;

public class JoinThread_69 extends Thread{

	public void run() {
		for(int i =1;i<=5;i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		JoinThread_69 t1 = new JoinThread_69();
		JoinThread_69 t2 = new JoinThread_69();
		JoinThread_69 t3 = new JoinThread_69();
		t1.start();
		
		try {
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
t2.start();
t3.start();
	}

}
