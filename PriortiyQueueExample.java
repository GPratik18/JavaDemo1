import java.util.PriorityQueue;

public class PriortiyQueueExample {
	public static void main(String args[]) {
		PriorityQueue pq= new PriorityQueue();
		pq.add(10);
		pq.add(30);
		pq.add(20);
		pq.add(50);
		System.out.println(pq);
		pq.poll();
		pq.poll();
		pq.poll();
		
		System.out.println(pq);
		
	}
}
