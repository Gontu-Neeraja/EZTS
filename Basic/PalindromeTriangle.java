package Basic;

public class PalindromeTriangle {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; ++i) {
            for (int j = rows; j > i; --j) {
                System.out.print("  ");
            }
            int k;  
            for (k = 0; k < i; ++k) {
                System.out.print((i + k) + " ");
            }
            for (int l = i + k - 2; l >= i; --l) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
