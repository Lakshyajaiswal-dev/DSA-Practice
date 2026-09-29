class Solution {
    public int reverse(int x) {
        long num = 0; 
        while (x != 0) {
            int y = x % 10;
            num = (num * 10) + y;
            x = x / 10;
        }
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) num;
    }
}