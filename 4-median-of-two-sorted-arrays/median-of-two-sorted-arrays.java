class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int l = n+m;
        int p1 = 0;
        int p2 = 0;
        double ans ;
        int i=0;
      int arr []= new int[l];
      while(p1!=n&&p2!=m){
        if(nums1[p1]<=nums2[p2]){
            arr[i]=nums1[p1];
            p1++;
            i++;
        }
        else{
            arr[i]=nums2[p2];
            p2++;
            i++;
        }
      }
        while(p1!=n){
            arr[i]=nums1[p1];
            p1++;
            i++;
        }
        while(p2!=m){
            arr[i]=nums2[p2];
            p2++;
            i++;
        }
      if(l%2!=0){
       return  arr[l/2];
     
      } 
     
      return (arr[(l/2)-1]+arr[l/2])/2.0;

    }
}