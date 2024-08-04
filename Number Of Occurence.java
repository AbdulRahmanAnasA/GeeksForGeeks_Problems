class Solution {
    int count(int[] arr, int n, int x) {
        int low=0;
        int high=n-1;
        int result1=-1;
        //First occurence
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]==x){
                result1=mid;
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high= mid-1;
            }
        }
         //second occurence
         low=0;
         high=n-1;
         int result2=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]==x){
                result2=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high= mid-1;
            }
        }
        int index=result2-result1;
        if(result1==-1 || result2==-1){
            return 0;
        }
        
        return index+1;
    }
}
