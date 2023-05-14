abstract class man{
	abstract void see();
}
interface Human{
	
}
class Teacher extends man implements Human{
	public void walks(){
		System.out.println("Walking ...");
	}
	public void see() {
			System.out.println("seeing ....");
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Teacher t1= new Teacher();
		t1.walks();
		man m1=new Teacher();
	}
}
