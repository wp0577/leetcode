THis version is correct. 
USE STACK FOR THIS QUESTION, AND SWITCH CONDITION.
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : chars) {
            if (!stack.isEmpty() && isPair(stack.peek(), ch)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();

    }

    public boolean isPair(char left, char right) {
        switch (left) {
            case '(':
                return right == ')';
            case '{':
                return right == '}';
            case '[':
                return right == ']';
            default:
                return false;
        }
    }


This a bad and mistake version.
class Solution {
    public boolean isValid(String s) {
        // this question can be solved by stack
        Stack st= new Stack();
        int len= s.length();
        if(len==1) return false;
        for (int i=0; i<len; i++){
            if(s.charAt(i)== '('||s.charAt(i)== '{'||s.charAt(i)== '[') {
                st.push(s.charAt(i));
            }
            if(s.charAt(i)== ')'||s.charAt(i)== '}'||s.charAt(i)== ']'){
                if(st.empty()) return false;
                char temp= (char)st.pop();
                if(temp - s.charAt(i)>2) return false; 
                
            }
        } 
        if(st.empty()) return true;
        return false;
    }
}

THis version is correct. 
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : chars) {
            if (!stack.isEmpty() && isPair(stack.peek(), ch)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();

    }

    public boolean isPair(char left, char right) {
        switch (left) {
            case '(':
                return right == ')';
            case '{':
                return right == '}';
            case '[':
                return right == ']';
            default:
                return false;
        }
    }

