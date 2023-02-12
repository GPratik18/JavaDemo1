public class ReverseStringDemo4 {
	public static void main(String[] args) {
		String s1="Beed Cluster";
		String s2="";
		String sarr[] =s1.split(" ");
		for(String ele:sarr) {
			for(int i=ele.length()-1;i>=0;i--) {
				s2=s2+ele.charAt(i);
			}
			s2=s2+" ";
		}
		System.out.println(s2);
	}
}
