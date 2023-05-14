@FunctionalInterface
interface Car{
	public void drive(int avg);
}
public class AnnInnClaDemo {
	public static void main(String[] args) {
		Car obj = avg ->System.out.println("Driving"+avg);
		obj.drive(16);
	}
}
