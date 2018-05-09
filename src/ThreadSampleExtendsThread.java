
/**
 * @author Saurabh
 *
 */
public class ThreadSampleExtendsThread extends Thread{

	@Override
	public void run() {
		System.out.println("Thread started");
	}
	
	public static void main(String args[]) {
	Thread newThread = new ThreadSampleExtendsThread();
	newThread.start();
	}
}
