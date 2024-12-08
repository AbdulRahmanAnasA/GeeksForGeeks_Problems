class Solution {
    static String postToPre(String post_exp) {
            Stack<String> st=new Stack<>();
            for(int i=0; i<post_exp.length();i++){
                char c = post_exp.charAt(i);
                if(Character.isLetterOrDigit(c)){
                    st.push(String.valueOf(c));
                }
                else{
                    
                    String top=st.pop();
                    String SecondTop=st.pop();
                    
                     String mod=c  + SecondTop+ top ;
                     st.push(mod);
                }
            
            }
            return st.peek();
    }
}
