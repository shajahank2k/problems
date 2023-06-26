package mylearning;

public class NextGreaterElement3 {

	public static void main(String[] args) {
		int n = 21;
		int ans = nextGreaterElement3(n);
		System.out.println(ans);
	}
	
	public static int nextGreaterElement3(int n) {
		int temp = n%10;
		return temp;
	}

}
