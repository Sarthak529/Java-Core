public class HourglassShape {
    static void main() {
        int n = 4;
        for(int row=1;row<=n;row++) {
//            for spaces
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }
//            for stars
            for(int col = 1; col <= 2*n  - 2*row + 1  ; col++) {
                    System.out.print("* ");

            }
            System.out.println();
        }
        for(int row=2;row<=n;row++) {
//            for spaces
            for (int col = 1; col <= n - row; col++) {

                System.out.print("  ");
            }
//            for stars
            for(int col = 1; col <= 2*row -1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
