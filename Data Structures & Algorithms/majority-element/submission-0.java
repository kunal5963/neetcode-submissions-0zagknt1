class Solution {
    public int majorityElement(int[] nums) {
        // Need to do it in one pass
        // Use HashMap and at every iteration we need to check the count if the count is the max
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxValue = 1;
        int maxElement = nums[0];
        for (int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>maxValue) {
                maxElement = nums[i];
                maxValue = map.get(nums[i]);
            }
        }
        return maxElement;
    }
}