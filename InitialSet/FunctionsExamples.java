public class FunctionsExamples {
	/*
	  Python version of a function:
	  def average(num1, num2) :
	  	   averageNum = (num1 + num2)/2
	  	   return averageNum
	 */
	
	public static int average(int num1, int num2){
		int averageNum = (num1 + num2)/2;
		return averageNum;
	}
	
	public static double decimalValue(double num) {
		long whole = (long)num;
		double afterDecimal = num - whole;
		return afterDecimal;
		
	}
	
	
	public static void main(String[] args) {
		int result = average(5,9);
		System.out.println(result);
		
		double after = decimalValue(896.4523);
		System.out.println(after);
		double tolerance = 0.000001;
		System.out.println(Math.abs(after - 0.4523) < tolerance);
		System.out.println(after == 0.4523);
	}
		
	}