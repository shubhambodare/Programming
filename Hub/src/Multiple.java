//Inheritance with multiple overloading
class Parent{
	
	public void add(int a,int b) {
		int c=a+b;	
		System.out.println("in Parent int add is "+c);
	}	
}

class Child extends Parent{
	
public void add(double a,double b) {//child inheritance parent
		
		double c;
		c=a+b;
		System.out.println("in child double add is "+c);

	}

public void add(float a,float b) {
	float c;
	c=a-b;
	System.out.println("in child float sub is "+c);

}//create comment for git comment purpose
}

public class Multiple {

	public static void main(String[] args) {
		
		Child ch=new Child();//object child class	
		
		ch.add(5,4);
		ch.add(2947.8075028572976,5413.745863009720);
		ch.add(10.5, 3.8);
		
	}

}
