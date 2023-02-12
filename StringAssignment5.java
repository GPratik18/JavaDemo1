public class StringAssignment5 {
	public static void main(String[] args) {
		String string1="School Master";
		String string2="The Classroom";
		int index1=0,index2=0;
		int string1Length=0,string2Length=0;
		for(int i=0;i<string1.length();i++) {
			if(string1.charAt(i)!=' ') {
				string1Length++;
			}
		}
		for(int i=0;i<string2.length();i++) {
			if(string2.charAt(i)!=' ') {
				string2Length++;
			}
		}
		char ch1[]=new char[string1Length];
		char ch2[]=new char[string2Length];
		for(int i=0;i<string1.length();i++) {
			if(string1.charAt(i)!=' ') {
				if(string1.charAt(i)>='A' && string1.charAt(i)<='Z') {
					ch1[index1]=(char)(string1.charAt(i)+32);
					index1++;
				}
				else {
					ch1[index1]=string1.charAt(i);
					index1++;
				}
			}
		}
		for(int i=0;i<string2.length();i++) {
			if(string2.charAt(i)!=' ') {
				if(string2.charAt(i)>='A' && string2.charAt(i)<='Z') {
					ch2[index2]=(char)(string2.charAt(i)+32);
					index2++;
				}
				else {
					ch2[index2]=string2.charAt(i);
					index2++;
				}
			}
		}
		char tmp;
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch1.length-1-i;j++) {
				if(ch1[j]>ch1[j+1]) {
					tmp=ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=tmp;
				}	
			}	
		}
		for(int i=0;i<ch2.length;i++) {
			for(int j=0;j<ch2.length-1-i;j++) {
				if(ch2[j]>ch2[j+1]) {
					tmp=ch2[j];
					ch2[j]=ch2[j+1];
					ch2[j+1]=tmp;
				}	
			}
		}
		int i;
		for(i=0;i<ch1.length;i++) {
			if((int)ch1[i]!=0 && (int)ch2[i]!=0)
			{
				if(ch1[i]!=ch2[i]) {
					break;
				}
			}
		}
		if(i==ch1.length) {
			System.out.println("Strings are anagram");
		}
		else {
			System.out.println("Strings are not anagram");
		}
	}
}
