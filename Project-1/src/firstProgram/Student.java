package firstProgram;

public class Student {
	int age;
	int Roll_No;
		public void Display1() {
			System.out.println("Wellcome in the Java");
	}
		public void Display2() {
			System.out.println("Automation is very easy");
		}
public static void main(String[] args) {
	
	Student test2=new Student();
	test2.Display1();
	test2.Display2();
	test2.age=23;
	System.out.println(test2.age);
	test2.Roll_No=25;
	System.out.println(test2.Roll_No );
	
}
}
