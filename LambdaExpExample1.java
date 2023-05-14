@FunctionalInterface
interface Test{
	int i=0;
	void sayHi();
}
public class LambdaExpExample1 {

	public static void main(String[] args) {
		Test test;
		LambdaExpExample1.greet(test=()->System.out.println("Hi"));
		LambdaExpExample1.greet(test=()->System.out.println("Namaste"));
	}
	public static Test greet(Test t) {
		t.sayHi();
		return t;
	}
}