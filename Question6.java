// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
Write a Java program that uses stream api to perform operations on a large data set,such as sorting or filtering the data.
*/

import java.util.*;  
import java.util.stream.Collectors;
class HelloWorld {
   public static void main(String[] args){ 
    List<cars> L1=new ArrayList<>();
  L1.add(new cars("CelerioX",700000));
  L1.add(new cars("WagonR",500000));
  L1.add(new cars("swift",650000));
  
  for(cars e:L1){
      
      System.out.println(e.name +" "+e.cost);
  }
  System.out.println();
  
  List<String> l2=L1.stream().filter(p->p.cost>=500000).map(p->p.name).collect(Collectors.toList());
  System.out.println(l2);
    }
}
class cars{
    String name;
    int cost;
    cars(String name,int cost){
        
       this.name=name;
       this.cost=cost;
        
    }
}
