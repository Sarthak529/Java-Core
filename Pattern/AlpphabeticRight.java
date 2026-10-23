public class AlpphabeticRight {
    public static void main(String[] args) {
        int n= 5;
        for(int row=1;row<=n;row++) {
            for(int col=1;col<=row ;col++) {
//                int a = col;
//                int b = ('A' - 1);
//                int ans = a + b;
               int ans = (col + 64);
                char letter = (char)ans;
                System.out.print(letter + " " );
            }
            System.out.println();
        }

    }
}
