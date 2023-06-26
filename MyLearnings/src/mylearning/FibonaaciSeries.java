package mylearning;

public class FibonaaciSeries {

	public static void main(String[] args) {
		int n = 6;
		System.out.println(Fib(n));

	}
	
	public static int Fib(int n) {
		if(n<=1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		return Fib(n-1)+Fib(n-2);
	}

}
