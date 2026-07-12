package TwoPointer;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(result.isEmpty()){
            return true;
        }

        String reversed = "";

        for (int i = result.length() - 1; i >= 0; i--) {
            reversed += result.charAt(i);
        }

        return result.equals(reversed);
    }
}
