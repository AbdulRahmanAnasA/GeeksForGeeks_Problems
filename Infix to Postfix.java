class Solution {
    
    
    public static int priority(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
                
        }
        return -1;
    }
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String s) {
        int i=0;
        int n=s.length();
        Stack<Character> st=new Stack<>();
        String result=new String("");
        while(i<n){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                result+=c;
            }
            else if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    result+=st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && priority(c)<=priority(st.peek())){
                    result+=st.pop();
                    }
                    st.push(c);
            }
            i++;
        }
        while(!st.isEmpty()){
            result+=st.pop();
        }
        return result;
    }
}
