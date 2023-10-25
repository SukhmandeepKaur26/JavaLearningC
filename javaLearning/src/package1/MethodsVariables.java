package package1;

public class MethodsVariables {
	
	
	int  V = 10;
	
	public int sum(int a, int b ) {
		int Sum = a+b;
		return Sum;
	}

	public int sub(int c ,int d) {
		int sub = c-d;
		return sub;
	}
	
	public int multi (int e, int f) {
		int Result = e*f;
		return Result;
	}
	
	public static void main(String[]args) {
		MethodsVariables obj1 = new MethodsVariables();
		
	// exercise (1+2)(3-4)
		int Sum = obj1.sum(1, 2);
		int sub = obj1.sub(3,4);
		System.out.println("Result is "+ obj1.multi(Sum, sub));
	}
	
}
