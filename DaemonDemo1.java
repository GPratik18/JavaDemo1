class DaemonThread1 extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName()+" is Daemon thread");
		}
		else {
			System.out.println(Thread.currentThread().getName()+" is User thread");
		}
	}
}
public class DaemonDemo1 {

	public static void main(String[] args) {
		DaemonThread1 d1=new DaemonThread1();
		DaemonThread1 d2=new DaemonThread1();
		DaemonThread1 d3=new DaemonThread1();
		DaemonThread1 d4=new DaemonThread1();
		DaemonThread1 d5=new DaemonThread1();
		
		d1.setDaemon(true);
		d2.setDaemon(false);
		d3.setDaemon(true);
		d4.setDaemon(false);
		d5.setDaemon(true);
		
//		d1.setPriority(10);
//		d1.setPriority(9);
//		d1.setPriority(8);
//		d1.setPriority(7);
//		d1.setPriority(6);
				
		d1.setName("Thread 1");
		d2.setName("Thread 2");
		d3.setName("Thread 3");
		d4.setName("Thread 4");
		d5.setName("Thread 5");
		
		System.out.println(Thread.currentThread().getName());
		
		d1.start();
		d2.start();
		d3.start();
		d4.start();
		d5.start();
	}
}
