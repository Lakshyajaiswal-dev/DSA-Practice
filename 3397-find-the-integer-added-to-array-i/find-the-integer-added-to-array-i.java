class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
         Arrays.sort(nums2);
         int n = nums1[0];
         int m = nums2[0];
         int diff = Math.abs(m-n);
         if(m>n){
            return diff;
         }
         else{
               return -diff;
         }
      

    }
}