class Solution {
    static String postToInfix(String exp) {
            Stack<String> st=new Stack<>();
            for(int i=0; i<exp.length(); i++){
                char c = exp.charAt(i);
                if(Character.isLetterOrDigit(c)){
                    st.push(String.valueOf(c));
                }
                else{
                    
                    String top=st.pop();
                    String SecondTop=st.pop();
                    
                     String mod="("+ SecondTop + c+ top+")";
                     st.push(mod);
                }
            
            }
            return st.peek();
    }
}
