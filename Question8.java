// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
Write a Java program that creates two threads. The first thread should print even
numbers between 1 and 10, and the second thread should print odd numbers
between 1 and 10.
*/

import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
    EvenOdd eo = new EvenOdd();
    
    Thread evenThread = new Thread(){
        
        public void run(){
            
            eo.print(1);
            
        }
        
        
    };
    Thread oddThread = new Thread(){
        
        public void run(){
            
            eo.print(2);
            
        }
        
        
    };
	    System.out.println(" ");
	    evenThread.start();
	    System.out.println(" ");
	    oddThread.start();
	    	
	}
 
}

class EvenOdd{
    
    synchronized void print(int n){
        
        if(n==1){
        
        for(int i=1;i<=10;i++){
            
            if(i%2==0){
            System.out.println(i);
            
            }
        }
        }
        if(n==2){
        
        for(int i=1;i<=10;i++){
            
            if(i%2!=0){
            System.out.println(i);
            }
        }
        }
        
    }
    
}
