public class GetMaximum {
    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    static void main() {
        int max = maximum(3, 4);
        System.out.println("Larger between them :" +max);
    }
}
