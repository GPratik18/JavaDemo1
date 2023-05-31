package ProducerConsumerProblem;

public class Main {
	public static void main(String args[]) {
		Comm comm=new Comm();
		Producer p = new Producer(comm);
		Consumer c = new Consumer(comm);
		
		p.start();
		c.start();
	}
}
