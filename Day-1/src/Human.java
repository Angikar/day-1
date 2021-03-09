
public class Human {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("name is mandatory!");
		}
			
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
