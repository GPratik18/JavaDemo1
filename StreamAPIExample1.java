import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExample1 {

	public static void main(String[] args) {
		List<Integer> a1= Arrays.asList(1,2,3,4,5,6,7, 8,9,0,10,100,10);
		System.out.println(a1);
		Stream<Integer> stream1=a1.stream();
//		stream1.forEach(n-> System.out.println(n));
		Stream< Integer> sortedStream = stream1.sorted();
		sortedStream.forEach(n-> System.out.println(n));
	}

}
