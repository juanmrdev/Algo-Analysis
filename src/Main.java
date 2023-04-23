import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Scanner;
@Retention(RetentionPolicy.RUNTIME)
@interface ValName {
    String value();
}

public class Main {
    static Scanner sc = new Scanner(System.in);
    static {
        System.out.print("Ingrese el número de filas y columnas: ");
    }
    static int n = sc.nextInt();

    static int count = 0;

    public static void main(String[] args) {

        @ValName("Matriz 1")
        int[][] A = new int[n][n];
        @ValName("Matriz 2")
        int[][] B = new int[n][n];
        int[][] C;

        fillMatrix(A, n);
        fillMatrix(B, n);

        C = Matrix.sumMatrix(A, B);

        System.out.println("La matriz resultado de la suma es:");
        Matrix.printMatrix(C);

        System.out.println("La matriz resultado de la multiplicacion es:");
        C = Matrix.multiplyMatrices(A, B);
        Matrix.printMatrix(C);

        sc.close();
    }

    public static void fillMatrix(int[][] matrix, int size) {
        count += 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los elementos de la matriz " + count + ":");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}