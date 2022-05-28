
package GITPractice;

import java.util.*;

public class File15 {
    
    public static void format(int []arr){
        int i , j , n;
        n = arr.length / 2;
        for(i=0 ; i<n ; i++){
            for(j=i+1 ; j<n ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(i=n ; i<arr.length ; i++){
            for(j=i+1 ; j<arr.length ; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After formatting array is : ");
        for(i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in an array : ");
        int n = s.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = s.nextInt();
        }
        format(arr);
    }
}
