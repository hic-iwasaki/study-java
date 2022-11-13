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
    void test_addition_string_num() {
        Chapter05 class_under_test = new Chapter05();
        assertEquals(class_under_test.addition_string_num("2", "43"), "45");
        assertEquals(class_under_test.addition_string_num("9", "6"), "15");
        assertEquals(class_under_test.addition_string_num("999", "-1000"), "-1");
    }

    @Test
    void test_subtraction_string_num() {
        Chapter05 class_under_test = new Chapter05();
        assertEquals(class_under_test.subtraction_string_num("5", "3"), "2");
        assertEquals(class_under_test.subtraction_string_num("100", "-20"), "120");
        assertEquals(class_under_test.subtraction_string_num("23", "50"), "-27");
    }

    @Test
    void test_multiplication_string_num() {
        Chapter05 class_under_test = new Chapter05();
        assertEquals(class_under_test.multiplication_string_num("5", "3"), "15");
        assertEquals(class_under_test.multiplication_string_num("100", "-20"), "-2000");
        assertEquals(class_under_test.multiplication_string_num("23", "50"), "1150");
    }

    @Test
    void test_division_string_num() {
        Chapter05 class_under_test = new Chapter05();
        assertEquals(class_under_test.division_string_num("9", "3"), "3");
        assertEquals(class_under_test.division_string_num("100", "-20"), "-5");
        assertEquals(class_under_test.division_string_num("1024", "32"), "32");
    }

    @Test
    void test_EX_calculator01() {
        Chapter05 class_under_test = new Chapter05();
        assertEquals(class_under_test.qEX_calculator01("100-140+40"), 0);
        assertEquals(class_under_test.qEX_calculator01("8+7-10"), 5);
    }

    @Test
    void test_EX_calculator02() {
        Chapter05 class_under_test = new Chapter05();
        assertEquals(class_under_test.qEX_calculator02("100-140+40"), 0);
        assertEquals(class_under_test.qEX_calculator02("9+9×9-10"), 80);
        assertEquals(class_under_test.qEX_calculator02("24÷3"), 8);
        assertEquals(class_under_test.qEX_calculator02("8+7-10"), 5);
        assertEquals(class_under_test.qEX_calculator02("7+12÷2×3"), 25);
    }

    @Test
    void test_EX_calculator() {
        Chapter05 class_under_test = new Chapter05();
        assertEquals(class_under_test.qEX_calculator03("100-140+40"), 0);
        assertEquals(class_under_test.qEX_calculator03("9+9×9-10"), 80);
        assertEquals(class_under_test.qEX_calculator03("24÷3"), 8);
        assertEquals(class_under_test.qEX_calculator03("15+(4-2)×3"), 21);
        assertEquals(class_under_test.qEX_calculator03("8+7-10"), 5);
        assertEquals(class_under_test.qEX_calculator03("7+12÷2×3"), 25);
    }

}
