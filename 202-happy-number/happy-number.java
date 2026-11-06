class Solution {
    public boolean isHappy(int num) {
    HashSet<Integer> hm = new HashSet<>();
    while (num != 1 && !hm.contains(num)) {
        hm.add(num);
        int m = num;
        int square = 0;
        while (m > 0) {
            int a = m % 10;
            square += a * a;
            m = m / 10;
        }
        num = square;
    }
    return num == 1;
        
    }
}