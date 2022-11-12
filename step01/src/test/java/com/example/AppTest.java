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
        std_test(
            __ -> class_under_test.q01_print_helloworld(),
            new String[] {
                "Hello World!",
            }
        );
    }

    /**
     * 関数が出力する標準出力をテストする
     * @param func テスト関数
     * @param actual 期待値
     */
    void std_test(Consumer<Integer> func, String[] actual) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream(); PrintStream ps = new PrintStream(bos)) {
            System.setOut(ps);
    
            func.accept(0);
            assertEquals(
                bos.toString(),
                String.join("\n", actual) + "\n");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.setOut(System.out);
        }
    }
}
