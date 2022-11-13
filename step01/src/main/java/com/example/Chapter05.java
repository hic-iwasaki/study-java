package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 計算機を作ろう
 */
public final class Chapter05 {

    /**
     * このファイルでプログラムを実行すると、このメソッドからスタートします。
     * 中で他のメソッドを呼び出して、それぞれのメソッドの動作を確認してください。
     * @param args コマンドライン引数。今回は使いません。
     */
    public static void main(String[] args) {

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
     * 四則演算の書かれた文字列を数字と記号で分解しましょう。
     * 使われる文字列数値以外に "+", "-", "×", "÷", "(", ")" があるものとします。
     * 例）
     *  入力: "1*(40-15)"
     *  戻り: {"1", "*", "(", "40", "-", "15", ")"}
     * @param formula_text 四則演算の書かれた文字列
     * @return 数字と記号で構成された文字列のリスト
     */
    public List<String> q90_split_words(String formula_text) {
        return new ArrayList<String>();
    }

    /**
     * step.EX: 四則演算の書かれた文字列を受け取って答えを返しましょう。
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
