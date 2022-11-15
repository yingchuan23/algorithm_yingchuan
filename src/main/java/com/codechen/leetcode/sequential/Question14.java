package com.codechen.leetcode.sequential;

/**
 * @description: 最长公共前缀
 * @method:  下面是横向检查的方法，具体请查看 leetcode第14题
 * @author: CodeJ
 * @create: 2021-05-31 20:36
 **/
public class Question14 {


    public String longestCommonPrefix(String[] strs){
        /*当不存在的时候*/  /*还有这里为什么写了strs.length还是要写  strs == null   因为
         strs他如果不唯恐的时候  还可能是空的   不指任何对象   这个也是我们要避免的 所以*/
        if (strs == null || strs.length == 0) {
            return "";
        }
        /*首先木人第一个字符串是最长公共数组*/
        String prefix = strs[0];

        int length = strs.length;

        for (int i = 1; i < length; i++) {

            prefix = longestCommonPrefix(prefix, strs[i]);

            if (prefix.length() == 0){
                break;
            }

        }

        return prefix;

    }

    private String longestCommonPrefix(String prefix, String str) {
        int len = Math.min(prefix.length(), str.length());
        int index = 0;
        while (index < len && prefix.charAt(index) == str.charAt(index)){
            index++;
        }
        return prefix.substring(0, index);
    }

}
