package mylearning;

public class PrefixSum {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int[] ans = prefixSum(nums);
		for(int answer : ans) {
			System.out.print(answer + " ");
		}
	}
	
	public static int[] prefixSum(int[] nums) {
		int sum = 0;
		int[] res = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
			res[i] = sum;
		}
		return res;
	}

}
