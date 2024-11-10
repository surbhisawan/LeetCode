class Solution {
    
    private void updateBitCounts(int[] bitCounts, int number, int delta) {
        for (int bitPosition = 0; bitPosition < 32; bitPosition++) {
            if (((number >> bitPosition) & 1) != 0) {
                bitCounts[bitPosition] += delta;
            }
        }
    }
    
    private int convertBitCountsToNumber(int[] bitCounts) {
        int result = 0;
        for (int bitPosition = 0; bitPosition < 32; bitPosition++) {
            if (bitCounts[bitPosition] != 0) {
                result |= 1 << bitPosition;
            }
        }
        return result;
    }
    
    public int minimumSubarrayLength(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int[] bitCounts = new int[32];
        int start=0, end=0;
        while(end < nums.length){
            
            updateBitCounts(bitCounts, nums[end], 1);
            
            while(start <= end && convertBitCountsToNumber(bitCounts) >= k){
                min = Math.min(min,end-start+1);
                updateBitCounts(bitCounts, nums[start], -1);
                start++;
            }
            end++;
        }
        
        if(min == Integer.MAX_VALUE){
            return -1;
        }

        return min;
    }
}