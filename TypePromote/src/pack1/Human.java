package pack1;

public class Human {
	private String name;
	private int age;
	private GENDER gender = GENDER.MALE;
	
	void eats() {
		System.out.println("Human eats!");
	}
	
	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}
	
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
