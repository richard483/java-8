
public class AscendingThread extends Thread{

	public AscendingThread() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		for(int i=1; i<11; i++) {
			System.out.println("Ascending: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
