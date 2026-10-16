class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> b) {
        ArrayList<Integer> list = new ArrayList<>(100);
        int [] num = new int[101];
        for(int i=0; i<b.size(); i++){
            num[b.get(i)]++;
        }
        for(int i=0; i<num.length; i++){
            if(num[i]%2!=0){
                list.add(i);
            }
        }
        return list;

    }
}