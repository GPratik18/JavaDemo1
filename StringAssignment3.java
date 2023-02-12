public class StringAssignment3 {
	public static void main(String[] args) {
		String s="aBcDeFghIjkLmnOPqRstuvwXYZ!@#$%^&*()-=+?><{},.";
		int consonants=0,vowels=0,specialCharacters=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<'A' || (s.charAt(i)<'a' && s.charAt(i)>'Z') || s.charAt(i)>'z') {
				specialCharacters++;
			}
			else if (s.charAt(i)=='a' || s.charAt(i)=='A' ||
					 s.charAt(i)=='e' || s.charAt(i)=='E' ||
					 s.charAt(i)=='i' || s.charAt(i)=='I' ||
					 s.charAt(i)=='o' || s.charAt(i)=='O' ||
					 s.charAt(i)=='u' || s.charAt(i)=='U') {
				vowels++;
			}
			else {
				consonants++;
			}
		}
		System.out.println("Special Characters: "+specialCharacters);
		System.out.println("Vowels:  "+vowels);
		System.out.println("Consonants: "+consonants);	
		System.out.println("Total characters: "+s.length());
	}
}
