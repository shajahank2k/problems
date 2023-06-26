package mylearning;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		int[] nums = {-7,-3,2,3,11};
		//int[] ans = squaresOfSortedArrayBruteForce(nums);
		int[] ans = squaresOfSortedArrayLeetCode(nums);
		for(int answer : ans) {
			System.out.println(answer);
		}
		

	}
	
	public static int[] squaresOfSortedArrayBruteForce(int[] nums) {
		int[] square = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			 square[i] = nums[i]*nums[i];
		}
		for(int i=0;i<square.length-1;i++) {
			for(int j=i+1;j<square.length;j++) {
				if(square[i]>square[j]) {
					int temp = square[i];
					square[i] = square[j];
					square[j] = temp;
				}
			}
		}
		return square;
	}
	
	public static int[] squaresOfSortedArrayOptimal(int[] nums) {
		int p1 = 0;
		int p2 = nums.length-1;
		for(int i=0;i<nums.length;i++) {
			nums[i] *= nums[i];
		}
		while(p1<p2) {
			if(nums[p1]>nums[p2]) {
				int temp = nums[p1];
				nums[p1] = nums[p2];
				nums[p2] = temp;
				p2--;
			}else if(nums[p1]<nums[p2]) {
				p1++;
			}
			
		}
		return nums;
	}
	
	public static int[] squaresOfSortedArrayLeetCode(int[] nums) {
		int p1 = 0;
		int p2 = nums.length-1;
		int[] resArray = new int[nums.length];
		int count = nums.length-1;
		for(int i=0;i<nums.length;i++) {
			nums[i] *= nums[i];
		}
		while(p1<p2) {
			if(nums[p1]<nums[p2]) {
				resArray[count] = nums[p2];
				count--;
				p2--;
			}else if(nums[p1]>nums[p2]) {
				resArray[count] = nums[p1];
				count--;
				p1++;
			}else if(nums[p1] == nums[p2]){
				resArray[count] = nums[p1];
				resArray[count-1] = nums[p2];
				count = count - 2;
				p1++;
				p2--;
			}
		}
		if(nums[p1] == nums[p2]) {
			resArray[0] = nums[p1];
		}
		return resArray;
	}

}
