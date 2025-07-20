package QA_Practise;

public class Variables {
	int a  = 1; // instance variable
	int b = 1; // instance variable
	static int c = 3; // static variable

	public static void main(String[] args) {
		int d = 4; // logic variable
		int sum = c - d; // using static variable and local variable
		//Note: in method we can't use instance variables, to use we need to create object.
		System.out.println(sum);
		Variables obj  = new Variables(); //object creation, created object with name obj
		System.out.println(obj.a + obj.b - c + d);
		
	}

}
