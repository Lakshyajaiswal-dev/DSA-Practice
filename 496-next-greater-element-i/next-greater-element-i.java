class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int ans  [] = new int [nums1.length];
       for(int i=0; i<nums1.length; i++){
        int target = nums1[i];
        int idx = -1;
        for(int j=0; j<nums2.length; j++){
            if(target==nums2[j]){
                idx = j;
                break;
            }
        }
        int greater = -1;
        for(int k = idx+1; k<nums2.length; k++){
            if( nums2[k] > target){
              greater = nums2[k];
              break;
            }
        }
        ans[i]= greater;

       }
       return ans;
    }
}