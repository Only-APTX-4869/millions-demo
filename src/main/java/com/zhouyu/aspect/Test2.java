package com.zhouyu.aspect;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        int i = 0;
        int a[] = {3, 6, 4, 8, 5, 6};
        do {
            a[i] -= 3;
        } while (a[i++] < 4);
        for (i = 0; i < 6; i++) {
            System.out.printf("%d", a[i]);
        }

    }

    public static void arrayMerge(int[] a, int[] b, int m, int n) {
// 若数据不合规则抛出异常（题中说明部分的第2步）
        assert a.length >= m + n;
// 合并数组
        System.arraycopy(b, 0, a, m, n);
// 元素排序
        Arrays.sort(a);
    }
}
