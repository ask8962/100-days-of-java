package lab_code;
import java.util.Arrays;

public class minmax {
    public static void main(String[] args) {
        int[] arr = {1,5,85,21,96,14,53};
        // Arrays.sort(arr);
        // System.out.println("Minimum element:"+arr[0]);
        // System.out.println("Maximum element:"+arr[arr.length-1]);

        //2nd method
        // for(int i =0;i<arr.length-1;i++){
        //     for(int j =0;j<arr.length-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // System.out.println("Minimum element:"+arr[0]);
        // System.out.println("Maximum element:"+arr[arr.length-1]);

        //3rd 
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Minimum element:"+min);
        System.out.println("Maximum element:"+max);
    }
}
