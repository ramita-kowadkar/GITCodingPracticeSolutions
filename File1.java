package GITPractice;

import java.util.Scanner;

public class File1 {
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        String snum = in.next();
        char []nums = snum.toCharArray();
        int []numArray = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            numArray[i] = Integer.parseInt(String.valueOf(nums[i]));
        }
        for(int i=0 ; i<numArray.length ; i++){
            if(numArray[i] == 9)
                numArray[i] = 0;
            else
                numArray[i] += 1;
        }
        for(int i=0 ; i<numArray.length ; i++){
            System.out.print(numArray[i]);
        }
        System.out.println("");

    }
}
