public class MutableStringDemo4 {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());
		s1.append("abcdefghijklmnop");
		System.out.println(s1.capacity());
		s1.append("q");
		System.out.println(s1.capacity());
		
		StringBuilder s2=new StringBuilder("Ajay");
		System.out.println(s2.capacity());
	}

}
