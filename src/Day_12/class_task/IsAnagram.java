package Day_12.class_task;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Strings :");
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(Anagram(a,b)){
            System.out.println(a+" and "+b+" Is Anagram");
        }else{
            System.out.println(a+" and "+b+" Is not Anagram");
        }
        sc.close();
    }

    public static boolean Anagram(String s1,String s2){
        char [] k=s1.toCharArray();
        char [] j=s2.toCharArray();
        Arrays.sort(k);
        Arrays.sort(j);
        return Arrays.equals(k,j);
    }
}
