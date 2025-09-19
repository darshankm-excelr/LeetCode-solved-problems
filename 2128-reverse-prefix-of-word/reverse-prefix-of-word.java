class Solution {
    public String reversePrefix(String word, char ch) {
        int firstoccurence=word.indexOf(ch);
        if(firstoccurence==-1)
        return word;
        Stack <Character> charStack=new Stack<>();

        for(int i=0;i<=firstoccurence;i++){
            charStack.push(word.charAt(i));
        }
        StringBuilder result=new StringBuilder();
        while(!charStack.isEmpty()){
            result.append(charStack.pop());
        }
        for(int i=(firstoccurence+1);i<word.length();i++){
            result.append(word.charAt(i));
        }
        return result.toString();

    }
}