
        class Solution {
    public int[] getNoZeroIntegers(int n) {
        // Iterate through possible values for 'a' starting from 1
        for (int a = 1; a < n; a++) {
            int b = n - a;
            
            // Check if both 'a' and 'b' contain no zeros
            if (isNoZero(a) && isNoZero(b)) {
                return new int[]{a, b};
            }
        }
        
        return new int[]{};
    }
    
    // Helper function to check if a number contains the digit '0'
    private boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
    
