import java.util.ArrayList;

public class Main {
	
	// java generics
	
	
	// multi threading:
	// thread inheritance
	// dipakai kalau class yang menimplementasikan thread tidak perlu meng intherit class lain
	
	// runnable interface
	// dipakai kalau class yang menimplementasikan thread perlu meng intherit class lain
	
	// thread ada 2 macam:
	// user thread -> thread yang perlu di buat dan perlu kita manage sendiri
	// daemon thread -> thread yg berjalan di belakang layar / low priority thread
	// program ga bakal tunggu daemon thread untuk berjalan sampai selesai
	// tapi kalau minimal ada 1 user thread yang masih berjalan, daemon thread bakal terus berjalan
	
	ArrayList<String> listOfName = new ArrayList<String>();
	
	public Main() {
//		IntegerPrint integerPrint = new IntegerPrint(21);
//		DoublePrint doublePrint = new DoublePrint(21.5);
		
//		GenericPrint<Integer> integerPrint = new GenericPrint<Integer>(20);
//		GenericPrint<Double> doublePrint = new GenericPrint<Double>(20.5);
//		
//		integerPrint.print();
//		doublePrint.print();
//		
//		integerPrint.showType();
//		doublePrint.showType();
		
//		GenericPrint<Integer, Double> genericPrint = new GenericPrint<Integer, Double>(2, 2.5);
//		
//		System.out.println(genericPrint.times());
		
//		GenericPrint<Integer> integerPrint = new GenericPrint<Integer>(6);
//		GenericPrint<Double> doublePrint = new GenericPrint<Double>(-6.0);
//		
//		System.out.println(integerPrint.absolutelyEquals(doublePrint));
		
		AscendingThread ascendingThread = new AscendingThread();
		
		DescendingRunnable descendingRunnable = new DescendingRunnable();
		Thread descendingThread = new Thread(descendingRunnable);
		
		descendingThread.setDaemon(true);
		ascendingThread.start();
		try {
			ascendingThread.join(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		descendingThread.start();
		
		System.out.println("Hello from Main thread!");
//		System.out.println(1/0);

		
	}

	public static void main(String[] args) {
		new Main();

	}

}
