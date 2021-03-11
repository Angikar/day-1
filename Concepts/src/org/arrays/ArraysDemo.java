package org.arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		/*int[] scores = new int[10]; //objects
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		int[] numbers = {1,2,3,4};
		for(int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		boolean[] bool = {true,false};
		for(boolean value:bool) {      // forEach loop
			System.out.println(value);
		}
		String[] names = new String[10]; //creates an array object with capacity 10, no string object is created here
		for(String name : names) {
		name = new String("Ram"); //goes to heap, 10 objects are created.
		name ="Ram";  // string pool
		System.out.println(name);
		} */
		
		Student[] students = new Student[10];
		for(int i=0;i<students.length;i++) {
			Student student =new Student("Ram"+i);
			students[i]=student;
			if(i==5) {
				break;
			}}
			System.out.println("length"+ students.length);
			for (int i=0;i<students.length;i++) {
				System.out.println(students[i].getName());
			}
			
} 
}//now create an array of 10 Students
class Student{
	private String name;
	
	public Student(String name) {
		super();
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
