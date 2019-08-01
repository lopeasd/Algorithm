package com.learn.search;

/**
 * @Description 暴力字符串匹配，普通模式匹配
 * @Author shixiaofei
 * @Date 2019/5/8 9:06
 * @Version 1.0
 */
public class BF {
    public static void main(String[] args) {
        String a = "abcdefg";
        String b = "cd";
        BF t = new BF();
        System.out.println(t.bf(a, b));
        System.out.println(t.test01(a,b));        ;
    }
    public boolean bf(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 < len2) return false;
        for (int i = 0; i <= len1 - len2; i++) {
            if (test(str1, i, str2)) return true;
        }
        return false;
    }

    public boolean test(String str1, int i, String str2) {

        for (int j = 0; j < str2.length(); j++) {
            if (str2.charAt(j) != str1.charAt(i++)) return false;
        }
        return true;
    }

    //abc 3 ab2
    public int test01(String str1, String str2) {
        if (str1.length() >= str2.length()) {
            //记录str1的位置
            int start = 0;
            //记录str2的位置
            int count = 0;
            while (start <= (str1.length() - str2.length())) {

                if (str1.charAt(start + count) == str2.charAt(count)) {
                    count++;
                } else {
                    start++;
                    count = 0;
                }
                if (count == str2.length()) return start;
            }
        }
        return -1;
    }

}
