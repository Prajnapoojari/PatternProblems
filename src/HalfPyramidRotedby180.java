public class HalfPyramidRotedby180 {
    public static void main(String[] args) {
        int n = 4;  // You can change 'n' to get different sizes

        for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");  // Two spaces for better alignment
            }
            // Printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
