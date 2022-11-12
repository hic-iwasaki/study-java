package com.example;

public final class App {

    public static void main(String[] args) {
        App app = new App();
        app.q01_print_helloworld();
    }

    /**
     * step.01: 標準出力に "Hello World!" と出力しよう。
     * 標準出力には System.out.println() メソッドを使います。
     */
    public void q01_print_helloworld() {

    }

    /**
     * step.02: 標準出力に引数から受け取った文字列を出力しよう。
     * 例）
     *  入力: "Hello"
     *  出力: "Hello"
     * @param arg 出力したい文字列
     */
    public void q02_print_argument(String text) {

    }

    /**
     * step.03: 標準出力に引数から受け取った数値２つを足した数を出力しよう。
     * 例）
     *  入力: 1, 2
     *  出力: 3
     * @param num1 数値１
     * @param num2 数値２
     */
    public void q03_print_append_nums(int num1, int num2) {

    }

    /**
     * step.04: for文を使って受け取った文字列を標準出力に指定回数繰り返し出力しよう。
     * 例）
     *  入力: "Hello", 3
     *  出力: "Hello"
     *  　　  "Hello"
     *  　　  "Hello"
     * @param num 出力する文字列
     * @param count 出力する回数
     */
    public void q04_print_loop_append_nums(String text, int count) {

    }

    /**
     * step.05: if文を使って受け取った数値が
     * プラスの値なら "正"、
     * マイナスの値なら "負"、
     * 0 なら "ゼロ" と出力しよう。
     * 例）
     *  入力: -1
     *  出力: "負"
     * @param num 数値
     */
    public void q05_print_if_sign(int num) {

    }

    /**
     * step.06: step.05 を改良して元の条件に加えて 100 以上の値なら "正" の代わりに "100以上" と出力しよう。
     * 例）
     *  入力: 100
     *  出力: "100以上"
     * @param num 数値
     */
    public void q06_print_over100(int num) {

    }

    /**
     * step.07: 数値の書かれた文字列を受け取り、数値型に変換して戻り値に返しましょう。
     * 例）
     *  入力: "100"
     *  戻り: 100
     * @param num_text 数値の書かれた文字列
     * @return 数値型に変換した値
     */
    public int q07_cast_num(String num_text) {
        return 0;
    }

    /**
     * step.99: 四則演算の書かれた文字列を受け取って答えを返しましょう。
     * 使われる文字列数値以外に "+", "-", "×", "÷", "(", ")" があるものとします。
     * 例）
     *  入力: "15+(4-2)×3"
     *  戻り: 21
     * @param num_text 四則演算の指揮が書かれた文字列
     * @return 数値型に変換した値
     */
    public int qEX_calculator(String formula_text) {
        return 0;
    }
}
