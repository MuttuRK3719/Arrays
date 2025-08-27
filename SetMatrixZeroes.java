Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

        

public void setZeroes(int[][] matrix) {
        Queue<Integer> que = new LinkedList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    que.add(i * n + j);
                }
            }
        }
        while (!que.isEmpty()) {
            int rowCol = que.poll(), row = rowCol / n, col = rowCol % n;
            for (int i = 0; i < n; i++) {
                matrix[row][i] = 0;
            }
            for (int j = 0; j < m; j++) {
                matrix[j][col] = 0;
            }
        }
    }
