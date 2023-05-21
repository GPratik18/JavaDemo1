class Car implements Runnable{
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" entered in parking ");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" found the car ");
			Thread.sleep(2000);
			synchronized (this) {
				System.out.println(Thread.currentThread().getName()+" driving the car ");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+" car parked to the parking ");
				Thread.sleep(2000);		
			}
			
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}
}
public class SyncDemo1 {
	public static void main(String[] args) {
		Car car=new Car();
		
		Thread t1=new Thread(car);
		Thread t2=new Thread(car);
		Thread t3=new Thread(car);
		
		t1.setName("Vaibhav");
		t2.setName("Sanket");
		t3.setName("Rani");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
