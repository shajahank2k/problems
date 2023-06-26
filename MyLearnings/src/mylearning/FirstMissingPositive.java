package mylearning;

import java.util.HashMap;

public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] nums = {0,2,2,1,1};
        System.out.println(firstMissingPositiveOptimal(nums));
	}
	
	public static int firstMissingPositiveBruteForce(int[] nums) {
		int firstMissingNum = 1;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(nums[j]==firstMissingNum) firstMissingNum++;
			}
		}
		return firstMissingNum;
	}
	
	public static int firstMissingPositiveBruteForceUsingHashMap(int[] nums) {
		int firstMissingNum = 1;
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			 hm.put(i, nums[i]); 
		}
		for(int j=0;j<nums.length;j++) {
			if(hm.containsValue(firstMissingNum)) firstMissingNum++;
			else return firstMissingNum;
		}
		return firstMissingNum;
	}
	
	public static int firstMissingPositiveOptimal(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0)
				nums[i] = 0;
		}
		for (int j = 0; j < nums.length; j++) {
			if (Math.abs(nums[j]) < nums.length && Math.abs(nums[j]) > 1) {
				temp = Math.abs(nums[j]);
				if (nums[temp - 1] == 0)
					nums[temp - 1] = (nums.length + 1)*-1;
				else
					nums[temp - 1] *= -1;
			}
		}
		for (int k = 1; k < nums.length + 1; k++) {
//			if(nums[k-1]==1) {
//				return 2;
//			}
			if (nums[k - 1] >= 0)
				return k;
			else if (k == nums.length){
			    return( nums.length+1);
		}
		}

		return nums.length+1;
	}

}
