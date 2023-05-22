import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Scanner;
@Retention(RetentionPolicy.RUNTIME)
@interface ValName {
    String value();
}

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    static int n = getMatrixSizeFromUser();
    static int count = 0;
    public static void main(String[] args) {

        Matrix matrix = new Matrix();
//
        @ValName("Matriz 1")
        int[][] A = new int[n][n];
        @ValName("Matriz 2")
        int[][] B = new int[n][n];
        int[][] C;

        fillMatrix(A, n);
        fillMatrix(B, n);

        C = matrix.sumMatrix(A, B);

        System.out.println("La matriz resultado de la suma es:");
        matrix.printMatrix(C);

        System.out.println("La matriz resultado de la multiplicacion es:");
        C = matrix.multiplyMatrices(A, B);
        matrix.printMatrix(C);

        scanner.close();
    }

    private static int getMatrixSizeFromUser() {
        System.out.print("Ingrese el número de filas y columnas: ");
        return scanner.nextInt();
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