class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int suml=0;
        int sums=0;
        for(int i=0; i<k; i++){
            suml+=nums[n-i-1];
            sums+=nums[i];
        }
        int result = Math.abs(suml-sums);
        return result;
    }
}