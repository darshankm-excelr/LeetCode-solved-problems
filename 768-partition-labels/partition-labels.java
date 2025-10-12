class Solution {
    public List<Integer> partitionLabels(String str) {
        List<Integer> partition=new ArrayList<>();
        for(int i=0;i<str.length();){
            int startIndex=i;
            int endIndex=str.lastIndexOf(str.charAt(startIndex));
            for(int s=startIndex+1;s<=endIndex-1;s++){
                int lastIndexOfNextChar=str.lastIndexOf(str.charAt(s));
                if(lastIndexOfNextChar>endIndex){
                  endIndex=lastIndexOfNextChar;

                }
            }
           partition.add(endIndex-startIndex+1);
            i=endIndex+1;
        }
        return partition;
    }
}