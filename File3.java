
package GITPractice;

import java.util.Scanner;

public class File3 {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        String snum = in.next();
        char []nums = snum.toCharArray();
        System.out.println("Number of digits are : " + nums.length);
        System.out.println("");
    }
}
