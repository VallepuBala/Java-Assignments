package QA_Practise;

// INSTRUCTION: All methods should be static

public class Assignment1_Calci {
	
	// 1. No Arguments, No Return Type
	public static void natSum1() {
		int n = 10;
		System.out.println(n*(n+1)/2);
	}
	
	// 2. No Argument, Return Type
	public static int natSum2() {
		int n = 10;
		int sum = n*(n+1)/2;
		return sum;
	}
	
	// 3.Arguments, No Return Type
	public static void natSum3(int n) {
		System.out.println(n*(n+1)/2);
	}
	
	// 4. Argument, Return Type
	public static int natSum4(int n) {
		return n*(n+1)/2;
	}

	public static void main(String[] args) {
		natSum1();
		System.out.println(natSum2());
		natSum3(10);
		System.out.println(natSum4(10));

	}

}
