class Solution {
    public long coloredCells(int n) {
        long m= n-1;
        long count = 1+2*m*(m+1);
        return count;
    }
}