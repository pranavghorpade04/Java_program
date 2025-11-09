import java.util.Scanner;

public class MatricesAddition {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MatricesAddition m1 = new MatricesAddition();
        System.out.println("Enter number of colum:");
        int c = in.nextInt();
        System.out.println("Enter number of rows: ");
        int r = in.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int sum[][] = new int[r][c];

        System.out.println("Enter the value of 1st matrics row wise: ");
        m1.MatrixInput(r,c,a);
        System.out.println("Enter the value of 2nd matrics row wise: ");
        m1.MatrixInput(r,c,b);

        m1.MatrixSum(r,c,a,b,sum);

        System.out.println("addition of matrices is : ");
        m1.Display(r,c,sum);

    }

    void MatrixInput(int r,int c,int a[][]){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                 a[i][j]= in.nextInt();
            }
        }
    }

    void MatrixSum(int r,int c,int a[][],int b[][],int sum[][]){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
    }

    void Display(int r,int c ,int a[][]){
        for (int i = 0; i < r; i++) {
            System.out.println();
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
    }


}
