package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

/**
 * Unit test for simple App.
 */
class AppTest {

    @Test
    void test_q01_print_helloworld() {
        App class_under_test = new App();
        std_test(__ -> class_under_test.q01_print_helloworld(), "Hello World!");
    }

    @Test
    void test_q02_print_argument() {
        App class_under_test = new App();
        std_test(
            __ -> class_under_test.q02_print_argument("吾輩わがはいは猫である。名前はまだ無い。"),
            "吾輩わがはいは猫である。名前はまだ無い。");
        std_test(
            __ -> class_under_test.q02_print_argument("どこで生れたかとんと見当けんとうがつかぬ。"),
            "どこで生れたかとんと見当けんとうがつかぬ。");
        std_test(
            __ -> class_under_test.q02_print_argument("何でも薄暗いじめじめした所でニャーニャー泣いていた事だけは記憶している。"),
            "何でも薄暗いじめじめした所でニャーニャー泣いていた事だけは記憶している。");
    }

    @Test
    void test_q03_print_append_nums() {
        App class_under_test = new App();
        std_test(__ -> class_under_test.q03_print_append_nums(1, 2), "3");
        std_test(__ -> class_under_test.q03_print_append_nums(1230, 123), "1353");
        std_test(__ -> class_under_test.q03_print_append_nums(10, -100), "-90");
    }

    @Test
    void test_q04_print_loop_append_nums() {
        App class_under_test = new App();
        std_test(
            __ -> class_under_test.q04_print_loop_append_nums("ヤッホー", 5),
            new String[] {
                "ヤッホー",
                "ヤッホー",
                "ヤッホー",
                "ヤッホー",
                "ヤッホー",
            });
        std_test(
            __ -> class_under_test.q04_print_loop_append_nums("ヤッホー", 0),
            new String[0]);
    }

    @Test
    void test_q05_print_if_sign() {
        App class_under_test = new App();
        std_test(__ -> class_under_test.q05_print_if_sign(1), "正");
        std_test(__ -> class_under_test.q05_print_if_sign(183), "正");
        std_test(__ -> class_under_test.q05_print_if_sign(0), "ゼロ");
        std_test(__ -> class_under_test.q05_print_if_sign(-1), "負");
        std_test(__ -> class_under_test.q05_print_if_sign(-98941), "負");
    }

    @Test
    void test_06_print_over100 () {
        App class_under_test = new App();
        std_test(__ -> class_under_test.q06_print_over100(100), "100以上");
        std_test(__ -> class_under_test.q06_print_over100(99), "正");

        std_test(__ -> class_under_test.q06_print_over100(1), "正");
        std_test(__ -> class_under_test.q06_print_over100(183), "100以上");
        std_test(__ -> class_under_test.q06_print_over100(0), "ゼロ");
        std_test(__ -> class_under_test.q06_print_over100(-1), "負");
        std_test(__ -> class_under_test.q06_print_over100(-98941), "負");
    }

    @Test
    void test_07_cast_num() {
        App class_under_test = new App();
        assertEquals(class_under_test.q07_cast_num("1"), 1);
        assertEquals(class_under_test.q07_cast_num("183"), 183);
        assertEquals(class_under_test.q07_cast_num("0"), 0);
        assertEquals(class_under_test.q07_cast_num("-1"), -1);
        assertEquals(class_under_test.q07_cast_num("-98941"), -98941);
    }

    @Test
    void test_EX_calculator() {
        App class_under_test = new App();
        assertEquals(class_under_test.qEX_calculator("100-140+40"), 0);
        assertEquals(class_under_test.qEX_calculator("9+9×9-10"), 80);
        assertEquals(class_under_test.qEX_calculator("24÷3"), 8);
        assertEquals(class_under_test.qEX_calculator("15+(4-2)×3"), 21);
    }

    /**
     * 関数が出力する標準出力をテストする
     * @param func テスト関数
     * @param actual 期待値
     */
    private void std_test(Consumer<Integer> func, String actual) {
        std_test(func, new String[] { actual });
    }

    /**
     * 関数が出力する標準出力をテストする
     * @param func テスト関数
     * @param actual 期待値
     */
    private void std_test(Consumer<Integer> func, String[] actual) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream(); PrintStream ps = new PrintStream(bos)) {
            System.setOut(ps);
    
            func.accept(0);
            assertEquals(bos.toString(), join_multiline_text(actual));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.setOut(System.out);
        }
    }

    private String join_multiline_text(String[] lines) {
        if (lines.length == 0) {
            return "";
        }
        return String.join("\n", lines) + "\n";
    }
}
