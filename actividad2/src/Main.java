import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Scanner;

@Retention(RetentionPolicy.RUNTIME)
@interface ValName {
    String value();
}

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    static int count = 0;

    public static void main(String[] args) {
        RecursiveFunctions recursive = new RecursiveFunctions();
        String string1 = "";
        String string2 = "Esta es una cadena de prueba";

        boolean result = recursive.searchString(string1, string2);
        System.out.println("¿Se encontró la cadena '" + string1 + "' dentro de '" + string2 + "'? " + ((result) ? "Es correcto" : "Incorrecto"));

        System.out.print("Ingresa un valor booleano (true/false): ");
        boolean input = scanner.nextBoolean();

        if(input){
            Matrix matrixIterative = new Matrix();
            int n = getMatrixSizeFromUser();

            @ValName("Matriz 1")
            int[][] A = new int[n][n];
            @ValName("Matriz 2")
            int[][] B = new int[n][n];
            int[][] C;

            fillMatrix(A, n);
            fillMatrix(B, n);

            long startTimeRecursive = System.nanoTime();

            C = recursive.sumMatrix(A, B);

            long endTimeRecursive = System.nanoTime();
            double elapsedTimeRecursive = (endTimeRecursive - startTimeRecursive) / 1_000_000.0;;

            long startTimeIterative = System.nanoTime();

            matrixIterative.sumMatrix(A, B);

            long endTimeIterative = System.nanoTime();
            double elapsedTimeIterative = (endTimeIterative - startTimeIterative) / 1_000_000.0;;

            System.out.println("La matriz resultado de la suma es:");
            matrixIterative.printMatrix(C);

            System.out.printf("\nLa solucion recursiva tarda: %.5f milisegundos%n", elapsedTimeRecursive);
            System.out.printf("\nMientras que la solucion iterativa tarda: %.5f milisegundos%n", elapsedTimeIterative);

            System.out.println("\nSe puede concluir que la solucion mas efectiva es la "+
                    ((elapsedTimeRecursive>elapsedTimeIterative) ? "Iterativa." : "Recursiva."));

        } else System.exit(0);
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