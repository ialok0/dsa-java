package Stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i =0; i< s.length(); i++){
            char cur = s.charAt(i);

            if(isOpening(cur)){
                stack.push(cur);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if(!isMatching(stack.peek(),cur)){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();

    }

    public boolean isOpening(char c){
        return c=='(' || c=='{' || c=='[';
    }

    public boolean isMatching(char a,char b){
        return (a=='(' && b==')') || (a=='{' && b=='}') ||(a=='[' && b==']');
    }
}
