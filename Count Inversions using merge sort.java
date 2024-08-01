class Solution {
    
    static long merge(long arr[],int low,int mid,int high){
         ArrayList<Long>temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        long count=0;
        
       
        while(left<=mid   &&  right<=high ){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                count+=mid-left+1;
                right++;
            }
        }
         while(left<=mid ){
             temp.add(arr[left]);
                left++;
         }
         while(right<=high){
             temp.add(arr[right]);
             right++;
         }
         for(int i=low;i<=high;i++){
             arr[i]=temp.get(i-low);
         }
         return count;
        
            
        }
    
    
    
    
    static long mergesort(long arr[],int low,int high){
        long count=0;
        if (low>=high) return count;
        int mid=(low+high)/2;
        count+=mergesort(arr,low,mid);
        count+=mergesort(arr,mid+1,high);
        count +=merge(arr,low,mid,high);
        
        return count;
    }
    
    
    
    static long inversionCount(long arr[], int n) {
             return mergesort(arr,0,n-1);
             
             
    }
}
