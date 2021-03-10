package pack1;

class Student extends Human{

	 private String name;

	Student(String name) {
		this.name = name;
	}

	void eats() { //overrides method
		super.eats();
		System.out.println("student eats");
	}

	
	
	
}
	