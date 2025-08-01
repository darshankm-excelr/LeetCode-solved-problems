class Solution {
    public int singleNumber(int[] nums) {
        int sign=0;
        for(int i=0;i<nums.length;i++){
            sign=sign^nums[i];
        }
        return sign;
    }
}