import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        int[][] a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row:");
        int r = sc.nextInt();
        System.out.print("Enter the column:");
        int c = sc.nextInt();
        a = new int[c][r];

        for (int i = 0; i < c; i++) {
            System.out.println("Enter the row " + (i + 1) + " elements: ");
            for (int j = 0; j < r; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("New matrix");

        for (int i = 0; i < r; i++) {
            for (int j = c - 1; j >= 0; j--) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
