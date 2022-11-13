package com.example;

/**
 * 練習問題
 */
public final class Chapter01 {

    /**
     * このファイルでプログラムを実行すると、このメソッドからスタートします。
     * 中で他のメソッドを呼び出して、それぞれのメソッドの動作を確認してください。
     * @param args コマンドライン引数。今回は使いません。
     */
    public static void main(String[] args) {
        Chapter01 app = new Chapter01();
        app.print_helloworld();
    }

    /**
     * 標準出力に "Hello World!" と出力しよう。
     * 標準出力には System.out.println() メソッドを使います。
     */
    public void print_helloworld() {

    }

    /**
     * 標準出力に引数から受け取った文字列を出力しよう。
     * 例）
     *  入力: "Hello"
     *  出力: "Hello"
     * @param arg 出力したい文字列
     */
    public void print_argument(String text) {

    }

    /**
     * 標準出力に引数から受け取った数値２つを足した数を出力しよう。
     * 例）
     *  入力: 1, 2
     *  出力: 3
     * @param num1 数値１
     * @param num2 数値２
     */
    public void print_append_nums(int num1, int num2) {

    }

    /**
     * for文を使って受け取った文字列を標準出力に指定回数繰り返し出力しよう。
     * 例）
     *  入力: "Hello", 3
     *  出力: "Hello"
     *  　　  "Hello"
     *  　　  "Hello"
     * @param num 出力する文字列
     * @param count 出力する回数
     */
    public void print_loop_append_nums(String text, int count) {

    }

}
