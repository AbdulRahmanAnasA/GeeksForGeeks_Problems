class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
       /* int i=0;
       while(n!=0){
             if(k==i){
                 if(n%2==1)
                 return true;
                 else
                 return false;
             }
             n=n/2;
             i++;
       }
       return false;
    }
}*/
//using left shift;
return (n & (1<<k))!=0;
}}
