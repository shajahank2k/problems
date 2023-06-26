package mylearning;

public class MaximumSubarrayProblem {

	public static void main(String[] args) {
		int[] nums = {-2,-1,-3,-4};
        System.out.println(maximumSubarrayOptimal(nums));
	}
	
	public static int maximumSubarrayBruteForce(int[] nums) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			if(max<nums[i]) max = nums[i];
			sum = nums[i];
			for(int j=i+1;j<nums.length;j++) {
				sum = sum+nums[j];
				if(sum>max) max = sum;
			}
		}
		return max;
	}
	
	public static int maximumSubarrayOptimal(int[] nums) {
		int max = Integer.MIN_VALUE;
		int max_tillEnd = 0;
	    for(int i=0;i<nums.length;i++) {
			max_tillEnd = max_tillEnd + nums[i];
			if(max_tillEnd>max) max = max_tillEnd;
			if(max_tillEnd<0) max_tillEnd = 0; 
		}
		return max;
	}

}
