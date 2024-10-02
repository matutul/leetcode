class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        int arrSize = nums.length;
        for(int i = 0; i<arrSize; i++){
            if(nums[i]!=val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}