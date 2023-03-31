Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]


//SOLUTION

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp;
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
        
            if(nums[left] % 2 == 0){
                left++;
            }else if(nums[right] % 2 != 0){
                right--;
            }else{
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        
        }
        return nums;
    }
}
