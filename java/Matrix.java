import java.util.Scanner;
class Matrix {

    public static int[][] CreateM() {
	  Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
		    System.out.print("M["+i+"]["+j+"]:");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

public static void DisplayM(int[][] M) {
        System.out.print("\nMatrix Values \n");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

public static void main(String[] args) {
        int Matrix[][];
        int i, j, cnt;
	  
        Matrix = CreateM();
        DisplayM(Matrix);

        System.out.println("\nRows Having ODD no of 1s");
        for (i = 0; i < 6; i++) {
            cnt = 0;
            for (j = 0; j < 6; j++) {
                if (Matrix[i][j] == 1) {
                    cnt++;
                }
            }

            if (cnt % 2 != 0) {
                System.out.println("Row - " + (i + 1) + " have ODD no of 1s");
            }
        }

        System.out.println("\nColumns Having ODD no of 1s");
        for (i = 0; i < 6; i++) {
            cnt = 0;
            for (j = 0; j < 6; j++) {
                if (Matrix[j][i] == 1) {
                    cnt++;
                }
            }
            if (cnt % 2 != 0) {
                System.out.println("Column - " + (i + 1) + " have ODD no of 1s");
            }
        }
    }
}