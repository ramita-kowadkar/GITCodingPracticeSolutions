
package GITPractice;

import java.util.Arrays;
import java.util.Scanner;

public class File6 {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of names : ");
        int n = in.nextInt();
        String names[] = new String[n];
        System.out.println("\nEnter the names : ");
        for(int i=0 ; i<n ; i++){
            names[i] = in.next();
        }
        Arrays.sort(names);
        System.out.println("\nNames in sorted order : ");
        for(int i=0 ; i<n ; i++){
            System.out.println(names[i]);
        }
    }
}
