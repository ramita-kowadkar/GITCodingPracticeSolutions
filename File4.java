package GITPractice;

import java.util.Scanner;

public class File4 {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = s.nextInt();
        int j;
        for(int i=1 ; i<=n ; i++){
            for(j=1 ; j<=i ; j++){
                System.out.print(j + " ");
            }
            for(j=i-1 ; j>0 ; j--){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
