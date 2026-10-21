class Solution {

    public double findMaxAverage(int[] nums, int k) {

        int start = 0;
         int windowSum = 0;
         int maxSum = Integer.MIN_VALUE;
 

        for(int end = 0; end < nums.length; end++) {

            windowSum += nums[end];

            if(end - start + 1 == k) {

               maxSum = Math.max(maxSum, windowSum);

                windowSum -= nums[start];

                start += 1;

            }

        }

 

        return (double) maxSum/k;

    }

}