The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

xample 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        int max = 0;
        int maxVal = 0;
        for (var entry : freq.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxVal = entry.getKey();
            }
        }
        return maxVal;
    }
