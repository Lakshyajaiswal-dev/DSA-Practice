class Solution {
    public int calPoints(String[] op) {
        List <Integer> list  = new ArrayList<>();
        for(int i=0; i<op.length; i++){
            String s = op[i];
            if(s.equals("+")){
                int size= list.size();
                int sum = list.get(size - 1) + list.get(size - 2);
                list.add(sum);
            }
            else if(s.equals("D")){
              int last = list.get(list.size()-1);
              list.add(2*last);
            }
            else if(s.equals("C")){
               list.remove(list.size()-1);
            }
            else{
                list.add(Integer.parseInt(s));
            }
    } 
             int sum =0;
             for(int i=0; i<list.size();i++){
                 sum+=list.get(i);
             }
             return sum;
        }
    }
