
public class Student extends Human {
	private String name; //data encapsulation
	
	void study() {
		System.out.println(getName() +" is studying");
	}

	Student(){     //default constructor
		
	}
	
	Student(String name){  //custom constructor
		setName(name);
	}
	
	void putAge(){
		setAge(10);
	}
	
	
	void showAge() {
		System.out.println("The age of student is " + getAge());
	}


}
