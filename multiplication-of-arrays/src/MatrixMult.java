import java.util.Scanner;

public class MatrixMult {

    public static double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {

        int n = firstMatrix.length; // rows
        int n1 = secondMatrix.length; // rows
        int m = firstMatrix[0].length; //columns
        int y = secondMatrix[0].length; //columns
        //rows 2==columns1
        if (m != n1) {
            System.out.println("Multiplication is impossible: the number of columns of the first matrix (\" m \") " + "" +
                    "must match the number of rows of the second matrix (\"m2\").");
            return null;
        }
        else {

            double[][] resultMatrix = new double[n][y];


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < y; j++) {
                    for (int k = 0; k < m; k++) {
                        resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                    }
                }
            }

            return resultMatrix;
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] fillMatrix(int rows, int cols) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[rows][cols];

        System.out.println("Insert elements of matrix (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the amount of rows and columns of first matrix:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println("Insert the amount of rows and columns of second matrix:");
        int m2 = scanner.nextInt();
        int y = scanner.nextInt();


        double[][] firstMatrix = fillMatrix(n, m);

        double[][] secondMatrix = fillMatrix(m2, y);


        System.out.println("Result:");
        printMatrix(multiplyMatrices(firstMatrix, secondMatrix));
    }
}