package Arrays;
/*
    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    Explanation: "sad" occurs at index 0 and 6.
    The first occurrence is at index 0, so we return 0.
    not needle not match to the haystack then return -1;
* */
public class FirstOccurenceOfString {
    public int strStr(String haystack, String needle) {

        for(int i=0; i<haystack.length()-needle.length()+1; i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
