import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
class Student{
	int age;
	String name;
	public Student(int age, String name) {
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return this.getName()+"\n";
	}
}
class Alpha implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge()>o2.getAge()) {
			System.out.println("running");
			return 1;
		}
		else {
			return -1;
		}
		
	}
}
public class ComparatorExample1 {
	public static void main(String[] args) {
		List<Student> a1=new ArrayList<Student>();
		a1.add(new Student(1, "Pratik"));
		a1.add(new Student(2, "Saurabh"));
		a1.add(new Student(3, "Chilya"));
		a1.add(new Student(1, "Shubham"));
		a1.add(new Student(2, "Prajwal"));
		a1.add(new Student(3, "Prashant"));
		a1.add(new Student(2, "Pravin"));
		a1.add(new Student(5, "Prakash"));
		a1.add(new Student(6, "Prasidh"));
		a1.add(new Student(1, "Pranav"));
		System.out.println(a1);

		List<Integer> a2=new ArrayList<Integer>();
		a2.add(1);
		a2.add(2);
		a2.add(1);
		a2.add(3);
		a2.add(11);
		a2.add(2);
		System.out.println(a2);
		Collections.sort(a2);
		System.out.println(a2);
		Alpha c=new Alpha();
		Collections.sort(a1,c);
		System.out.println(a1);
	}
}
