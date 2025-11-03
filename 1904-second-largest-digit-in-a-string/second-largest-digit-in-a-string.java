class Solution {
    public int secondHighest(String s) {
        Set<Integer> Set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                Set.add(Character.getNumericValue(ch));
            }
        }
        ArrayList<Integer> list=new ArrayList<>(Set);
        Collections.sort(list);
        if(list.size()<2){
            return -1;
        }
        int res=list.get(list.size()-2);
        return res;
    }
}