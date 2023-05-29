// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
Create a Java program that simulates a bank account. The program should allow
users to deposit and withdraw money, check their balance.

*/
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter the amount to be deposited while opening account");
	    int n=sc.nextInt();
		
		Saastabank s = new Saastabank(n);
		
		s.deposit(100000);
		s.withdraw(5000);
		s.balance();
	}
}

class Saastabank{
    
    int amount;
    
    Saastabank(int v){
        
        this.amount = v;
        
    }
    
    
    public void deposit(int v){
        
        amount=amount+v;
        
        System.out.println("The amount"+v+" has been deposited ");
        
    }
    
    public void withdraw(int v){
        
        
        amount -=v;
        
        System.out.println("The amount"+v+" has been withdrawn ");
    }
    
    public void balance(){
        
        System.out.println("The remaining balance is "+amount);
        
    }
    
}
