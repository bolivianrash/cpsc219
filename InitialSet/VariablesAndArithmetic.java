public class VariablesAndArithmetic {
	public static void main(String[] args) {
		int num; // declaration
		num = 7; // initialize
		num++; // num = num + 1
		
		int whole = ++num/2;
		int remainder = num%2;
		
		System.out.println(num);
		System.out.println(whole);
		System.out.println(remainder);
		
		int other = (int)7.5;

		boolean flag = true;
		
		char c = 'a';
		String s = "a"; // array of chars
		
		// code will still compile with warnings!
		
		System.out.println(other);
		
		// Example in python
		// s = "hello" + 7
		// TypeError: can only concatenate str (not "int") to str
		// num = 7
		// s = "hello" + str(num)
		// print(s)
		// hello7
		
		
		float d = (float)7.8 + 9.1f;
		float g = (float)7.8 + (float)9.1;
		float h = 7.8f + 9.1f;
		double e = 7.8 + 9.1;
		
		System.out.println("Value of d: " + d);
		System.out.println("Value of g: " + g);
		System.out.println("Value of h: " + h);
		System.out.println("Value of e: " + e);
	}
}