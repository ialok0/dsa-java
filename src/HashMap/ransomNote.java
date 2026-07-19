package HashMap;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
* */

public class ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];

        for(char r : ransomNote.toCharArray()){
            arr[r-'a']++;
        }
        for(char m: magazine.toCharArray()){
            arr[m-'a']--;
        }

        for(int i:arr){
            if(i>0){
                return false;
            }
        }
        return true;
    }
}
