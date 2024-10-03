class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int index = 0;
        for(int i:nums1){
            for(int j=0; j<nums2.length; j++){
                if(i==nums2[j]){
                    result[index] = i;
                    index++;
                    nums2[j]=-1;
                    break;
                }
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}