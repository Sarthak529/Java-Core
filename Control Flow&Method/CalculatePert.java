public class CalculatePert {
    static float CALCULATEPERCENTAGE(float a, int b) {
        float pert =( a / b)*100f;
        return pert;
    }

    static void main() {
        float result = CALCULATEPERCENTAGE(70 , 100);
        System.out.println("percentage :" +result);
    }
}
