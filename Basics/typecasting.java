public class typecasting {
    public static void main(String[] args) {
        int num1 = 5;
        double d = 5.5d;

        // Implicit typecasting
        double result1 = num1 + d;
        System.out.println("Result of implicit typecasting: " + result1);

        // Explicit typecasting
        int result2 = (int) d + num1;
        System.out.println("Result of explicit typecasting: " + result2);
    }
}
