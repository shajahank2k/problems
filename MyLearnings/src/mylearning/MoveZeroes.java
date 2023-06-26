package mylearning;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = {4,2,4,0,0,3,0,5,1,0};
		moveZeroesBruteForce(nums);
		for(int ans : nums) {
			System.out.println(ans);
		}
	}
	
	public static void moveZeroesBruteForce(int[] nums) {
		int p1 = 0;
		int p2 = p1+1;
		while(p1<nums.length && p2<nums.length) {
			if(nums[p1]!=0) {
				p1++;
				p2 = p1+1;
			}else if(nums[p2]==0) {
				p2++;
			}
			if(p1<nums.length && p2<nums.length && nums[p1]==0&&nums[p2]!=0) {
				int temp = nums[p1];
				nums[p1] = nums[p2];
				nums[p2] = temp;
				p1++;
				p2++;
			} 
			
		}
	}

}
