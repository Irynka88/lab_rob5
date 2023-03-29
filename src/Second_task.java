public class Second_task {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10.0);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 1; i< arr.length ; i += 2){
            arr[i]=0;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }





    }
}