class Solution {
    public int removeDuplicates(int[] nums) {
        // int temp = nums[0];
        int j = 0;
        int arrSize = nums.length;
        for(int i = 1; i<arrSize; i++){
            if(nums[i]!=nums[j]){
                // temp = nums[i];
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}