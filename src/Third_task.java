public class Third_task {

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        for(int i = 0; i< arr1.length; i++){
            arr1[i]=(int)(Math.random()*6.0);
            s1 += arr1[i];
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        int[] arr2 = new int[5];
        for(int i = 0; i< arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 6.0);
            s2 += arr2[i];
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        int[] arr3 = new int[5];
        for(int i = 0; i< arr3.length; i++) {
            arr3[i] = (int) (Math.random() * 6.0);
            s3 += arr3[i];
            System.out.print(arr3[i] + " ");
        }
        double m1 = (double)s1 / 5.0;
        double m2 = (double)s2 / 5.0;
        double m3 = (double)s3 / 5.0;
        System.out.println();
        if(m1>m2 && m1>m3){
            System.out.println("Середнє значення 1-го масиву найбільше");
        }
        if(m2>m1 && m2>m3){
            System.out.println("Середнє значення 2-го масиву найбільше");
        }
        if (m3>m1 && m3>m2){
            System.out.println("Середнє значення 3-го масиву найбільше");
        }
        if (m1==m2 && m1==m3){
            System.out.println("Середнє значення всіх масивів рівні");
        }
        if (m1==m2){
            System.out.println("Середнє значення 1-го та 2-го масивів найбільші та рівні");
        }
        if (m1==m3){
            System.out.println("Середнє значення 1-го та 3-го масивів найбільші та рівні");
        }
        if (m2==m3){
            System.out.println("Середнє значення 2-го і 3-го масивів найбільші та рівні");
        }

    }
}