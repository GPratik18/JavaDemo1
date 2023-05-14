public class Demo1 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello "+2/0);
		}catch(Exception e){
			System.out.println("World ");
		}
	}
}
