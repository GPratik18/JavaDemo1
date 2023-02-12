public class PalindromeStringDemo1 {
	public static void main(String[] args) {
		String str1 ="Madam";
		String str2 ="";
		str1=str1.toUpperCase();
		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		if(str1.equals(str2)) {
			System.out.println("String is palindrome ");
		}
		else {
			System.out.println("String is not palindrome ");
		}
	}
}
