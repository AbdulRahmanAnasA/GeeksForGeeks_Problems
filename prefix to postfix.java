class Solution {
    static String preToPost(String pre_exp) {
            Stack<String> st=new Stack<>();
            for(int i=pre_exp.length()-1; i>=0;i--){
                char c = pre_exp.charAt(i);
                if(Character.isLetterOrDigit(c)){
                    st.push(String.valueOf(c));
                }
                else{
                    
                    String top=st.pop();
                    String SecondTop=st.pop();
                    
                     String mod=top +SecondTop+c;
                     st.push(mod);
                }
            
            }
            return st.peek();
    }
}
