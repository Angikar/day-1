
public class Variables {
class Book{
	int a= 0; //instance variable
	void m(){
		int a =10; //local variable, declared within a method
		System.out.println(this.a);
		if(a==10) {
			int b=20;  //code block variable
		}
		System.out.println(b); //cannot print code block var outside code block
	}
	
			
}
}
