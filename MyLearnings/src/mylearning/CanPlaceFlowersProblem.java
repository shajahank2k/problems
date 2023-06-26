package mylearning;

public class CanPlaceFlowersProblem {

	public static void main(String[] args) {
		int[] nums = {0};
		int n = 1;
		//System.out.print(canPlaceFlowerBruteForce(nums,n));
//		System.out.print(canPlaceFlowerOptimal(nums,n));
		System.out.print(canPlaceFlowerMostOptimal(nums,n));
	}
	
	public static boolean canPlaceFlowerBruteForce(int[] nums, int n) {
		for (int i = 0; i < nums.length - 3; i += 2) {
				if (n == 0)
					break;
				if (nums[i] == 1) {
					if (nums[i + 2] == 0 && nums[i + 3] == 0) {
						nums[i + 2] = 1;
						n--;
					}
				}else {
					if(nums[i+1] == 0) {
						nums[i] = 1;
						n--;
					}
				}
			}
		if (n == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean canPlaceFlowerMostOptimal(int[] nums, int n) {
		for (int i = 0; i < nums.length; i++) {
				if (n == 0)
					break;
				if(nums[i]==0) {
				if(i==0||nums[i-1]==0) {
					if(i==nums.length-1||nums[i+1]==0) {
						nums[i] = 1;
						n--;
					}
				}
				}
		}
		if (n == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean canPlaceFlowerOptimal(int[] flowerbed, int n) {
		for(int p1=0;p1<flowerbed.length;p1++) {
		if(flowerbed[p1]==0) {
		for(int p2 = p1+1; p2<flowerbed.length-2; p2++) {
				if(p2==0&&p2+1==0) {
					flowerbed[p1]=1;
					n--;
				}
		}
		}else {
			for(int p2 = p1+1; p2<flowerbed.length-2; p2++) {
				if(p2+1==0&&p2+2==0) {
					flowerbed[p1]=1;
					n--;
				}
		}
		}
		}
		return false;
	}

}
