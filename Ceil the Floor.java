class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int low=0;
        int high=n-1;
        int result=-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=x){
                result=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        low=0;
        high=n-1;
    int result1=-1;
     while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                result1=arr[mid];
                high=mid-1;
            }
            else{
               low=mid+1;
            }
        }
        return new int[]{result,result1};
    }
}
