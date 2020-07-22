class MineSweeper {
    static int[][] minesweeper(boolean[][] matrix) {
        final int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                result[i][j] = 0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j]) {
                    if (i + 1 < matrix.length)
                        result[i + 1][j]++;
                    if (j + 1 < matrix[i].length)
                        result[i][j + 1]++;
                    if (i - 1 >= 0)
                        result[i - 1][j]++;
                    if (j - 1 >= 0)
                        result[i][j - 1]++;
                    if ((i + 1 < matrix.length) && (j + 1 < matrix[i].length))
                        result[i + 1][j + 1]++;
                    if ((i - 1 >= 0) && (j - 1 >= 0))
                        result[i - 1][j - 1]++;
                    if ((i - 1 >= 0) && (j + 1 < matrix[i].length))
                        result[i - 1][j + 1]++;
                    if((i + 1 < matrix.length) && (j - 1 >= 0))
                        result[i + 1][j - 1]++;
                }
        return result;
    }
}
