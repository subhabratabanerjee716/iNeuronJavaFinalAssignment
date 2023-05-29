// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
Demonstrate the difference between abstract class and interface by writing programs
as well as in keypoints

*/
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	
	abs a = new impl() ;
	
	a.printMsgP();
	a.printMsg();
	
	
		
	}
 
}
interface pureabs{
 
 abstract void printMsgP();
 
}

abstract class abs implements pureabs{
 //this method is abstract
 abstract void printMsg();
 
 void nonAbsMethod(){
     
     System.out.println("This method is not abs");
     
 }
 
}
class impl extends abs{
 
 

@Override
public void printMsgP() {
	// TODO Auto-generated method stub
	System.out.println("Implementation of interface method");
	
}

@Override
void printMsg() {
	// TODO Auto-generated method stub
	System.out.println("Implementation of abstract class method");
	
}
 
}
