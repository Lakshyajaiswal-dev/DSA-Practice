class Solution {
    public int findMiddleIndex(int[] nums) {
        int num []= new int[nums.length];
        if(nums.length==1){
            return 0;
        }
        int n=0;
        for(int i=0; i<nums.length; i++){
            num[i]=n+nums[i];
            n= num[i];
        }int a =0;
        for(int i=0; i<num.length; i++){
            if(i!=0){
                a = num[i-1] ;           }
            if(a==num[num.length-1]-num[i]){
                return i;
            }
        }
        return -1;
    }
}