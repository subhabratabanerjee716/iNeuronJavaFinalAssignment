// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
Write a Java program to invoke parent class constructor from a child class. Create
Child class object and parent class constructor must be invoked. Demonstrate by
writing a program. Also explain key points about Constructor.
*/

public class HelloWorld {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p = new child(24);
		p.add();
	}

}
class parent{
	
	int a =26;
	int b;
	parent(int b){
		this.b=b;
	}
	
	public void add(){
	    
	    System.out.println(a+b);
	    
	}
}
class child extends parent{
	child(int b) {
		super(b);
	}
		
}
/*
It is a special type of method which is used to initialize the object.

Every time an object is created using the new() keyword, at least one constructor is called.

It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.

*/
