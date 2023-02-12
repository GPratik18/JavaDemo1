public class MutableStringDemo1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Sachin");
		System.out.println(sb);
//		INVALID    StringBuffer sBuffer="fdshggshggoigh";
		sb.append(" Tendulkar");
		System.out.println(sb);
	}

}
