class Solution
{
    static int majorityElement(int a[], int size)
    {// Phase 1: Find a candidate
        int candidate = -1;
        int count = 0;

        // Iterate through the array to find the candidate
        for (int i = 0; i < size; i++) {
            if (count == 0) {
                // Set the current element as the candidate
                candidate = a[i];
                count = 1;
            } else if (a[i] == candidate) {
                // Increment count if the current element matches the candidate
                count++;
            } else {
                // Decrement count if the current element does not match the candidate
                count--;
            }
        }

        // Phase 2: Verify the candidate
        count = 0;
        // Count occurrences of the candidate
        for (int i = 0; i < size; i++) {
            if (a[i] == candidate) {
                count++;
            }
        }

        // Check if the candidate is the majority element
        if (count > size / 2) {
            return candidate;
        } else {
            return -1; // No majority element found
        }
    }
        
    
}
