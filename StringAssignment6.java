public class StringAssignment6 {
	public static void main(String[] args) {
		String string="qwe Tryuio  pasdFghjABBCDklzx c vbnm";
		int index=0;
		int stringLength=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=' ') {
				stringLength++;
			}
		}
		char ch[]=new char[stringLength];
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=' ') {
				if(string.charAt(i)>='A' && string.charAt(i)<='Z') {
					ch[index]=(char)(string.charAt(i)+32);
					index++;
				}
				else {
					ch[index]=string.charAt(i);
					index++;
				}
			}
		}
		int arr[]=new int[26];
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>90) {
				arr[ch[i]-97]++;
			}
			else {
				arr[ch[i]-65]++;
			}
		}
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				break;
			}
		}
		if(i==arr.length) {
			System.out.println("String is pangram");
		}
		else {
			System.out.println("String is not pangram");
		}
		System.out.println(ch);
	}
}
