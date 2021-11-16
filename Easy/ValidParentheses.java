import java.util.Stack;
public class ValidParentheses {
    public boolean isValid(String s) {
        // using stack to solve the puzzle
        Stack<Character> stack = new Stack<Character>();
        boolean result = true;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    result = false;
                    break;
                }
            }
            else if (c == '}') {
                if(!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                }
                else {
                    result = false;
                    break;
                }
            }
            else if (c == ']') {
                if(!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                }
                else {
                    result = false;
                    break;
                }
            }
        }
        // double check if the stack is empty so that is "balanced"
        // after all operations
        if(!stack.isEmpty()) {
            result = false;
        }
        return result;
    }
}
