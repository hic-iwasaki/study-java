package com.example;

import java.util.List;

/**
 * データ型（オブジェクト型）
 */
public final class Chapter03 {

    /**
     * このファイルでプログラムを実行すると、このメソッドからスタートします。
     * 中で他のメソッドを呼び出して、それぞれのメソッドの動作を確認してください。
     * @param args コマンドライン引数。今回は使いません。
     */
    public static void main(String[] args) {

    }

    /**
     * 整数型のリストを生成して、{1, 2, 3} で初期化しましょう。
     * @return 生成したリスト
     */
    public List<Integer> create_list() {
        return null;
    }

    /**
     * 文字列のリストを受け取り、for文で1行ずつ標準出力に出力してください。
     * @param list リスト
     * 例）
     *  入力: { "いちご", "にじ", "さかな" }
     *  出力: "0:れいぞうこ"
     *  　　  "1:いちご"
     *  　　  "2:にじ"
     */
    public void print_loop_list(List<String> list) {

    }

    /**
     * 整数型のリスト {1, 2, 3, 4, 5} を引数で受け取り、{1, 3, 4, 5, 2} と並べ替えましょう。
     * リストのインスタンスを作り直しは禁止とします。
     * @param list 並べ替えるリスト
     * @return 並べ替えたリスト
     */
    public List<Integer> sort_list(List<Integer> list) {
        return list;
    }
}
