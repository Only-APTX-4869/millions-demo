package com.zhouyu.aspect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Integer[] a = {1, 6, 7, 0, 0, 0};
        Integer[] b = {2, 4, 6};
        test(a, b, 3, 3);
        System.out.println(Arrays.toString(a));

    }

    public static void test(Integer[] a, Integer[] b, int m, int n) {
        assert a.length >= m + n;


        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Collections.sort(list);
        System.arraycopy(list.toArray(a), 0, a, 0, a.length);
    }
}
