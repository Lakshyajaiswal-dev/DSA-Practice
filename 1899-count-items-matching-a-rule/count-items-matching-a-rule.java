class Solution {
    public int countMatches(List<List<String>> it, String ruleKey, String ruleValue) {
        int j=0;
       if(ruleKey.equals("color")){
          j=1;
       } 
       else if(ruleKey.equals("name")){
        j=2;
       }
       int count=0;
       for(int i=0; i<it.size(); i++){
          if(it.get(i).get(j).equals(ruleValue)){
            count++;
          }
       }
       return count;
    }
}