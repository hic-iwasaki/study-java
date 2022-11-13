package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

public class TestUtils {
    
    /**
     * 関数が出力する標準出力をテストする
     * @param func テスト関数
     * @param actual 期待値
     */
    static void std_test(Consumer<Integer> func, String actual) {
        std_test(func, new String[] { actual });
    }

    /**
     * 関数が出力する標準出力をテストする
     * @param func テスト関数
     * @param actual 期待値
     */
    static void std_test(Consumer<Integer> func, String[] actual) {
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

    private static String join_multiline_text(String[] lines) {
        if (lines.length == 0) {
            return "";
        }
        return String.join("\n", lines) + "\n";
    }

}
