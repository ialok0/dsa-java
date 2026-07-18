package HashMap;

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
