package ca.cricri.problems;

import java.util.Stack;

public class ValidParentheses {

    /**
     * <a href="https://leetcode.com/problems/valid-parentheses/">lien</a>
     *
     * @param s input containing parentheses
     * @return true if parentheses are valid :
     * - Open brackets must be closed by the same type of brackets.
     * - Open brackets must be closed in the correct order.
     * Topic : String, Stack
     */
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for(Character c : s.toCharArray()){
            switch (c) {
                case '{' :
                    myStack.push('{');
                    break;
                case '(' :
                    myStack.push('(');
                    break;
                case '[' :
                    myStack.push('[');
                    break;
                case '}' :
                    if(!myStack.isEmpty() && myStack.peek() == '{') {
                        myStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ')' :
                    if(!myStack.isEmpty() && myStack.peek() == '(') {
                        myStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']' :
                    if(!myStack.isEmpty() && myStack.peek() == '[') {
                        myStack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()"));
        System.out.println(validParentheses.isValid("()[]()"));
        System.out.println(validParentheses.isValid("(]"));
    }
}
