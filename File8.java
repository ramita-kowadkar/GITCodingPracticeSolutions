package GITPractice;

import java.util.*;

public class File8 {
    
    public static void removeDuplicates(String str){
        Vector<Character> v = new Vector<>();
        for(int i=0 ; i<str.length() ; i++){
            v.add(str.charAt(i));
            
            if(v.size() > 2){
                int size = v.size();
                if(v.get(size-1) == v.get(size-2) && v.get(size-2) == v.get(size-3)){
                    v.setSize(size-3);
                }
            }
        }
        for(int i=0 ; i<v.size() ; i++){
            System.out.print(v.get(i));
        }
        System.out.println("");
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = s.next();
        removeDuplicates(str);
    }
}
