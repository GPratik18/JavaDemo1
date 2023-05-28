class MyThread2 implements Runnable{
	public void run() {
		System.out.println("My thread is running");
		Thread thread= new Thread(this);
		for(int i=0;i<10;i++) {
			System.out.println("Priority is "+thread.getPriority());
		}
	}
}
public class ThreadCreationDemo2 {
	public static void main(String[] args) {
		System.out.println("Main thread");
		MyThread2 t2= new MyThread2();
		Thread thread2=new Thread(t2);
		Thread thread= new Thread(Thread.currentThread());
		thread2.setName("Second thread");
		thread2.setPriority(10);
		thread2.start();
		for(int i=0;i<10;i++) {
			System.out.println("Priority is "+thread.getPriority());
		}
	}
}