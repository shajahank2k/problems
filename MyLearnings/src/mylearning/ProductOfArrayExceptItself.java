package mylearning;

public class ProductOfArrayExceptItself {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] answer = productOfArrayExceptItselfOptimal(nums);
		for(int ans : answer) {
			System.out.print(ans+ " ");
		}

	}
	
	public static int[] productOfArrayExceptItselfBruteForce(int[] nums) {
		int[] res = new int[nums.length];
		int mul = 1;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(i!=j) {
					mul = mul*nums[j];
				}
			}
			res[i] = mul;
			mul = 1;
		}
		return res;
	}
	
	public static int[] productOfArrayExceptItselfOptimal(int[] nums) {
		int[] res = new int[nums.length];
		int prefix = 1;
		int postfix = 1;
		res[0] = 1;
		for(int i=1;i<nums.length;i++) {
			prefix *= nums[i-1];
			res[i] = prefix;
		}
		for(int j=nums.length-1;j>=0;j--) {
			res[j] = postfix*res[j];
			postfix *= nums[j];
			
		}
		return res;
	}

}
