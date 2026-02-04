package concurrentPro;


public class Usethreads{

	public static void main(String []args) throws InterruptedException {
		
		DemoThreads t1=new DemoThreads();
		DemoThreads t2=new DemoThreads();
		
		t1.start();
		t2.start();
		//t2.sleep(10000);
		//t3.start();
		System.out.println("MultiThreads.main");
		System.out.println();
		t1.join();
		t2.join();
		System.out.println("main end here");

	}
}
