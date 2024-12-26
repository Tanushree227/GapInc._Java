//Write a Java program to reverse a string without using built in reverse functions.

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rstr = "";
        for(int i = 0; i < str.length(); i++)
        {
            rstr = str.charAt(i) + rstr;
        }
        System.out.println(rstr);
    }
}
