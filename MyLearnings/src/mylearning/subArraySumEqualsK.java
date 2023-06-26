package mylearning;

import java.util.HashMap;

public class subArraySumEqualsK {

	public static void main(String[] args) {
       int[] nums = {0,0,0,0,0,0,0,0,0,0};
       int k = 0;
       System.out.println(subArraySumEqualsKOptimal(nums,k));

	}
	
	public static int subArraySumEqualsKBruteForce(int[] nums, int k) {
		int count = 0;
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum = sum+nums[i];
			if(sum==k) {
				sum=nums[i];
				count++;
			}else if(nums[i]==k) 
				count++;
		}
		return count;
	}
	
	public static int subArraySumEqualsKOptimal(int[] nums, int k) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(0, 1);
		int subArrayCount = 0;
		int sum = 0;
		int arrayCount = 0;
		int count = 1;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
			int val = sum-k;
			if(hm.containsKey(val)) {
				arrayCount = hm.get(val);
				subArrayCount += arrayCount;
			}
			if(hm.containsKey(sum)) {
				hm.put(sum,hm.get(sum)+1);
			}else { 
				hm.put(sum, count);
			}
		}
		return subArrayCount;
	}

}
