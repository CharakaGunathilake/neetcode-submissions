class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean hasSeen = false;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j] && i != j){
                    hasSeen = true;
                }
            }
        }
        return hasSeen;
    }
}