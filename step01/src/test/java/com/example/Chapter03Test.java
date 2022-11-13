package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Chapter03Test {

    @Test
    void test_create_list() {
        Chapter03 chapter03 = new Chapter03();
        List<Integer> list = chapter03.create_list();
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    void test_print_loop_list() {
        Chapter03 chapter03 = new Chapter03();
        final List<String> list1 = new ArrayList<>();
        list1.add("れいぞうこ");
        list1.add("いちご");
        list1.add("にじ");
        TestUtils.std_test(__ -> chapter03.print_loop_list(list1), new String[] { "0:れいぞうこ", "1:いちご", "2:にじ" });

        final List<String> list2 = new ArrayList<>();
        list2.add("にじ");
        list2.add("れいぞうこ");
        TestUtils.std_test(__ -> chapter03.print_loop_list(list2), new String[] { "0:にじ", "1:れいぞうこ" });
    }

    @Test
    void test_sort_list() {
        Chapter03 chapter03 = new Chapter03();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> sorted = chapter03.sort_list(list);
        assertTrue(list == sorted, "インスタンスが作り直されています");
        assertEquals(sorted.size(), 5);
        assertEquals(sorted.get(0), 1);
        assertEquals(sorted.get(1), 3);
        assertEquals(sorted.get(2), 4);
        assertEquals(sorted.get(3), 5);
        assertEquals(sorted.get(4), 2);
    }
}
