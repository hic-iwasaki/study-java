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
     * 使われる文字列は正の整数値以外に "+", "-", "×", "÷", "(", ")" があるものとします。
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
     * step.EX: 整数の書かれた文字列を2つ受け取って足し算の答えを返しましょう。
     * 例）
     *  入力: "1", "1"
     *  戻り: "2"
     * @param num1 整数の書かれた文字列
     * @param num2 整数の書かれた文字列
     * @return 計算結果の文字列
     */
    public String addition_string_num(String num1, String num2) {
        return null;
    }

    /**
     * step.EX: 整数の書かれた文字列を2つ受け取って引き算の答えを返しましょう。
     * 例）
     *  入力: "1", "1"
     *  戻り: "0"
     * @param num1 整数の書かれた文字列
     * @param num2 整数の書かれた文字列
     * @return 計算結果の文字列
     */
    public String subtraction_string_num(String num1, String num2) {
        return null;
    }

    /**
     * step.EX: 整数の書かれた文字列を2つ受け取って掛け算の答えを返しましょう。
     * 例）
     *  入力: "2", "3"
     *  戻り: "6"
     * @param num1 整数の書かれた文字列
     * @param num2 整数の書かれた文字列
     * @return 計算結果の文字列
     */
    public String multiplication_string_num(String num1, String num2) {
        return null;
    }

    /**
     * step.EX: 整数の書かれた文字列を2つ受け取って割り算の答えを返しましょう。
     * 例）
     *  入力: "6", "2"
     *  戻り: "3"
     * @param num1 整数の書かれた文字列
     * @param num2 整数の書かれた文字列
     * @return 計算結果の文字列
     */
    public String division_string_num(String num1, String num2) {
        return null;
    }

    /**
     * step.EX: 四則演算の書かれた文字列を受け取って答えを返しましょう。
     * 使われる文字列は正の整数値以外に "+", "-" があるものとします。
     * 例）
     *  入力: "8+7-10"
     *  戻り: 5
     * @param num_text 四則演算の指揮が書かれた文字列
     * @return 計算結果の数値
     */
    public int qEX_calculator01(String formula_text) {
        List<String> words = q90_split_words(formula_text);

        return 0;
    }

    /**
     * step.EX: qEX_calculator01 を改良して掛け算と割り算に対応させましょう。
     * 使われる文字列は正の整数値以外に "+", "-", "×", "÷" があるものとします。
     * また割り算の答えは必ず割り切れるものとします。
     * 例）
     *  入力: "7+12÷2×3"
     *  戻り: 25
     * @param num_text 四則演算の指揮が書かれた文字列
     * @return 計算結果の数値
     */
    public int qEX_calculator02(String formula_text) {
        List<String> words = q90_split_words(formula_text);

        return 0;
    }

    /**
     * step.EX: qEX_calculator01 を改良して括弧に対応させましょう。
     * 使われる文字列は正の整数値以外に "+", "-", "×", "÷", "(", ")" があるものとします。
     * また割り算の答えは必ず割り切れるものとします。
     * 例）
     *  入力: "15+(4-2)×3"
     *  戻り: 21
     * @param num_text 四則演算の指揮が書かれた文字列
     * @return 計算結果の数値
     */
    public int qEX_calculator03(String formula_text) {
        List<String> words = q90_split_words(formula_text);

        return 0;
    }
}
