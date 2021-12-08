// Create three threads- with different priorities – MAX, MIN, NORM- and start the threads at the same time. 
// Observe the completion of the threads. (Thread priorities concept) .

package multithreading;
public class Priorities implements Runnable 
{
	public static void main(String[] args) 
    {
		Priorities obj = new Priorities();
		Thread t1 = new Thread(obj, "Thread1");
		Thread t2 = new Thread(obj, "Thread2");
		Thread t3 = new Thread(obj, "Thread3");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println(Thread.currentThread().getName() + ": " + i);		
	}
}
