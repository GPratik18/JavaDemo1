import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapExample1 {
	public static void main(String[] args) {
		HashMap h1 =new HashMap();
		h1.put(1, "Lokesh Rahul");
		h1.put(2, "Rohit Sharma");
		h1.put(3, "Virat Kohli");
		h1.put(4, "Shreyas Iyer");
		h1.put(5, "Hardik Pandya");
		h1.put(6, "Ravindra Jadeja");
		h1.put(7, "Axar Patel");
		h1.put(8, "Mohammad Shami");
		h1.put(9, "Mohammad Siraj");
		h1.put(10, "Shardul");
		h1.put(11, "Kuldip Yadav");
		h1.put(null, null);
		
		System.out.println(h1);
		
		Set s1= h1.keySet();
		Iterator itr1=s1.iterator();
		Integer integer;
		while(itr1.hasNext()) {
//			System.out.println(itr1.next());
			integer= (Integer)itr1.next();
			System.out.println(integer);
		}
		
		Collection c2= h1.values();
		Iterator itr2= c2.iterator();
		String string;
		while(itr2.hasNext()) {
//			System.out.println(itr2.next());
			string=(String)itr2.next();
			System.out.println(string);
		}
		
		Set s2=h1.entrySet();
		Iterator itr3 = s2.iterator();
		while(itr3.hasNext()) {
//			System.out.println(itr3.next());
			Map.Entry entry=(Entry)itr3.next();
			System.out.println(entry);
		}
	}
}
