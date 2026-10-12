class Solution {
    public int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
    public int gcdOfOddEvenSums(int n) {
        int e =0;
        int o =0;
        for(int i=1; i<=n; i++){
            e+=(2*i);
            o+=(2*i-1);
        } 
        return gcd(e,o);
    }
}