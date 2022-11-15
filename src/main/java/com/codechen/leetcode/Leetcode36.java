package com.codechen.leetcode;

public class Leetcode36 {

    public static void main(String[] args) {
        System.out.println(1 / 3);
    }

    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][10];
        int[][] col = new int[9][10];
        int[][] box = new int[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int curNum = board[i][j] - '0';
                if (row[i][curNum] == 1) {
                    return false;
                }
                if (col[j][curNum] == 1) {
                    return false;
                }
                if (box[(i / 3) * 3 + (j / 3)][curNum] == 1) {
                    return false;
                }
                row[i][curNum] = 1;
                col[j][curNum] = 1;
                box[(i / 3) * 3 + (j / 3)][curNum] = 1;
            }
        }
        return true;
    }
}
