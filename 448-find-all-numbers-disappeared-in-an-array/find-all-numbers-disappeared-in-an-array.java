class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i=0;
        while(i<n){
            int correctIndex = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                int temp = nums[correctIndex] ;
                nums[correctIndex]= nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        List <Integer> result = new ArrayList<>();
        for(int j=0;j<n; j++){
            if(nums[j]!=j+1){
                result.add(j+1);
            }
        }

       return result;
    }
}