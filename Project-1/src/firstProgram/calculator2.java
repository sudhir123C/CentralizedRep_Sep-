package firstProgram;

public class calculator2 {
	
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
	int divresult= opp1.div(10, 2);
	int subresult= opp1.sub(divresult, 2);
	int sumresult= opp1.sum(subresult, 2);
	int subresult1= opp1.sub(sumresult, 2);
	int mulresult= opp1.mul(subresult1, 2);
	
System.out.println("The final result of operation (((((10/2)-2)+2)-2)*2) is " +mulresult);
	
}
}



