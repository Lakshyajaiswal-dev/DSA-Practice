class Solution {
    public char repeatedCharacter(String s) {
       Map<Character,Integer> freq = new HashMap<>();
       int count=0;
       for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        count++;
        freq.put(ch, freq.getOrDefault(ch, 0)+1);
        if(freq.size()!=count){
            return ch;
        }
       }
       return 'a';
    }
}