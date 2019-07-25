class mat{
	
	void mul(int a,int b) {
		
		int c;
		c=a*b;
		
		System.out.println(+c);

	}
	
}

class Add extends mat{
	
	void addi(int a,int b) {
		int c;
		c= a+b;
		System.out.println(+c);
	}
}

public class Bank {

	public static void main(String[] args) {
		
		Add ad=new Add();
		ad.mul(3, 4);
		ad.addi(10, 20);

		
	}

}
