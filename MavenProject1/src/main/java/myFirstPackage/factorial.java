package myFirstPackage;

public class factorial {
	
	//Find factorial using recursion methods.5! = 5*4*3*2*1
	
	
	static int factorial(int n){
		
		if (n==0) {
			return 1;
		}
		else
		return (n * factorial(n-1));
	}
					
				
	public static void main(String[] args) {
		int n =5, fact =1;
		fact = factorial(n);
		System.out.println("Factorial value is:"  + fact);
	}
		
}
	

