public class _167_ {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0 ; 
        int j = nums.length-1;
        while(j>i){
            int sum = nums[j]+nums[i];
            if(sum ==target){
                return new int[]{i+1,j+1};
            }if(sum<target){
                i++;
            }else{

                j--;
            }
        }
        return new int[]{-1};
    }
}
    
}
