
public class School {
    
	public static void main(String[] args) {
		//for loop to create 10 teacher objects
		//for(int i=0;i<10;i++) {
			//Teacher teacher = new Teacher("Shyam" + i);
		//printPattern();
		 m1("A",m1("B",false) || m1("C",true) || m1("D",false));
		
		}
	
	  static boolean m1(String s, boolean b) {
	    System.out.print(s + (b ? "T" : "F"));
	    return b;
	  }
		//while , do-while
		void m1() {
		int i=0;
    		while( i <10) {
			System.out.println(i);
			i++;}
		}  
		private static void printPattern() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=5;i>=1;i--) {
		 for(int j=1;j<=i;j++){
			 System.out.print("*");
		}
		 	System.out.println();
		}
		}
		
		
		void studentDiscussion() {
			
			System.out.println("Hello Java!");
			
			Student student = new Student("Ram");
			//student.name="Ram";  //avoid
			//student.setName("     "); //avoid
			
			student.setAge((byte)10);
			System.out.println("Name:" + student.getName());
			System.out.println("Age:" + student.getAge());
			student.study();
		}
		
	
}
