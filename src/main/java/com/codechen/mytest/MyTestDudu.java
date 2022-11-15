package com.codechen.mytest;



public class MyTestDudu {

    public static void main(String[] args) {

    }


    public void reorderSpaces(String text) {

        int length = text.length();
        String[] words = text.trim().split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }

    }
}
