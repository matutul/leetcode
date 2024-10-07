class Solution {
    public int minDifference(int[] nums) {
        int result = 0;
        int arrSize = nums.length;
        if(arrSize>4){
           Arrays.sort(nums);
           result = nums[arrSize-1]-nums[0];
           int i = 3;
           while(i>-1){
            int diff = nums[arrSize-(4-i)]-nums[i];
            if(result>diff){
                result = diff;
            }
            i--;
           }
        }
        return result;
    }
}