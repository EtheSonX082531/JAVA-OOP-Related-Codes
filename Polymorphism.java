public class Main {
	public static class Student{
	    String name;
	    int age;
	    
	    //default Constructor
	    public Student(){}
	   
	   //Copy Constructor
	    public Student(Student x){
	        this.name=x.name;
	        this.age=x.age;
	    }
	    
	    //Parameterised Constructor
	    public Student(String name,int age){
	        this.name=name;
	        this.age=age;
	    }
	    
	    //Method PrintInfo
	    public void PrintInfo(){
	        System.out.println("Here are the all information about the Student:"+this.name);
	        System.out.println(this.name);
	        System.out.println(this.age);
	        System.out.println();
	    }
	    
	    //Polymorphism
	    public void PrintSomething(String x){
	        System.out.println("String is:"+x);
	}
	
	public void PrintSomething(int num){
	   System.out.println("Integer is:"+num);
	}
	}
	   
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Anik Roy";
		s1.age=24;
		s1.PrintInfo();
		
		Student s2=new Student(s1);
		s2.PrintInfo();
		
		Student s3=new Student("Ayon Roy",20);
		s3.PrintInfo();
		
		//Function 
		s1.PrintSomething("Hello");
		s2.PrintSomething(10);
	}
}
