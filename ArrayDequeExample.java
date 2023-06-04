import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeExample {
	public static void main(String [] asrs) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(100);
		ad.add(100);
		ad.add(100);
		ad.add("Windows");
		ad.add("Linux");
		ad.add("Unix");
		ad.add("Android");
		System.out.println(ad);
		ad.addFirst(1);
		ad.addLast("Services");
		
		System.out.println(ad);
		ad.offer(26);
		ad.offer(27);
		ad.offerFirst(27);
		ad.offerLast(81);
		Iterator itr= ad.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}
}
