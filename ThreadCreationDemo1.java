class MyThread1 extends Thread{
	public void run() {
		System.out.println("My thread is running ");
	}
}
public class ThreadCreationDemo1 {
	public static void main(String[] args) {
		MyThread1 thread1=new MyThread1();
		thread1.setName("First thread");
		thread1.start();
		System.out.println("Main thread is running ");
	}
}
