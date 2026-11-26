class Solution {
    public boolean canAliceWin(int n) {
        int stones = 10;
        
        while (stones > 0) {
         
            if (n < stones) {
                return false;
            }
            n -= stones;
            stones--;
            if (n < stones) {
                return true;
            }
            n -= stones;
            stones--;
        }
        
        return false;
    }
}