
public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int m = nums.length - 1;
                int k = j + 1;
                while (k < m) {
                    long sum =(long) nums[i] + nums[j] + nums[k] + nums[m];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[m]));
                        while (k < m && nums[k] == nums[k + 1])
                            k++;
                        while (m > k && nums[m] == nums[m - 1])
                            m--;
                        k++;
                        m--;
                    } else if (sum > target)
                        m--;
                    else
                        k++;
                }
            }
        }
        return res;
    }
