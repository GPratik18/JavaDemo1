public class StringAssignment1 {
	public static void main(String[] args) {
		String s1="iugofgiuhfiufhffhhhhf";
		char ch1[]=s1.toCharArray();
		char ch2[]=new char[ch1.length];
		boolean flag =false;
		int index=0;
		for(int i=0;i<ch1.length;i++) {
			flag=false;
			for(int j=0;j<i;j++) {
				if(ch1[i]==ch2[j]) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				ch2[index++]=ch1[i];
			}
			else {
				continue;
			}
		}
		s1=new String(ch2);
		System.out.println(ch2);
	}
}