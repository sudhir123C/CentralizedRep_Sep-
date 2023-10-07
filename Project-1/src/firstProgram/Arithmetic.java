package firstProgram;

public class Arithmetic {
	
	public int sum(int a, int b) {
		
		int c;
		c= a+b;
		System.out.println("Sum result is " +c );
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z= y-x;
		System.out.println("Sub result is " +z);
		return z;
	}
	public int mul(int a1, int b1)
	{
		int c1;
		c1= b1*a1;
		System.out.println("Mul result is " +c1);
		return c1;
}
	public static void main (String[] args) 
	{
		Arithmetic ob3 = new Arithmetic();
		int sumresult =ob3.sum(8,2);
		int subresult= ob3.sub(10, 22);
		ob3.mul(sumresult , subresult);
		
	}
		
	  
}