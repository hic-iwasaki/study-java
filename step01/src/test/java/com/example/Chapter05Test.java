package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

class Chapter05Test {

    @Test
    void test_07_cast_num() {
        Chapter05 class_under_test = new Chapter05();
        assertEquals(class_under_test.q07_cast_num("1"), 1);
        assertEquals(class_under_test.q07_cast_num("183"), 183);
        assertEquals(class_under_test.q07_cast_num("0"), 0);
        assertEquals(class_under_test.q07_cast_num("-1"), -1);
        assertEquals(class_under_test.q07_cast_num("-98941"), -98941);
    }

    @Test
    void test_90_split_words() {
        Chapter05 class_under_test = new Chapter05();
        assertEquals(
            class_under_test.q90_split_words("1+1"),
            Arrays.asList("1", "+", "1"));
        assertEquals(
            class_under_test.q90_split_words("18+110-8×10÷2"),
            Arrays.asList("18", "+", "110", "-", "8", "×", "10", "÷", "2"));
        assertEquals(
            class_under_test.q90_split_words("(1+12)*(55)÷11"),
            Arrays.asList("(", "1", "+", "12", ")", "*", "(", "55", ")", "÷", "11"));
    }

    @Test
    void test_EX_calculator() {
        Chapter05 class_under_test = new Chapter05();
        assertEquals(class_under_test.qEX_calculator("100-140+40"), 0);
        assertEquals(class_under_test.qEX_calculator("9+9×9-10"), 80);
        assertEquals(class_under_test.qEX_calculator("24÷3"), 8);
        assertEquals(class_under_test.qEX_calculator("15+(4-2)×3"), 21);
    }

}
