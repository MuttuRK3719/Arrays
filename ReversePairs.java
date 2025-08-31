Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1

Example 2:

Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1

public int reversePairs(int[] nums) {
        sort(nums, 0, nums.length);
        return count;
    }

    void sort(int[] nums, int start, int end) {
        if (end - start <= 1)
            return;
        int mid = start + (end - start) / 2;
        sort(nums, start, mid);
        sort(nums, mid, end);
        int j = mid;
        for (int i = start; i < mid; i++) {
            while (j < end && (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            count += (j - mid);
        }
        merge(nums, start, mid, end);
    }

    int count = 0;

    void merge(int[] nums, int start, int mid, int end) {
        int[] merge = new int[end - start + 1];
        int i = start, j = mid, k = 0;
        while (i < mid && j < end) {
            if (nums[i] > nums[j])
                merge[k++] = nums[j++];
            else
                merge[k++] = nums[i++];
        }
        while (i < mid) {
            merge[k++] = nums[i++];
        }
        while (j < end) {
            merge[k++] = nums[j++];
        }
        for (int l = 0; l < k; l++) {
            nums[start + l] = merge[l];
        }
    }
