public class RegularAlphabeticPyramid {
    public static void main(String[] args) {
        int n=4;
        for(int row = 1;row <= n;row++){
            for(int col = 1;col <= n-row;col++){
                System.out.print("  ");
            }
            for(int col = 1;col <= row ;col++){
                int ans = ( col + 64);
                char ch = (char)ans;
                System.out.print(ch + "  " );
            }
            char toprint = (char)(row + 'A' - 2);
            for(int col = 1;col <= row - 1;col++){
                System.out.print( toprint+"  ");
                toprint--;
            }
            System.out.println();
        }

    }
}
