nums =
[2,1,1,3,1,4,5,6]
Output
[1]

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
  Output: [1,2]

public static List<Integer> majorityElement(int[] nums) {
        if (nums.length == 0)
            return new ArrayList<>();
        int counter1 = 0, counter2 = 0, c1 = 0, c2 = 0, n = nums.length / 3;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (c1 == num)
                counter1++;
            else if (c2 == num)
                counter2++;
            else if (counter1 == 0) {
                counter1 = 1;
                c1 = num;
            } else if (counter2 == 0) {
                counter2 = 1;
                c2 = num;
            }

            else {
                counter1--;
                counter2--;
            }
        }
        counter1 = 0;
        counter2 = 0;
        for (int num : nums) {
            if (c1 == num)
                counter1++;
            else if (c2 == num)
                counter2++;
        }
        if (counter1 > n)
            list.add(c1);
        if (counter2 > n)
            list.add(c2);
        return list;
    }
