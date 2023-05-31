package ProducerConsumerProblem;

public class Producer extends Thread{
	Comm comm=new Comm();
	public Producer(Comm c){
		comm=c;
	}
	public void run() {
		int i=1;
		while(true) {
			comm.put(i++);
		}	
	}
}
