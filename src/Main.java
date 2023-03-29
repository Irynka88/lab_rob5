public class Main {
    public static void main(String[] args) {
        //Task 1
        int[] arr = new int[50];
        int i = 0;
        for(int k = 1; i < 50; k += 2) {
            arr[i] = k;
            System.out.println(arr[i]);
            i++;
        }
    }
}