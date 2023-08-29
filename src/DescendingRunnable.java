
public class DescendingRunnable implements Runnable{

	public DescendingRunnable() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println("Descending: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
