class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Mythread run method");
	}
}


public class Demo2 {
	public static void main(String[] args) {
		System.out.println("Main thread");
		MyThread thread=new MyThread();
		thread.start();
	}
}
