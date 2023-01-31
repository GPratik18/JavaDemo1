public class PatternDemo7 {

	public static void main(String[] args) {
		int n=7;
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
			//R
			for (int j=0;j<n;j++) {
				if(		j==0 || j==n-1 && i<(n-1)/2 && i>0 ||
						i==0 && j<n-1|| i==(n-1)/2 && j<n-1||
						i-j==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print("  ");
			//A
			for(int j=0;j<n;j++) {
				if(j==0 && i>0 || i==0 && j>0 && j<n-1 || j==n-1 && i>0 || i==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//T
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//I
			for(int j=0;j<n;j++) {
				if(i==0 ||i==n-1 ||j==(n-1)/2) {
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
			System.out.print("    ");
			System.out.println();
		}
		System.out.println();
		System.out.println();
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
			//A
			for(int j=0;j<n;j++) {
				if(j==0 && i>0 || i==0 && j>0 && j<n-1 || j==n-1 && i>0 || i==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//N
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//D
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 && j<n-1 ||i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//U
			for(int j=0;j<n;j++) {
				if(j==0 && i<n-1||j==n-1 && i<n-1 || i==n-1 && j>0 && j<n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//R
			for (int j=0;j<n;j++) {
				if(		j==0 || j==n-1 && i<(n-1)/2 && i>0 ||
						i==0 && j<n-1|| i==(n-1)/2 && j<n-1||
						i-j==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print("  ");
			//A
			for(int j=0;j<n;j++) {
				if(j==0 && i>0 || i==0 && j>0 && j<n-1 || j==n-1 && i>0 || i==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//N
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//G
			for(int j=0;j<n;j++) {
				if(		j==0 && i>0 && i<n-1 ||
						i==0 && j>0 && j<n-1||
						i==n-1 && j>0 && j<n-1 ||
						j==n-1 && i<n-1 && i>0 && i<(n-1)/4 ||
						j==n-1 && i>(n-1)/2 && i<n-1 ||
						i==(n-1)/2 && j>(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(		j==0 && i>0 && i<n-1 ||
						i==0 && j>0 && j<n-1||
						i==n-1 && j>0 && j<n-1 ||
						j==n-1 && i<n-1 && i>0 && i<(n-1)/4 ||
						j==n-1 && i>(n-1)/2 && i<n-1 ||
						i==(n-1)/2 && j>(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//H
			for(int j=0;j<n;j++) {
				if(j==0||j==n-1|| i==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//U
			for(int j=0;j<n;j++) {
				if(j==0 && i<n-1||j==n-1 && i<n-1 || i==n-1 && j>0 && j<n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//T
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 || i==n-1 || i==(n-1)/2 && j<n-2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			System.out.println();
		}
	}

}
