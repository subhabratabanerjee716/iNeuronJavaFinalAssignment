// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
Write a Java program that implements a producer-consumer model using
multithreading. The program should have a producer thread that generates random
numbers and adds them to a queue, and a consumer thread that reads numbers
from the queue and calculates their sum. The program should use synchronization to
ensure that the queue is accessed by only one thread at a time.

*/

import java.util.*;
public class HelloWorld {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
    ProducerConsumer eo = new ProducerConsumer();
    
    Thread producer = new Thread(){
        
        public void run(){
            
            eo.produce();
            
        }
        
        
    };
    Thread consumer = new Thread(){
        
        public void run(){
            
            eo.consume();
            
        }
        
        
    };
	    System.out.println(" ");
	    producer.start();//start thread 1
	    System.out.println(" ");
	    consumer.start();
	    	
	}
 
}

class ProducerConsumer{
    
    Queue<Integer> q = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    synchronized void produce(){
        for(int i=0;i<5;i++){
        System.out.println("please enter a value");
        
        q.add(sc.nextInt());
        }
        try{
        wait();
        }catch(Exception e ){
            
            System.out.println(e);
            
        }
    }
    
    synchronized void consume(){
        
        
        for(Integer e: q){
            
            System.out.println(e);
            
        }
        
        try{
        notify();
        }catch(Exception e){
            
            System.out.println(e);
            
        }
        
        
    }
    
}
