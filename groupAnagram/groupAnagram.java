package groupAnagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class groupAnagram {

    public static List<List<String>> groupAnagrams(ArrayList<String> strs){

        if(strs == null) return new ArrayList<>();

        HashMap<String,ArrayList<String>> map = new HashMap<>();

        for(String str: strs){
            int[] count = new int [26];

            for(char c: str.toCharArray()){
                count[c-'a']++;
            }
             StringBuilder key = new StringBuilder();
            for(int num:count){
                 key.append(num);
                 key.append("#");
            }

            map.putIfAbsent(key.toString(), new ArrayList<>());
            map.get(key.toString()).add(str);

        }
        return new ArrayList<>(map.values());

    }
     public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
      
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of strings to be add ");
        int n = input.nextInt();
        System.out.println("Enter the strings");
        for(int i=0;i<n;i++){
            String str = input.next();
            arr.add(str);
        }

        List<List<String>> result = groupAnagrams(arr);

        System.out.println(result);
        
     }
}
