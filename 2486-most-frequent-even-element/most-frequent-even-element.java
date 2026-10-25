class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
        }
        int ans =-1;
        int maxfreq = 0;
        for(int key : map.keySet()){
            int freq = map.get(key);
             if(freq>maxfreq){
                maxfreq=freq;
                ans=key;
             }
             else if(freq==maxfreq && key<ans){
                ans=key;
             }
        }
        return ans;
    }
}