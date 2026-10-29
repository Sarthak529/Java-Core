public class arrays2d {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int[][] brr = {
                {1,2},
                {3,4},
                {5,6},
                {7,8},

        };
        int rowlength = brr.length;
        int collength = brr[0].length;
        for(int i=0;i<=rowlength - 1;i++){
            for(int j=0;j<=collength-1;j++){
                System.out.println(brr[i][j]);
            }
            System.out.println();
        }
    }
}
