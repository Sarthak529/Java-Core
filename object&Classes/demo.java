
class claculator{
    public int add(int a, int b){
        int r = a + b;
        return r;
    }
}
public class demo {
    public static void main(String[] args) {
        claculator calc = new claculator();
        int result = calc.add(5, 3);
        System.out.println(result);
    }
}
