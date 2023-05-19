import java.util.Scanner;
class Thread1 extends Thread{
	Scanner scanner=new Scanner(System.in);
	int a;
	public void run() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if (i==0 || j==0 || i==9 || j==9) {
					System.out.print("*");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println("Enter a number");
			a=scanner.nextInt();
		}
	}
}
class Thread2 extends Thread{
	public void run(){
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if (i==0 || j==0 || i==9 || j==9) {
					System.out.print("+");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Something went wrong");
			}
		}
	}
}
public class MultiThreadingDemo2 {
	public static void main(String[] args) {
		Thread1 t1= new Thread1();
		t1.setName("Thread 1");
		
		Thread2 t2= new Thread2();
		t2.setName("Thread 2");
		
		t1.start();
		t2.start();
	}
}
