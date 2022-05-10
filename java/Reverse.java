import java.util.Scanner;

public class Reverse {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,i,j;
		
		System.out.print("Enter The length of Array : ");
		n = sc.nextInt();
		int [] A = new int[n];
		for (i = 0; i < n; i++){
			A[i] = sc.nextInt();
		}

		int [] New = new int[n];
		j = n - 1;

		for (i=0;i<n;i++){
			New[j] = A[i];
			j--;
		}

		for (j=0;j<n;j++){
			System.out.print(New[j] + ",");
		}
	}
}