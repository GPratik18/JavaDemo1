import java.util.Scanner;
public class MutableStringAssignment3 {
	public static void main(String[] args) {
		String s1=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		s1=sc.nextLine();
		sc.close();
		s1=s1.toLowerCase();
		String strArr[]=s1.split(" ");
		StringBuffer strBffr=new StringBuffer();
		for(String ele:strArr) {
			for(int i=ele.length()-1;i>=0;i--) {
				strBffr.append(ele.charAt(i));
			}
			strBffr.append(" ");
		}
		System.out.println(strBffr);
	}
}
