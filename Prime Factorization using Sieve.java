class Solution {
    // You must implement this function
    static void sieve() {}//useless but cannot be removed
    static void mySieve(int []prime,int n){
        for(int i=2;i<=n;i++){
            prime[i]=i;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(prime[i]==i){
                for(int j=i*i;j<=n;j+=i){
                    if(prime[j]==j){
                    prime[j]=i;
                    }
                }
            }
        }
    }
    static List<Integer> findPrimeFactors(int n) {
        List<Integer> ans=new ArrayList<>();
        int prime[]=new int[n+1];
        mySieve(prime,n);
        
        while(n!=1){
            ans.add(prime[n]);
            n=n/prime[n];
        }
        return ans;
    }
}
