package GITPractice;

import java.util.Scanner;

public class File5 {
    
    public static boolean isPrime(int x){
        for(int i=2 ; i<x/2 ; i++){
            if(x%i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter lower bound : ");
        int lower = s.nextInt();
        System.out.print("Enter upper bound : ");
        int upper = s.nextInt();
        int i;
        System.out.println("Prime numbers are : ");
        for(i=lower ; i<=upper ; i++){
            boolean b = isPrime(i);
            if(b == true){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
