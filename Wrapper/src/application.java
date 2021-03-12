import java.util.ArrayList;
import java.util.List;

public class application {
public static void main(String[] args) {
	int a =1;
	// a.  ---> no methods available
	Integer b = a; //autoboxing, trapping the value of a into an object
	// b. --> all classes will be available since Integer is an object
	Float f = 32.3F; // Float is a wrapper class, f is the object
	
	Double d = 22.5;
	System.out.println(d.compareTo(24.9)); // -1 , since d <24.9
	
	
	
	double primitiveDouble = d;  // auto unboxing , both are possible
	List<Integer> list = new ArrayList<Integer>(); // NOTE : Collections can store only objects
	list.add(75); //here 75 is converted to Integer object
	
}
}
