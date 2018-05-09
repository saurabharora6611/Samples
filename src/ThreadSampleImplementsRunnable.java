
/**
 * @author Saurabh
 *
 */
public class ThreadSampleImplementsRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread started");
	}
	
	public static void main(String args[]) {
	Thread newThread = new Thread(new ThreadSampleImplementsRunnable());
	newThread.start();
	}
}
