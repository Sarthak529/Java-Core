public class Opposite {
    static void main() {
        int n=5;
        for(int row=1;row<=n;row++) {
            for(int col=1;col<=row ;col++) {
               int letter = n - col + 'A';
               char ans = (char)letter;

                System.out.print(ans + " " );
            }
            System.out.println();
        }

    }
}
