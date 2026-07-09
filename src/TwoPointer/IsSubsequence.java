package TwoPointer;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int j = 0;

        if(s.isEmpty()){
            return true;
        }

        for(int i=0; i<n; i++){
            if(t.charAt(i)==s.charAt(j)){
                if(j==s.length()-1){
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}
