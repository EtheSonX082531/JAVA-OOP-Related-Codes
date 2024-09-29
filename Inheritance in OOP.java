public class Main {
	//Base Class/Parent Class
	public static class Shape{
	    String color;
	}
	
	//Here Rectangular class just extended/inherited the Shape class
	
	//Derived Class/Child Class
	
	//Single-Level Inheritance
	public static class Rectangular extends Shape{
	    
	}
	
	
	//Multi-Level Inheritance
	public static class  Square extends Rectangular{
	    
	}
	
	//Hierarchial Inheritance
	public static class Circle extends Shape{
	    
	}
	
	
	//Mixture of every type of inheritance is called Hybrid Inheritance 
	public static void main(String[] args) {
		Rectangular r1=new Rectangular();
		r1.color="Blue";
		System.out.println(r1.color);
		
		Square s1=new Square();
		s1.color="Black";
		System.out.println(s1.color);
		
		Circle c1=new Circle();
		c1.color="Green";
		System.out.println(c1.color);
	}
}
