public class Q30 {
    public static void main(String[] args) {
        int[][] m = {{-1, 0, 2}, {-3, -1, 6}, {4, 3, -1}};
        int[][] mplusn = {{-6, 9, 4}, {4, 5, 0}, {1, -2, -3}};

        // both m and mplusn are double dimensional arrays having dimensions 3 x 3
        // Therefore, n has the same dimesnions
        int[][] n = new int[3][3];
        
        // the below nested loop determines n by using the same technique as used in matrix subtraction
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 // calculate the value by subtracting the element of m from the corresponding element of mplusn
                int val = mplusn[i][j] - m[i][j];
                // store this value back into n
                n[i][j] = val;
            }
        }

        // nested loop to display n
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }

    }
}
