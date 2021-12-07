// Create two threads, one thread to display all even numbers between 1 & 20, another to display odd numbers between 1 & 20.
// Note: Display all even numbers followed by odd numbers .
// Hint: use join.  (use of join method and thread control mechanism) .

package multithreading;
public class EvenOdd implements Runnable 
{
	static Thread oddThread;
	static Thread evenThread;
	public static void main(String[] args) {
		EvenOdd obj = new EvenOdd();
		oddThread = new Thread(obj, "OddThread");
		evenThread = new Thread(obj, "EvenThread");
		oddThread.start();
		evenThread.start();
	}

	@Override
	public void run() {
		try {
			if (Thread.currentThread().getName().equals("OddThread")) 
				evenThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 1; i <= 20; i++) {
			if (Thread.currentThread().getName().equals("EvenThread")) {
				if (i % 2 == 0) System.out.println(i);
			} 
			
			if (Thread.currentThread().getName().equals("OddThread")) {
				if (i % 2 == 1) System.out.println(i);
			}
		}
	}

}
