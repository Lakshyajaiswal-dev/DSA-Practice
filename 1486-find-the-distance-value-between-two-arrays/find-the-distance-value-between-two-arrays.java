class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
      Arrays.sort(arr2);
     int count = 0;

     for(int i=0; i<arr1.length; i++){
        int start =0;
        int end = arr2.length-1;
        boolean FoundRange = true;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr2[mid]>=arr1[i]-d && arr2[mid]<=arr1[i]+d){
               FoundRange = false;
                break;
            }
            else if (arr2[mid]>arr1[i]+d){
                end = mid-1;;
            }
            else{
                start= mid+1;
            }
        }
        if(FoundRange){
            count++;
        }
     }
     return count;
    }
}