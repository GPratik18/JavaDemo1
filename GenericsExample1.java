import java.util.HashMap;
import java.util.Map;

class Test<T>{
	T t;
	public Test(T t) {
		this.t=t;
	}
	
	void displayType() {
		System.out.println(t.getClass().getName());
	}
	public T getObject() {
		return t;
	}
}
public class GenericsExample1 {
	public static void main(String[] args) {
		GenericsExample1 a=new GenericsExample1();
		Test<GenericsExample1> test= new Test<GenericsExample1>(a);
		test.displayType();
		System.out.println(test.getObject());
		Map ab= new HashMap();
		
	}
	public String toString() {
		return "This is GenericsExample1 class ";
	}
}
