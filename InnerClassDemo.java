class A{
	public void show() {
		System.out.println("in show");
	}
	class B{
		public void display() {
			System.out.println("in display");
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA=new A();
		A.B objB=objA.new B();
		objB.display();
		objA.show();
		
	}

}
