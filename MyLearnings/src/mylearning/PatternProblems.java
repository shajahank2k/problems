package mylearning;

public class PatternProblems {

	public static void main(String[] args) {

		int n = 4;
		// fiveStarPattern(n);
		// printingStarInIncreasingOrder(n);
		// printingStarInDecreasingOrder(n);
		// printingDiamondInsideStarPattern(n);
		// printingStarPattern02(n);
		// printingOutLoopPattern(n);
		// printCrossPattern(n);
		// hollowTriangle(n);
		//CrossInsideRectanglePattern(n);
		//numberSquarePattern(n);
		numberSquarePatternTest(n);

	}

	public static void fiveStarPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printingStarInIncreasingOrder(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printingStarInDecreasingOrder(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = n - 1; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printingDiamondInsideStarPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print(" ");
			}
			for (int k = n; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int l = n - 1; l > i; l--) {
				System.out.print(" ");
			}
			for (int m = n - 1; m > i; m--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printingStarPattern02(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int l = n - 1; l > i; l--) {
				System.out.print(" ");
			}
			for (int m = n - 1; m > i; m--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print(" ");
			}
			for (int k = n; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printingOutLoopPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - 2; j > i; j--) {
				System.out.print("*");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print(" ");
			}
			for (int m = n - 2; m > i; m--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void printCrossPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + 1; j++) {
				if (n % 2 != 0) {
					if (i == j || i + j == n + 1) {
						System.out.print(i);
					} else {
						System.out.print(" ");
					}
				} else {
					if (i == j || i + j == n + 2) {
						System.out.print(i);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

	public static void hollowTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == j || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void CrossInsideRectanglePattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n || i == j || (i + j) == n + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
	
	public static void numberSquarePattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==n||j==n) {
					System.out.print(4);
				}else {
					if(i==2||j==2||i==n-1||j==n-1) {
						System.out.print(3);
					}else {
						if(i==3||j==3||i==n-2||j==n-2) {
							System.out.print(2);
						}else {
							if(i==4||j==4||i==n-3||j==n-3) {
								System.out.print(1);
							}
						}
					}
				}
			}
			System.out.println();
		}
	}
	
	public static void numberSquarePatternTest(int n) {
		for(int i=1;i<=n+3;i++) {
			for(int j=1;j<=n+3;j++) {
				if(i==1||j==1||i==n||j==n) {
					System.out.print(4);
				}else {
					if(i==2||j==2||i==n-1||j==n-1) {
						System.out.print(3);
					}else {
						if(i==3||j==3||i==n-2||j==n-2) {
							System.out.print(2);
						}else {
							if(i==4||j==4||i==n-3||j==n-3) {
								System.out.print(1);
							}
						}
					}
				}
			}
			System.out.println();
		}
	}

}
