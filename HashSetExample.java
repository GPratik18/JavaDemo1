import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
	public static void main(String []args) {
		HashSet hs = new HashSet();
		hs.add("as");
		for(int i=0;i<26;i++) {
			hs.add((char)(i+65));
		}
		System.out.println(hs);
		
		LinkedHashSet h1=new LinkedHashSet();
		h1.add("as");
		for(int i=0;i<26;i++) {
			h1.add((char)(i+65));
		}
		System.out.println(h1);
	}
}
