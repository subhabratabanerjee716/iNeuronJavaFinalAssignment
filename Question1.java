// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
Write a Java program that uses polymorphism by defining an interface called Shape
with methods to calculate the area and perimeter of a shape. Then create classes
that implement the Shape interface for different types of shapes, such as circles and
triangles
*/

public class HelloWorld {
    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.setR(10);
       // System.out.println(c.Area());
       // System.out.println(c.Perimeter());
        
        Triangle t =new Triangle();
        t.setA(5);
        t.setB(7);
        t.setC(22);
        t.setH(10);
        
        System.out.println(t.Area());
        System.out.println(t.Perimeter());
    }
}
interface Shape{
    
    public double Area();
    public double Perimeter();
}

class Circle implements Shape{

	int r;
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public double Area() {
		
		double sol=Math.PI*r*r;
		
		return sol;
	}

	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
	
		return 2*Math.PI*r;
	}
    
    
    
}
class Triangle implements Shape{

	int h;
	int b;
	int a;
	int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public double Area() {
		
		double sol=b*h;
		return sol/2;
	}
	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		
		
		return a+b+c;
	}
	  
    
}
