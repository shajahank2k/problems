package mylearning;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		// int[] res = rotateArrayBruteForce(nums,k);
		rotateArrayOptimal(nums, k);
		for (int ans : nums) {
			System.out.print(ans + " ");
		}
	}

	public static int[] rotateArrayBruteForce(int[] nums, int k) {
		int[] res = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			res[(i + k) % nums.length] = nums[i];
		}
		return res;
	}

	public static void rotateArrayOptimal(int[] nums, int k) {
		int p1 = 0;
		int p2 = nums.length - 1;
		while (p1 <= p2) {
			swap(nums, p1, p2);
			p1++;
			p2--;
		}
		int pivot = k % nums.length;
		p1 = 0;
		p2 = pivot - 1;
		while (p1 <= p2) {
			swap(nums, p1, p2);
			p1++;
			p2--;
		}
		p1 = pivot;
		p2 = nums.length - 1;
		while (p1 <= p2) {
			swap(nums, p1, p2);
			p1++;
			p2--;
		}
	}

	public static void swap(int[] nums, int p1, int p2) {
		int temp = nums[p1];
		nums[p1] = nums[p2];
		nums[p2] = temp;
	}

}
