public class MutableStringDemo3 {
	public static void main(String[] args) {
//		int a=10;
//		a=20;
//		System.out.println(a);
		final StringBuffer sb=new StringBuffer("Virat");
		sb.append("Kohli");
		System.out.println(sb);
		//sb=new StringBuffer("Sachin");  illegal
		System.out.println(sb);
	}
}
