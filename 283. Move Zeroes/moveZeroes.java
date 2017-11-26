//Given an array nums, write a function to move all 0's to the end of it 
//while maintaining the relative order of the non-zero elements.
//For example, given nums = [0, 1, 0, 3, 12], after calling your function, 
//nums should be [1, 3, 12, 0, 0].
//遍历数组，用异或交换非零与0
class Solution {
public void moveZeroes(int[] nums) { 
 int index = 0;
        for(int i = 0; i < nums.length; i++)
            if(nums[i] != 0) {
                if(i != index) {
                    nums[i] = nums[i] ^ nums[index];
                    nums[index] = nums[i] ^ nums[index];
                    nums[i] = nums[i] ^ nums[index];
                    index++;
                }else {
                    index++;
                }     
            }
    }
}