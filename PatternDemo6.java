public class PatternDemo6 {
	public static void main(String[] args) {
		int n=9;
		for (int i=0;i<n;i++) {
			//P
			for (int j=0;j<n;j++) {
				if(j==0 || j==n-1 && i<(n-1)/2 && i>0 || i==0 && j<n-1|| i==(n-1)/2 && j<n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//W
			for (int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i+j==n-1 && i>(n-1)/2 || i==j && i>(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("     ");
			//S
			for (int j=0;j<n;j++) {
				if(		i==0 && j<n-1 && j>0 ||
						i==n-1 && j<n-1 && j>0 ||
						j==0 && i>0 && i<(n-1)/2 ||
						j==n-1 && i<n-1 && i>(n-1)/2 ||
						i==(n-1)/2 && j<n-1 && j>0 ||
						j==0 && i>3*(n)/4 && i<n-1 ||
						j==n-1 && i>0 && i<(n-1)/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//K
			for (int j=0;j<(n/2)+1;j++) {
				if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//I
			for (int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//L
			for (int j=0;j<n;j++) {
				if(j==0 || i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//L
			for (int j=0;j<n;j++) {
				if(j==0 || i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//S
			for (int j=0;j<n;j++) {
				if(		i==0 && j<n-1 && j>0 ||
						i==n-1 && j<n-1 && j>0 ||
						j==0 && i>0 && i<(n-1)/2 ||
						j==n-1 && i<n-1 && i>(n-1)/2 ||
						i==(n-1)/2 && j<n-1 && j>0 ||
						j==0 && i>3*(n)/4 && i<n-1 ||
						j==n-1 && i>0 && i<(n-1)/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
