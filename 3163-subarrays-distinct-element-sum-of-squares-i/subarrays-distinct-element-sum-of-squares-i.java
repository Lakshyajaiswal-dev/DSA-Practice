class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int totalSum =0;
         for(int i=0; i<n; i++){
            boolean visited [] = new boolean[101];
            int distinct =0;
            for(int j=i; j<n; j++){
                 int val = nums.get(j);
                 if(!visited[val]){
                    visited[val]=true;
                    distinct++;
                    
                 }
                 totalSum += distinct*distinct;
            }
         }
         return totalSum;
    }
}