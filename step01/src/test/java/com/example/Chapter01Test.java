package com.example;

import org.junit.jupiter.api.Test;

class Chapter01Test {

    @Test
    void test_print_helloworld() {
        Chapter01 class_under_test = new Chapter01();
        TestUtils.std_test(__ -> class_under_test.print_helloworld(), "Hello World!");
    }

    @Test
    void test_print_argument() {
        Chapter01 class_under_test = new Chapter01();
        TestUtils.std_test(
            __ -> class_under_test.print_argument("吾輩わがはいは猫である。名前はまだ無い。"),
            "吾輩わがはいは猫である。名前はまだ無い。");
        TestUtils.std_test(
            __ -> class_under_test.print_argument("どこで生れたかとんと見当けんとうがつかぬ。"),
            "どこで生れたかとんと見当けんとうがつかぬ。");
        TestUtils.std_test(
            __ -> class_under_test.print_argument("何でも薄暗いじめじめした所でニャーニャー泣いていた事だけは記憶している。"),
            "何でも薄暗いじめじめした所でニャーニャー泣いていた事だけは記憶している。");
    }

    @Test
    void test_print_append_nums() {
        Chapter01 class_under_test = new Chapter01();
        TestUtils.std_test(__ -> class_under_test.print_append_nums(1, 2), "3");
        TestUtils.std_test(__ -> class_under_test.print_append_nums(1230, 123), "1353");
        TestUtils.std_test(__ -> class_under_test.print_append_nums(10, -100), "-90");
    }

    @Test
    void test_print_loop_append_nums() {
        Chapter01 class_under_test = new Chapter01();
        TestUtils.std_test(
            __ -> class_under_test.print_loop_append_nums("ヤッホー", 5),
            new String[] {
                "ヤッホー",
                "ヤッホー",
                "ヤッホー",
                "ヤッホー",
                "ヤッホー",
            });
        TestUtils.std_test(
            __ -> class_under_test.print_loop_append_nums("ヤッホー", 0),
            new String[0]);
    }

}
