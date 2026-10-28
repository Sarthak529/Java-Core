void main() {
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        IO.println("Provide input for index" + i);
        arr[i] = sc.nextInt();
    }
    for (int val : arr) {
        IO.print(val + " ");
    }
}
