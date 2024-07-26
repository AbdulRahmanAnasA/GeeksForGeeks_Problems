class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> ans=new ArrayList<>();
        
        int max=arr[n-1];
        ans.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            
            if(arr[i]>=max){
               ans.add(arr[i]);
                max=arr[i];
               
            }
        }
        
        Collections.sort(ans,Collections.reverseOrder());
        return ans;
    }
}
