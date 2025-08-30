Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

 Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
Example 3:

Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
Explanation: Intervals [1,4] and [4,7] are considered overlapping.

 Input
intervals =
[[1,4],[0,5]]
Output
[[0,5]]
Expected
[[0,5]]

 intervals =
[[1,4],[1,5]]
Output
[[1,5]]
Expected
[[1,5]]

public int[][] merge(int[][] val) {
        Arrays.sort(val, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int k = 0;
        for (int i = 1; i < val.length; i++) {
            if (val[k][1] >= val[i][0] && val[k][1] < val[i][1]) {
                val[k][1] = val[i][1];
            } else if (val[k][1] < val[i][1]) {
                val[++k][0] = val[i][0];
                val[k][1] = val[i][1];
            }
        }
        int[][] result = new int[k + 1][2];
        for (int i = 0; i <= k; i++) {
            result[i][0] = val[i][0];
            result[i][1] = val[i][1];
        }
        return result;
    }
