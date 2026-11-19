class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxVal=0;
        int val=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                val++;
            }
            else{
                maxVal= Math.max(maxVal,val);
                val = 0;
            }
        }
        return Math.max(maxVal,val);
    }
}