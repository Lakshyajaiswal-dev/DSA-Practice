class Solution {
    public int countCommas(int n) {
        int count = 0;
        if(n >= 0 && n < 999){
            count =0;
        }
        else if(n>=1000 && n<=100000){
            count = n-999;
        }
        return count;
    }
}