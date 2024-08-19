class Solution {
    public int findKRotation(List<Integer> arr) {
        int minIndex = -1;
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            // If the left part is sorted
            if (arr.get(low) <= arr.get(mid)) {
                if (minIndex == -1 || arr.get(low) < arr.get(minIndex)) {
                    minIndex = low;
                }
                low = mid + 1;
            } 
            // If the right part is sorted
            else {
                if (minIndex == -1 || arr.get(mid) < arr.get(minIndex)) {
                    minIndex = mid;
                }
                high = mid - 1;
            }
        }
        
        return minIndex;
    }
}
