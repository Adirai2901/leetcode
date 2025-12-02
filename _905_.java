public class _905_ {
    class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0; 
        int end = nums.length-1;
        int abc[] = new int[nums.length];
        if(nums.length==1){
            return nums;
        }
        for(int i = 0; i<nums.length;i++){
            if(nums[i]%2==0){
                abc[start]=nums[i];
                start++;
            }else{
                abc[end]=nums[i];
                end--;
            }
        }
        return abc;
        
    }
}
}
