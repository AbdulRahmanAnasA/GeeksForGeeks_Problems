class Solution {

  
    static int findFloor(long arr[], int n, long x) {
        
        int low=0;
        int high=n-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]==x)  return mid;
            else if(arr[mid]<x){
            result=mid;
            low=mid+1;
            }
            else if(arr[mid]>x) 
            high=mid-1;
        }
        return result;
        
    }
}
