import java.util.*;
class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                ArrayList<Character> r_str = new ArrayList<>();
                Character current = stack.pop();
                while(current != '('){
                    r_str.add(current);
                    current = stack.pop();
                }
                for(Character ch:r_str){
                    stack.push(ch);
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        String reverseString = "";
        for(Character c:stack){
            reverseString +=c;
        }
        return reverseString;
    }
}