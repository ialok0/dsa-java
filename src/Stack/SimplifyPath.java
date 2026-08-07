package Stack;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] splitedPath = path.split("/");

        Stack<String> stack = new Stack<>();

        for(String i : splitedPath){
            if(i.equals("..") && !stack.empty()){
                stack.pop();
            }else if(!i.equals(".") && !i.isEmpty() && !i.equals("..")){
                stack.push(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String i : stack){
            sb.append("/");
            sb.append(i);
        }
        return sb.isEmpty() ? "/" : sb.toString() ;
    }
}
