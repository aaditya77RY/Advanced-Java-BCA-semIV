package concurrentPro;

public class DemoThreads extends Thread {

	public void run() {
		System.out.println("DemoThreads.run");
		System.out.println(Thread.currentThread().getName()+" running ");
	}
	
}
