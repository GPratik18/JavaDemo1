import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String [] args) {
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(21);
		ts.add(22);
		ts.add(23);
		ts.add(24);
		ts.add(11);
		ts.add(12);
		ts.add(90);
		ts.add(1);
		ts.add(2);
		System.out.println(ts);
		System.out.println(ts.higher(10));
		System.out.println(ts.lower(10));
		System.out.println(ts.ceiling(10));
		System.out.println(ts.floor(10));
	}
}
