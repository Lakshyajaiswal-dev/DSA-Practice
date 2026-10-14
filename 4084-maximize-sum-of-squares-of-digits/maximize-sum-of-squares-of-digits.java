class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder(num);
        if(sum<1 || sum>num*9){
            return "";
        }
        for(int i=1; i<=num; i++){
            int remSpot = num-i;
            for(int d=9; d>=0 ; d--){
                if(sum-d>=0 && sum-d<=remSpot*9){
                    sb.append(d);
                    sum-=d;
                    break;
                }
            }
        }
        return sb.toString();
    }
}