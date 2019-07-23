//Inheritance with multiple overloading
class Parent{
	
	public void add(int a,int b) {
		int c=a+b;	
		System.out.println("in Parent int addition is "+c);
	}	
}

class Child extends Parent{
	
public void add(double a,double b) {//child inheritance parent
		
		double c;
		c=a+b;
		System.out.println("in parent double addition is "+c);

	}
}

public class Multiple {

	public static void main(String[] args) {
		
		Child ch=new Child();//object child class	
		ch.add(2, 3);
		ch.add(5.38,4.75);
		
	}

}
