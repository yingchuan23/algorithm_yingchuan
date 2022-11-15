package com.codechen.jianzhioffer;

public class Offer12 {


    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (back(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean back(char[][] board, String word, int i, int j, int k) {
        int row = board.length;
        int column = board[0].length;
        int length = word.length();
        if (i >= row || i < 0 || j >= column || j < 0 || word.charAt(k) != board[i][j]) {
            return false;
        }
        if (k == length -1) {
            return true;
        }

        board[i][j] = '*';

        boolean back = back(board, word, i + 1, j, k + 1) || back(board, word, i - 1, j, k + 1) || back(board, word, i, j + 1, k + 1) || back(board, word, i, j - 1, k + 1);

        board[i][j] = word.charAt(k);

        return back;
    }

}
