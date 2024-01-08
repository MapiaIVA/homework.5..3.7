public class Main {

    public static void main(String[] args) {
        int n = 4; // размер массива
        int[][] array = new int[n][n];
        int value = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = value;
                    value++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    array[i][j] = value;
                    value++;
                }
            }
        }

        printArray(array);
    }

    public static void printArray(int[][] array) {
        int n = array.length;

        int maxValue = n * n;
        int numDigits = String.valueOf(maxValue).length();

        for (int[] row : array) {
            for (int value : row) {
                String format = "%" + numDigits + "d";
                System.out.printf(format, value);
            }
            System.out.println();
        }
    }
}