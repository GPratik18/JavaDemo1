public class StringAssignment7 {
	public static void main(String[] args) {
		String string ="asdfghjkl";
		string=string.toLowerCase();
		char ch[]=string.toCharArray();
		boolean flag=false;
		System.out.println("String contains these unique characters: ");
		for(int i=0;i<ch.length;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(ch[i]==ch[j]) {
					flag=true;
					break;
				}
			}
			if(j==i) {
				System.out.print(ch[i]);
			}
		}
		if(flag==true) {
			System.out.println();
			System.out.println("but all characters are not unique");
		}
		else {
			System.out.println();
			System.out.println("and all characters are unique");
		}
	}
}
