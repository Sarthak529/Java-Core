public class MethodOverloadding {
    static int add(int a,int b){
        int sum = a +b;
        return sum;
    }
    static int add(int r,int q,int p){
        int ans = p+q+r;
        return ans;
    }

    static void main() {
        int ans1 = add(1,2);
        int ans2 = add(3,4,4);
        System.out.println("ans1;" +ans1);
        System.out.println("ans2"+ans2);
    }
}
