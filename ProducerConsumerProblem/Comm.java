package ProducerConsumerProblem;

public class Comm {
	int x;
	boolean flag=false;
	synchronized public void put(int j) {
		try {
			if(flag==true) {
				wait();
			}
			else {
				x=j;
				Thread.sleep(1000);
				System.out.println("+" + x);
				flag=true;
				notify();
			}
		}
		catch(Exception e) {
			System.out.println("Some problem occurred");
		}
		
	}
	synchronized public void get() {
		try {
			if(flag==false) {
				wait();
			}
			else {
				Thread.sleep(500);
				System.out.println("-"+ x);
				flag=false;
				notify();
			}
		}catch(Exception e) {
			System.out.println("Some problem occurred");
		}
	}
}
