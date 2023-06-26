package mylearning;

public class MostWaterContains {

	public static void main(String[] args) {
		int[] height = {1,1};
        System.out.println(mostWaterContainsOptimal(height));
	}
	
	public static int mostWaterContainsBruteForce(int[] height) {
		
		int maxArea = 0;
		for(int i=0;i<height.length;i++) {
			for(int j=i+1;j<height.length;j++) {
				int area = Math.min(height[i],height[j])*j;
				if(area>maxArea) {
					maxArea = area;
				}
			}
		}
		return maxArea;
	}
	
	public static int mostWaterContainsOptimal(int[] height) {
		
		int p1=0;
		int p2=height.length-1;
		int maxArea = 0;
		int area = 0;
		while(p1<=p2) {
			area = Math.min(height[p1], height[p2])*(Math.abs(p1-p2));
			if(area>maxArea) {
				maxArea = area;
			}
			if(height[p1]<height[p2]) p1++;
			else if(height[p1]>height[p2])p2--;
			else if(height[p1]==height[p2]) {
				p1++; 
				p2--;
			}
		}
		return maxArea;
	}

}
