/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter01.ex09;

/**
 * 第１章 問題８
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	/**
	 * 実行コマンド　java main java one two
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * mainメソッドの配列引数 args　に java one twoの
		 * ３つの値を渡しています。
		 * この様な引数を『起動パラメータ』や『コマンドライン引数』
		 * と呼びます。 
		 * また、mainメソッドの様な処理の始めるためのメソッドを
		 * 『エントリーポイント』と呼びます。
		 */
		System.out.println(args[0] + " " + args[1]);
	}
}
