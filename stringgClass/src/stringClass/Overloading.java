package stringClass;

public class Overloading {
	public static void main(String[] args) {
		Student1 s= new Student1();
		//s.study(10);
		s.study(9,"Mukul");
	}
}

class Student1{
	
	public void study(int dur,String subject) {
		System.out.println("Study ... " + subject +" ," + dur + " hours!");
		study(dur);
	}
	
	public void study() {
		System.out.println("Study....");
	}
	
	private void study(int dur) {
		System.out.println("Study ... for " + dur + " hours!");
	}
}
