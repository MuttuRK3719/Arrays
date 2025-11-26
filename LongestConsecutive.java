public int longestConsecutive(int[] nums) {
        int lastSmaller = Integer.MIN_VALUE;
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int longest = 1, count = 1;
        for (int ele : nums) {
            if (ele - 1 == lastSmaller) {
                count++;
                lastSmaller = ele;
            } else if (lastSmaller != ele) {
                lastSmaller = ele;
                count = 1;
            }
            longest = Math.max(count, longest);
        }
        return longest;
    }
