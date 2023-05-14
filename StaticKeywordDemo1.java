public class StaticKeywordDemo1 {
	public static void main(String[] args) {
		Demo demo=new Demo();
		Demo.disp1();
		demo.disp2();
		demo.disp1();
	}
}
public class Demo {
	static int a;
	static int b;
	int m;
	int n;
	static {
		a=10;
		b=20;
		System.out.println("Control in static block");
	}
	{
		System.out.println("Control in non static block");
	}
	static void disp1() {
		System.out.println("Value of static var "+a);
		System.out.println("value of static var "+b);
	}
	void disp2() {
		System.out.println("Value of non static var "+m);
		System.out.println("Value of non static var "+n);
	}
}

