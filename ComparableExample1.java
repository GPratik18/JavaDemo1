import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{
	int age;
	String name;
	
	public Student1(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return age+" "+name;
	}
	@Override
	public int compareTo(Student1 o) {
		if(this.age>o.age) {
			return 1;
		}
		return -1;
	}
}
public class ComparableExample1 {
	public static void main(String[] args) {
		ArrayList<Student1> a1=new ArrayList();
		a1.add(new Student1(1, "Pratik"));
		a1.add(new Student1(2, "Saurabh"));
		a1.add(new Student1(3, "Chilya"));
		a1.add(new Student1(1, "Shubham"));
		a1.add(new Student1(2, "Prajwal"));
		a1.add(new Student1(3, "Prashant"));
		a1.add(new Student1(2, "Pravin"));
		a1.add(new Student1(5, "Prakash"));
		a1.add(new Student1(6, "Prasidh"));
		a1.add(new Student1(1, "Pranav"));
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
	}
}
