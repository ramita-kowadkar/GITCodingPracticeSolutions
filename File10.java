package GITPractice;

import java.util.Scanner;

public class File10 {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = s.next();
        boolean letter = false , digit = false , special = false;
        for(int i=0 ; i<password.length() ; i++){
            if(Character.isLetter(password.charAt(i)))
                letter = true;
            if(Character.isDigit(password.charAt(i)))
                digit = true;
            if(!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)) && !Character.isWhitespace((password.charAt(i))))
                special = true;
        }
        if(letter && digit && special){
            System.out.println("Strong password!!");
            return;
        }
        if(letter && digit){
            System.out.println("Moderate password!!");
            return;
        }
        if(letter){
            System.out.println("Weak password!!");
            return;
        }
    }
}
