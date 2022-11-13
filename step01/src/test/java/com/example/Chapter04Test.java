package com.example;

import org.junit.jupiter.api.Test;

class Chapter04Test {

    @Test
    void test_print_if_sign() {
        Chapter04 class_under_test = new Chapter04();
        TestUtils.std_test(__ -> class_under_test.print_if_sign(1), "正");
        TestUtils.std_test(__ -> class_under_test.print_if_sign(183), "正");
        TestUtils.std_test(__ -> class_under_test.print_if_sign(0), "ゼロ");
        TestUtils.std_test(__ -> class_under_test.print_if_sign(-1), "負");
        TestUtils.std_test(__ -> class_under_test.print_if_sign(-98941), "負");
    }

    @Test
    void test_print_over100 () {
        Chapter04 class_under_test = new Chapter04();
        TestUtils.std_test(__ -> class_under_test.print_over100(100), "100以上");
        TestUtils.std_test(__ -> class_under_test.print_over100(99), "正");

        TestUtils.std_test(__ -> class_under_test.print_over100(1), "正");
        TestUtils.std_test(__ -> class_under_test.print_over100(183), "100以上");
        TestUtils.std_test(__ -> class_under_test.print_over100(0), "ゼロ");
        TestUtils.std_test(__ -> class_under_test.print_over100(-1), "負");
        TestUtils.std_test(__ -> class_under_test.print_over100(-98941), "負");
    }

    @Test
    void test_equality_object() {
        Chapter04 class_under_test = new Chapter04();
        String text1 = new String("abc");
        String text2 = new String("abc");
        String text3 = text1;
        TestUtils.std_test(__ -> class_under_test.print_equality_object(text1, text1), "等値");
        TestUtils.std_test(__ -> class_under_test.print_equality_object(text1, text2), new String[0]);
        TestUtils.std_test(__ -> class_under_test.print_equality_object(text1, text3), "等値");
        TestUtils.std_test(__ -> class_under_test.print_equality_object(text2, text3), new String[0]);
    }

    @Test
    void test_equivalent_object() {
        Chapter04 class_under_test = new Chapter04();
        TestUtils.std_test(__ -> class_under_test.print_equivalent_object(new String("あいうえお"), new String("あいうえお")), "等価");
        TestUtils.std_test(__ -> class_under_test.print_equivalent_object(new String("あいうえお"), new String("かきくけこ")), new String[0]);
        TestUtils.std_test(__ -> class_under_test.print_equivalent_object(new String("あいえお"), new String("あいうえお")), new String[0]);
        TestUtils.std_test(__ -> class_under_test.print_equivalent_object(new String("あいうえお"), new String("あいうえ")), new String[0]);
    }

}
