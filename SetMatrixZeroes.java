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
