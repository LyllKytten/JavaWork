import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                matrix[i][j] = matrix[i][j] + matrix[i][matrix.length-1];
                matrix[i][matrix.length-1] = matrix[i][j] - matrix[i][matrix.length-1];
                matrix[i][j] = matrix[i][j] - matrix[i][matrix.length-1];
            }
        }

        for (var mas : matrix) {
            for (var num : mas) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }
}