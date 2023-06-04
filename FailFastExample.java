import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastExample {
	public static void main(String []args){
//		ArrayList ls=new ArrayList();
//		ls.add(10);
//		ls.add(20);
//		ls.add(30);
//		ls.add(40);
//		ls.add(50);
//		
//		Iterator itr=ls.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			ls.add(20);
//		}
		
		CopyOnWriteArrayList l=new CopyOnWriteArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		Iterator itr1=l.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			l.add(20);
		}
	}
}
