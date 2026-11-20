class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
         for (int i = 2; i<= n/i; i++) {
           if (n % i == 0) {
                 if (i>5) {
                 return false;
                 }
                 while (n % i == 0) {
                   n /= i;
                  }
            }
              
         
         }
         if(n>5){
            return false;
         }
         return true;

    }
}