package GITPractice;

import java.util.Scanner;

public class File2 {
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
        System.out.println(numArray[0] + " * 1000 = " + numArray[0]*1000);
        System.out.println(numArray[1] + " * 100 = " + numArray[1]*100);
        System.out.println(numArray[2] + " * 10 = " + numArray[2]*10);
        System.out.println(numArray[3] + " * 1 = " + numArray[3]);
        System.out.println("");
    }
}
