import java.util.Scanner;
public class MatrixMult {
    public static double[][] multiplyMatrices(double[][] firstMatrix, double[][]
            secondMatrix,int n,int m,int y) {
        double[][] matrix = new double[n][y];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < m; k++) {
                    matrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(double[][] matrix) {
        System.out.print("Matrix:\n ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println("\n");
        }
    }

    public static double[][] fillMatrix(int n, int m){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the matrix:\n");
            double[][] matrix = new double[n][m];
            for (int i=0; i < n; i++){
                for (int j=0; j < m; j++){
                    matrix[i][j] = scanner.nextDouble();
                }
            }
            return matrix;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first matrix length:");
        int m = scanner.nextInt();
        System.out.println("Enter the first matrix width:");
        int n = scanner.nextInt();
        double[][] firstMatrix = fillMatrix(n,m);
        System.out.println("Enter the second matrix length:");
        int y = scanner.nextInt();
        System.out.println("Enter the second matrix width:");
        int x = scanner.nextInt();
        double[][] secondMatrix = fillMatrix(x,y);
        if (m!=x){
            System.out.println("You can't multiply those matrices");
            System.exit(0);
        }
        else{
            printMatrix(multiplyMatrices(firstMatrix,secondMatrix,n,m,y));
        }
        }
    }


