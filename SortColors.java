Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]

  

public void sortColors(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index++] = temp;
            }
            if (index < i && nums[index] == 0)
                index++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index++] = temp;
            }
            if (index < i && nums[index] == 0)
                index++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index++] = temp;
            }
            if (index < i && nums[index] == 2)
                index++;
        }
    }

