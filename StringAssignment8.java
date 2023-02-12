public class StringAssignment8 {
	public static void main(String[] args) {	
		String string="lkagdsfuihq uq rqhohiqh ";
		string=string.toLowerCase();
		char maxChar=' ';
		int max=0;
		for(int i=0;i<string.length();i++) {
			int tmpMax=0;
			for(int j=0;j<string.length();j++) {
				if(string.charAt(i)==string.charAt(j)) {
					tmpMax++;
				}
			}
			if(max<tmpMax) {
				max=max+tmpMax;
				tmpMax=max-tmpMax;
				max=max-tmpMax;
				maxChar=string.charAt(i);
			}
		}
		System.out.print("Maximum occuring character: "+maxChar+", ");
		System.out.println(max+" times");
	}
}
