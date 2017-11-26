//Given nums = [3,2,2,3], val = 3,
//Your function should return length = 2, with the first two elements of nums being 2.
//遍历数组，与给定的val值不相等的元素赋予新的索引
class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}