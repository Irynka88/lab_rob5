public class Sixth {
    public static void main(String[] args) {
        int[][] arr = new int[][]{new int[5], new int[5], new int[5], new int[5], new int[8], new int[8], new int[8], new int[8], new int[3], new int[3], new int[3], new int[3], new int[9], new int[9], new int[9]};

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = (int)(Math.random() * 16.0);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
