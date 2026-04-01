class Solution {
    public void moveZeroes(int[] nums) {

        // for(int i=0, j=nums.length-1; i<j ; j--) {
        //     if(nums[i] == 0 && nums[j] != 0) 
        //     {
        //         nums[i] = nums[j];
        //         nums[j] = 0;
        //         i++;
        //     }
        //     if(nums[i] > nums[i+1]) 
        //     {
        //         int temp = nums[i];
        //         nums[i] = nums[i+1];
        //         nums[i+1] = temp;
        //     }
        // }
        int left =0;
        for (int right =0; right < nums.length; right++) {
            if(nums[right] != 0 ) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}