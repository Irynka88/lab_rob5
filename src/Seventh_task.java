public class Seventh_task {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];

        int k;
        for(int i = 0; i < arr.length; i++) {
            for(k = 0; k < arr[i].length; k++) {
                arr[i][k] = (int)(Math.random() * 7.0);
                System.out.print(arr[i][k] + " ");
            }

            System.out.println(" ");
        }

        System.out.println();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;

        for(k = 0; k < 7; k++) {
            sum1 += arr[0][k];
            sum2 += arr[1][k];
            sum3 += arr[2][k];
            sum4 += arr[3][k];
            sum5 += arr[4][k];
            sum6 += arr[5][k];
            sum7 += arr[6][k];
        }

        if (sum1 > sum2 && sum1 > sum3 && sum1 > sum4 && sum1 > sum5 && sum1 > sum6 && sum1 > sum7) {
            System.out.println("Сума 1-ої стрічки найбільша");
        }

        if (sum2 > sum1 && sum2 > sum3 && sum2 > sum4 && sum2 > sum5 && sum2 > sum6 && sum2 > sum7) {
            System.out.println("Сума 2-ої стрічки найбільша");
        }

        if (sum3 > sum1 && sum3 > sum2 && sum3 > sum4 && sum3 > sum5 && sum3 > sum6 && sum3 > sum7) {
            System.out.println("Сума 3-ої стрічки найбільша");
        }

        if (sum4 > sum1 && sum4 > sum3 && sum4 > sum2 && sum4 > sum5 && sum4 > sum6 && sum4 > sum7) {
            System.out.println("Сума 4-ої стрічки найбільша");
        }

        if (sum5 > sum1 && sum5 > sum3 && sum5 > sum4 && sum5 > sum2 && sum5 > sum6 && sum5 > sum7) {
            System.out.println("Сума 5-ої стрічки найбільша");
        }

        if (sum6 > sum1 && sum6 > sum3 && sum6 > sum4 && sum6 > sum5 && sum6 > sum2 && sum6 > sum7) {
            System.out.println("Сума 6-ої стрічки найбільша");
        }

        if (sum7 > sum1 && sum7 > sum3 && sum7 > sum4 && sum7 > sum5 && sum7 > sum6 && sum7 > sum2) {
            System.out.println("Сума 7-ої стрічки найбільша");
        }

    }
}
