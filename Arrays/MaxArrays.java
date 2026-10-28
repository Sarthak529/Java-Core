public class MaxArrays {
    static void main() {
        int arr[] = { 3 , 2 ,-5,15 , 10 ,21};
        int n = arr.length;
        int maxValue = arr[0];
        for(int i=0;i<=n-1;i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }

        }
        System.out.println("Maximum value is "+maxValue);
    }
}
