package firstProgram;

public class calculation {
	
	public int sum(int a, int b) {
		
		int c= a+b;
		return c;
	}
public int sub(int a, int b) {
		
	
		int c= a-b;
		return c;
	}
public int mul(int a, int b) {
	
	
	int c= a*b;
	return c;
}
public int div(int a, int b) {
	

	int c= a/b;
	return c;
}
public static void main(String[] args) {
	
	calculation opp1 =new calculation();
	int sumresult= opp1.sum(10, 2);
	int sumresult1= opp1.sum(sumresult, 2);
	int subresult= opp1.sub(sumresult1, 2);
	int mulresult= opp1.mul(subresult, 2);
	int divresult= opp1.div(mulresult, 2);
	
System.out.println("The final result of operation (((((10+2)+2)-2)*2)/2) is " +divresult);
	
}
}
