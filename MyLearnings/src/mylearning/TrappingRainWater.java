package mylearning;

public class TrappingRainWater {

	public static void main(String[] args) {
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		//System.out.println(waterProblem(arr));
		//System.out.println(waterProblemBruteForce(arr));
		//System.out.println(trapWaterBruteForce(arr));
		System.out.println(trapWaterOptimal(arr));

	}
	
	public static int waterProblem(int arr[]) {
		int sum = 0;
		for(int i=1;i<arr.length-1;i++) {
			int left = 0;
			int right = 0;
			for(int j=i-1;j>=0;j--) {
				left = Math.max(left, arr[j]);
			}
			for(int k=i+1;k<arr.length;k++) {
				right = Math.max(right, k);
			}
			sum = Math.min(left, right)-arr[i];
			
		}
		return sum;
	}
	
	public static int waterProblemBruteForce(int[] height) {
		int sum = 0;
		int p1 = 0;
		int p2 = height.length - 1;
		int maxHeight_left = 0;
		int maxHeight_right = 0;
		int index = 0;
		int index2 = 0;
		while (p1 <= p2) {
			if (height[p1] > maxHeight_left) {
				maxHeight_left = height[p1];
				index = p1;
			}
			if (height[p2] > maxHeight_right) {
				maxHeight_right = height[p2];
				index2 = p2;
			}
			p1++;
			p2--;
		}
		int minVal = Math.min(maxHeight_right, maxHeight_left);
		for (int i = index+1; i < index2; i++) {
            sum = sum+(Math.abs(height[i]-minVal));
		}
		return sum;
	}
	
	public static int trapWaterBruteForce(int[] height) {
		int sum = 0;
		int totalSum = 0;
		for (int i = 1; i < height.length; i++) {
			int max_left = 0;
			int max_right = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (height[j] > max_left) {
					max_left = height[j];
				}
			}
			for (int k = i + 1; k < height.length; k++) {
				if (height[k] > max_right) {
					max_right = height[k];
				}
			}
			sum = Math.min(max_right, max_left) - height[i];
			if(sum>0) {
				totalSum += sum;
			}
		}
		return totalSum;
	}
	
	public static int trapWaterOptimal(int[] height) {
		int totalWater = 0;
		int water = 0;
		int maxLeft = 0;
		int maxRight = 0;
		int p1 = 0;
		int p2 = height.length - 1;
		while (p1 != p2) {
			if (height[p1] >= height[p2]) {
				if (height[p2] > maxRight) {
					maxRight = height[p2];
				}
				water = maxRight - height[p2];
				if (water > 0) {
					totalWater += water;
				}
				p2--;
			} else if (height[p1] <= height[p2]) {
				if (height[p1] > maxLeft) {
					maxLeft = height[p1];
				}
				water = maxLeft - height[p1];
				if (water > 0) {
					totalWater += water;
				}
				p1++;
			} 
		}
		return totalWater;
	}

}
