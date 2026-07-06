package Arrays;

public class ReverseWordInString {
    public String reverseWords(String s) {
        String[] strArr = s.trim().replaceAll("\\s+", " ").split(" ");
        s = "";
        for(int i=strArr.length-1; i>=0; i--){
            if(i==0){
                s+= strArr[i];
            }else{
                s += strArr[i] + " ";
            }
        }
        return s;
    }
}
