

class Solution {
    public int minimumCost(int[] cost) {
        // Normal ascending sort: [1, 2, 3, 4, 7, 9]
        Arrays.sort(cost);
        
        int sum = 0;
        int n = cost.length;
        
        // Peeche se chalo (sabse mehenge items se shuru karo)
        for (int i = 0; i < n; i++) {
            // Har 3rd candy (index 2, 5, 8... from right) free milegi
            if (i % 3 != 2) {
                sum += cost[n - 1 - i];
            }
        }
        
        return sum;
    }
}
    
