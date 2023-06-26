package mylearning;

import java.util.Stack;

public class ParanthesisProblem {

	public static void main(String[] args) {
		String str = "(a)b){}";
	      String isValid = removeParanthesisToMakeStringValid(str);
	      System.out.println(isValid);

	}
	
	public static boolean isValidParenthesis(String str){
        Stack<Character> stack = new Stack<Character>();
        for(char c : str.toCharArray()){
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                 stack.push('}');
            else if (c == '[')
                 stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
            
        }
        return stack.isEmpty();
    }
	
	public static String removeParanthesisToMakeStringValid(String str){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) == '(')
                stack.push(')');
            else if (str.charAt(i) == '{')
                 stack.push('}');
            else if (str.charAt(i) == '[')
                 stack.push(']');
            else if (stack.pop() != str.charAt(i))
                 str.replace(str.charAt(i), ' ');
        }
        return str;
    }

}
