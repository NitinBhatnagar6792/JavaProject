package courses.in28minutes.threads;

import java.util.concurrent.TimeUnit;

class MyThread implements Runnable {
	private final int threadNumber;
	
	public MyThread(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	public void run() {
		
		try {
			TimeUnit.SECONDS.sleep(1);
			System.out.println("job done for:"+threadNumber);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("exception for threadNumber:"+threadNumber);
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}
}

public class TestThread {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		Thread t1 = Thread.ofVirtual().start(new MyThread(1));
		Thread t2 = new Thread(new MyThread(10));
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("end");
		//testVirtualThread();
		//testPlatformThread();
	}	

	public static void testVirtualThread() {
		for (int i=1; i< 1_000_000; i++) {
			System.out.println("Starting virtual thread:"+i);
			Thread.startVirtualThread(new MyThread(i));
		}
	}	
	
	public static void testPlatformThread() {
		for (int i=1; i< 1_000_000; i++) {
			System.out.println("Starting platform thread:"+i);
			new Thread(new MyThread(i)).start();
		}
		
	}

}
