public class PangramStringDemo1 {
	public static void main(String[] args) {
		String s1="The quick brown fox jumps over lazy dog";
		//s1.tr
		boolean ispangram=false;
		s1=s1.replace(" ","");
		s1=s1.toUpperCase();
		//System.out.println(s1);
		char ch[]=s1.toCharArray();
		//System.out.println(ch);
		int arr[]=new int[26];
		for(int i=0;i<ch.length;i++) {
			arr[ch[i]-65]++;
		}
		for(int i=0;i<26;i++) {
			if(arr[i]==0) {
				ispangram=false;
				break;
			}
			else {
				ispangram=true;
			}
		}
		if(ispangram==true) {
			System.out.println("It is pangram.");
		}
		else {
			System.out.println("It is not pangram.");
		}
	}
}
