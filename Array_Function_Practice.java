public class Array_Function_Practice {

    static int minArray(int [] a){
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(min > a[i])
                min = a[i];
        }
        return min;
    }

    static double avgArray(int [][] a){
        double avg = 0;
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                avg += a[i][j];
                count++;
            }
        }
        return avg/count;
    }
    public static void main(String[] args) {
        int [] arr = {3,4,5,2,3};
        System.out.println("The minimum number in the array is: " + minArray(arr));

        int [][] arr2 = {{3,4,5,2,3}, {2,3,4,5,1}, {6,5,4,3,2}};
        System.out.println("The average for the is: " + avgArray(arr2));
    }
}
