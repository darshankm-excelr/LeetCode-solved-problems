class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> result=new ArrayList<Integer>();
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1); // increment count
            } else {
                hm.put(nums[i], 1); // first occurrence
            }
        }

        // Step 2: Check lonely numbers (should be outside the first loop)
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (hm.get(num) == 1 && !hm.containsKey(num + 1) && !hm.containsKey(num - 1)) {
                result.add(num);
            }
        }
        return result;
    }
}