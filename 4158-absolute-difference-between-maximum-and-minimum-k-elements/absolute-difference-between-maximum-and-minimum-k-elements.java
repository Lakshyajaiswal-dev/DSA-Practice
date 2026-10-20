class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length -1;
        int suml=0;
        int sums=0;
        for(int i=0; i<k; i++){
            suml+=nums[n];
            sums+=nums[i];
            n--;
        }
        return Math.abs(suml-sums);
    }
}