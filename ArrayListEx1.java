import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList arr1=new ArrayList();
		for(int i=0;i<5;i++) {
			arr1.add(10*(i+1));
		}
		System.out.println(arr1);
		ArrayList arr2=new ArrayList();
		for(int i=65;i<70;i++) {
			arr2.add((char)i);
		}
		System.out.println(arr2);
		arr1.addAll(arr2);
		System.out.println(arr1);
		arr1.add(3,0.3f);
		System.out.println(arr1);
		
		System.out.println(arr1.containsAll(arr2));
		System.out.println(arr1.indexOf(40));
		System.out.println(arr1.size());
		arr1.ensureCapacity(15);
		arr1.trimToSize();
		arr1.clear();
		System.out.println(arr1);
	}

}
