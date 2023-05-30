// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
Create a Java program that implement binary search algorithm. The program
should accept user input for the target value and search for it in a sorted array. The
program should return the index of the target value if found or a message if not
found.
*/

import java.util.*;  
import java.util.stream.Collectors;
class HelloWorld {
   public static void main(String[] args){ int k;
       int n;
      System.out.println("Enter the key");
      
       Scanner sc = new Scanner(System.in );
       k=sc.nextInt();
       System.out.println("Enter the length");
       n=sc.nextInt();
       
      ArrayList<Integer> l= new ArrayList<>();
        
        for(int i=0;i<n;i++){
            System.out.println("Enter the values of list");
         l.add(sc.nextInt());
        }
        Collections.sort(l);
       for(Integer e:l){
          
          if(k==e){
              
             System.out.println("Data found at index "+l.indexOf(e));
              
          }
           
       }
   }
    
}
