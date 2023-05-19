public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Current thread : "+Thread.currentThread().getName());
		System.out.println("Current thread's priority : "+Thread.currentThread().getPriority());
		System.out.println("Current thread's state : "+Thread.currentThread().getState());
		System.out.println();
		Thread thread= Thread.currentThread();
		thread.setName("New Thread");
		thread.setPriority(3);
		System.out.println("Current thread : "+Thread.currentThread().getName());
		System.out.println("Current thread's priority : "+Thread.currentThread().getPriority());
		System.out.println("Current thread's state : "+Thread.currentThread().getState());
	}

}
