import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		for(int i=0;i<26;i++) {
			l1.add((char)('A'+i));
		}
		System.out.println(l1);
		System.out.println(l1.size());
		for(int i=0;i<l1.size();i++) {
			l1.poll();
		}
		System.out.println(l1);
		System.out.println(l1.get(3));
		System.out.println(l1.indexOf('T'));
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.pop());
		System.out.println(l1);
		l1.push("N");
		System.out.println(l1);
	}
}
