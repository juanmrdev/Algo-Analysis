public class RecursiveFunctions {

    public boolean searchString(String x, String y) {
        if (x.length() == 0) {
            return true;
        }

        if (y.length() < x.length()) {
            return false;
        }

        if (y.startsWith(x)) {
            return true;
        }

        return searchString(x, y.substring(1));
    }


    public int[][] sumMatrix(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        sumMatrixRecursive(matrix1, matrix2, result, 0, 0);

        return result;
    }

    private void sumMatrixRecursive(int[][] matrix1, int[][] matrix2, int[][] result, int row, int column) {
        if (row == matrix1.length) {
            return;
        }

        result[row][column] = matrix1[row][column] + matrix2[row][column];

        if (column == matrix1[0].length - 1) {
            sumMatrixRecursive(matrix1, matrix2, result, row + 1, 0);
        } else {
            sumMatrixRecursive(matrix1, matrix2, result, row, column + 1);
        }
    }
}
