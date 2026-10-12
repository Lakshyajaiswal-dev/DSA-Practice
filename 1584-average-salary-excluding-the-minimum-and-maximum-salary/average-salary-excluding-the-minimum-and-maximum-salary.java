class Solution {
    public double average(int[] salary) {
        int n = salary.length;
      int max = salary[0];
      int min =salary[0];
      int sum = salary[0];
      for(int i=1; i<salary.length; i++){
          max = Math.max(max, salary[i]);
          min = Math.min(min, salary[i]);
          sum+=salary[i];

      }  
      int  result = (min+max);
      int result1 = sum-result;
      double res = (double)result1/(n-2);
      return res;
    }
}