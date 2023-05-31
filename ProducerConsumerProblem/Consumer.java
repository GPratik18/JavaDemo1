package ProducerConsumerProblem;

public class Consumer extends Thread{
	Comm comm;
	public Consumer(Comm c) {
		comm=c;
	}
	public void run() {
		while(true) {
			comm.get();
		}
	}
}
