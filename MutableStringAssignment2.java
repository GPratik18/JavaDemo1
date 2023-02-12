import java.util.Scanner;
public class MutableStringAssignment2 {
	public static void main(String[] args) {
		String s1=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		s1=sc.next();
		StringBuffer s2=new StringBuffer();
		for(int i=s1.length()-1;i>=0;i--) {
			s2.append(s1.charAt(i));
		}
		char tmp;
		tmp = s2.charAt(s2.length()-1);
		s2.setCharAt(s2.length()-1, s2.charAt(s2.length()-2));
		s2.setCharAt(s2.length()-2, tmp);
		s1=s2.toString();
		System.out.println(s1);
	}
}
