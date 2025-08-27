Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]

    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0)
              //swap
                nums[low] = nums[low] + nums[mid] - (nums[mid++] = nums[low++]);
            else if (nums[mid] == 2)
              //for 2 not increment my be 0
                nums[high] = nums[mid] + nums[high] - (nums[mid] = nums[high--]);
            else
                mid++;
        }
    }

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

