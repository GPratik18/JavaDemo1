public class MutableStringAssignment4 {

	public static void main(String[] args) {
		String str1= new String("qwertyuiopASDFGHJKLzxcvbnm");
		str1= str1.toLowerCase();
		StringBuilder strBldr =new StringBuilder(str1);
		char tmp;
		for(int i=0;i<strBldr.length();i++) {
			tmp=strBldr.charAt(0);
			for(int j=0;j<str1.length()-i-1;j++) {
				if(strBldr.charAt(j)>strBldr.charAt(j+1)) {
					tmp= strBldr.charAt(j+1);
					strBldr.setCharAt(j+1,strBldr.charAt(j));
					 strBldr.setCharAt(j, tmp);
				}
			}
		}
		System.out.println(strBldr);
	}
}