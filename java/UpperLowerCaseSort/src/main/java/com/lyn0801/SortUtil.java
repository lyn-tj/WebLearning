package com.lyn0801;

/**
 * 排序工具类
 *
 * @author lyn0801
 * @since 2018/9/26
 * @version 1.0
 */
public class SortUtil {
    /**
     * 冒泡排序法
     * @param data 需要排序的String类型数组
     */
    public static void sort(String[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (compare(data[j], data[j - 1]) < 0) {
                    String temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }


    /**
     *
     * @param first 需要比较的第一个字符串
     * @param second 需要比较的第二个字符串
     * @return
     */
    public static int compare(String first, String second) {
        int length = first.length() < second.length() ? first.length() : second.length();
        int mark = 0xffdf; // 1...1,1101,1111，转换第6位
        for (int i = 0; i < length; i++) {

            char f = first.charAt(i);
            char s = second.charAt(i);
            if (f == s) {
                continue;
            }
            // 这儿小写转大写
            // 注意空格的情况
            //空格会在大小写字母前面
            f = (char) (f & mark);
            s = (char) (s & mark);
//            System.out.println(first.charAt(i) + "->" + f + " " + second.charAt(i) + "->" + s);
            // f = (f < 'a' && f >= 'A') ? f : (char) (f - 'a' + 'A');
            // s = (s < 'a' && s >= 'A') ? s : (char) (s - 'a' + 'A');

            if (f < s) {
                return -1;
            } else if (f > s) {
                return 1;
            } else {
                // 下面的代码注意，大于返回-1.小于返回1，a 在 A 前面，b 在 B 前面，小写字母排在在大写字母前面
                //自己的方法是把 a 排在 A 前面，和类库相反
                return first.charAt(i) > second.charAt(i) ? -1 : 1;
            }
        }

        return first.length() < second.length() ? -1 : first.length() > second.length() ? 1 : 0;
    }

    public static void main(String[] args) {
        String[] s = {"1", "12", "123", "a", "a b", "AB", "aC", "Ad", "b", "BA", "BB", "c", "啊", "啊吧"};
        sort(s);
        for(String str : s){
            System.out.println(str);
        }
    }
}
