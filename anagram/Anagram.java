package anagram;
import java.util.Scanner;
public class Anagram {
   static boolean isAnagram(String str1, String str2){
       
         if(str1.length() != str2.length())return false;
         int[] count = new int[26];
         // add frequescy of first string
         for(char c:str1.toCharArray()){
            count[c -'a']++;
         }
         // add  removing frequency of second string
         for(char c: str2.toCharArray()){
            count[c-'a']--;
         }

         for(int num: count){
            if(num != 0)return false;
         }
         return true;

    }
     public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();

        if(isAnagram(str1,str2)){
            System.out.println("The two strings are anagram");
        }else{
            System.out.println("The two strings are not anagram");
        }

     }
}
