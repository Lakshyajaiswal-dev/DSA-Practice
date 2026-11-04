class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Map<Integer, Integer> map1 = new HashMap<>();
       List<Integer> list = new ArrayList<>();
       for(int i= 0; i<nums1.length; i++){
          int n = nums1[i];
          map1.put(n, map1.getOrDefault(n, 0)+1);
       }
       for(int i= 0; i<nums2.length; i++){
          int m = nums2[i];
        if(map1.containsKey(m)){
            list.add(m);
            map1.put(m,map1.get(m)-1);
            if(map1.get(m)==0){
                map1.remove(m);
            }
        }
         
       }
        int res []= new int [list.size()];
        for(int i=0; i<list.size(); i++){
            res[i]= list.get(i);
        }
        return res;
    }
}