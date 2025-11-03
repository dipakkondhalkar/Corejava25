//. Write a java program to input any alphabet and check whether it is vowel or consonant.

import java.util.*;
public class VowelCheck{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the character");
char ch = sc.next().charAt(0);
String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? " The character is vowel ": " The character is consonant";
System.out.println(result);
}
}

