class Solution {
    public String largestGoodInteger(String num) {
        String[] targets = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        
        for (String target : targets) {
            if (num.contains(target)) {
                return target;
            }
        }
        
        return "";
    }
}