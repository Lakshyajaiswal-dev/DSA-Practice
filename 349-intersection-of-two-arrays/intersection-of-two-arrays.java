class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n =  nums1.length;
        int m = nums2.length;
        int p1 =0;
        int p2 =0;
        int i=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(p1!=n&&p2!=m){
           if (nums1[p1] == nums2[p2]) {
               if (ans.isEmpty() || ans.get(ans.size() - 1) != nums1[p1]) {
                    ans.add(nums1[p1]);
                  }
               p1++;
               p2++;
           }

            else if(nums1[p1]<nums2[p2]){
                p1++;
            }
            else{
                p2++;
            }
        }
            
        
        int[] result = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
        result[k] = ans.get(k);
}
          return result;


    }
}