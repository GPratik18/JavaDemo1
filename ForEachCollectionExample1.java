import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ForEachCollectionExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> a1= new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		a1.add(7);
		a1.add(8);
		a1.add(9);
		a1.add(0);
		a1.add(11);
		System.out.println(a1);
//		for (Object o: a1) {
//			System.out.println(o);
//		}
		
//		Consumer<Integer> consumer=new Consumer<Integer>() {
//			@Override
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		};
//		a1.forEach(consumer);
		
		a1.forEach(n-> System.out.println(n));
	}

}
